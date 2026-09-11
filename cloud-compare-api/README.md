# cloud-compare-api

Aplicação de referência (API REST) usada no TCC *"Comparação prática entre AWS, Azure e
Google Cloud no deploy de uma aplicação web: análise de desempenho, custo, escalabilidade e
usabilidade"*. É a mesma aplicação, sem alterações, implantada nos três provedores — a
comparabilidade dos resultados depende disso.

## Decisões de arquitetura (e por quê)

| Decisão | Motivo |
|---|---|
| Java 17 + Spring Boot 3 | Corresponde ao que já está descrito na metodologia do TCC (Seção 3.2). |
| Arquitetura em camadas (Controller → Service → Repository) | Isola regra de negócio de infraestrutura; facilita testar e trocar peças sem reescrever a API. |
| PostgreSQL como banco | É o único motor com serviço gerenciado **equivalente e com o mesmo nome de mecanismo** nos três provedores: Amazon RDS for PostgreSQL, Azure Database for PostgreSQL e Cloud SQL for PostgreSQL. Evita comparar "maçãs com laranjas" (ex.: RDS MySQL vs. Azure SQL Server). |
| Toda configuração de ambiente via variável de ambiente (`DB_HOST`, `DB_PORT`, `DB_NAME`, `DB_USER`, `DB_PASSWORD`, `SERVER_PORT`) | Nenhuma diferença de código ou de perfil Spring entre os três provedores — só muda o *valor* das variáveis. Isso é o que sustenta a alegação de "condições de teste equivalentes" na metodologia. |
| Empacotamento em imagem Docker (multi-stage build) | A mesma imagem roda igual em uma EC2, em uma Azure VM ou em uma Compute Engine — elimina diferenças de JDK, SO ou dependências entre os ambientes como variável de confusão do experimento. |
| Spring Boot Actuator (`/actuator/health`) | Endpoint de health check padrão, compatível com o health check de load balancer/monitoramento dos três provedores (Seção 3.5 — CloudWatch, Azure Monitor, Cloud Monitoring). |
| Bean Validation + `@RestControllerAdvice` | Erros de validação e "não encontrado" sempre no mesmo formato JSON, o que facilita o JMeter fazer asserções idênticas nos três ambientes. |

## Estrutura

Pacote base `br.tcc`, separado por camada (a organização que você já usa nos seus
projetos):

```
src/main/java/br/tcc/
├── CloudCompareApiApplication.java   ponto de entrada
├── controller/     ProductController.java            endpoints REST
├── service/        ProductService.java, impl/ProductServiceImpl.java   regra de negócio
├── repository/     ProductRepository.java             acesso a dados (Spring Data JPA)
├── model/          Product.java                       entidade JPA
├── dto/            ProductRequestDTO / ProductResponseDTO / ErrorResponseDTO
├── mapper/         ProductMapper.java                  conversão entidade <-> DTO
├── exception/      GlobalExceptionHandler.java, ResourceNotFoundException.java
└── config/         OpenApiConfig.java                  configuração do Swagger
```

Recurso exposto: `products`, com as quatro operações CRUD citadas na metodologia
(cadastro, consulta, alteração, exclusão):

| Método | Caminho | Descrição |
|---|---|---|
| POST | `/api/v1/products` | cria um produto |
| GET | `/api/v1/products` | lista produtos (paginado) |
| GET | `/api/v1/products/{id}` | consulta um produto |
| PUT | `/api/v1/products/{id}` | atualiza um produto |
| DELETE | `/api/v1/products/{id}` | remove um produto |
| GET | `/actuator/health` | health check |
| GET | `/swagger-ui.html` | documentação interativa |

## Rodando localmente

```bash
docker compose up --build
curl http://localhost:8080/api/v1/products
```

Isso sobe um Postgres local só para desenvolvimento — em produção o banco é sempre o
serviço gerenciado do provedor, nunca um container de banco.

## Build da imagem para publicar em um registry

```bash
docker build -t cloud-compare-api:1.0.0 .
```

Publique essa mesma imagem (ex.: `docker tag` + `docker push`) em um registry acessível
pelos três provedores (Docker Hub, ou o registry de cada nuvem) antes de implantar.

## Roteiro de deploy (equivalente nos três provedores)

Em todos os casos, o esqueleto é o mesmo: uma VM com Docker instalado, rodando esta
imagem, apontando para um banco PostgreSQL gerenciado — só muda o nome dos serviços.

**1. Banco de dados gerenciado (crie primeiro, para ter host/porta/credenciais):**
- AWS: Amazon RDS for PostgreSQL
- Azure: Azure Database for PostgreSQL — Flexible Server
- Google Cloud: Cloud SQL for PostgreSQL

Use a mesma classe de instância (vCPU/RAM) e o mesmo tamanho de disco nos três, conforme
o Quadro de ambientes de nuvem da metodologia (Seção 3.3).

**2. Máquina virtual de computação:**
- AWS: instância Amazon EC2 (Amazon Linux ou Ubuntu) com Docker instalado
- Azure: Azure Virtual Machine (Ubuntu Server) com Docker instalado
- Google Cloud: instância do Compute Engine (Container-Optimized OS ou Ubuntu) com Docker instalado

Use o mesmo tipo/tamanho de instância (vCPU/RAM equivalentes) nos três provedores.

**3. Subir o container**, apontando para o banco gerenciado do passo 1:

```bash
docker run -d --name cloud-compare-api -p 8080:8080 \
  -e DB_HOST=<endpoint do banco gerenciado> \
  -e DB_PORT=5432 \
  -e DB_NAME=cloudcompare \
  -e DB_USER=<usuario> \
  -e DB_PASSWORD=<senha> \
  <sua-imagem>:1.0.0
```

**4. Liberar rede**: abrir a porta 8080 (ou a porta escolhida) no security group /
network security group / firewall de cada provedor, e liberar a porta 5432 apenas entre a
VM e o banco (não para a internet).

**5. Monitoramento**: apontar CloudWatch / Azure Monitor / Cloud Monitoring para o
endpoint `/actuator/health` e para os logs do container — usado na Seção 3.5
(Ferramentas) e na avaliação de usabilidade (Seção 3.6).

> As instruções acima são propositalmente descritas no nível de serviço, não de
> clique-a-clique no console, porque a interface de cada provedor muda com frequência.
> Documente no Apêndice B do TCC o passo a passo exato e as configurações efetivamente
> usadas (tipo de instância, região, versão do PostgreSQL etc.), como já é pedido lá.

## Testes de carga (JMeter)

`loadtest/plano-de-teste.jmx` é um ponto de partida: uma Thread Group de 20 usuários
simulados, 50 iterações cada, fazendo GET em `/api/v1/products`, com variáveis `HOST` e
`PORT` para apontar rapidamente para cada ambiente.

Abra no JMeter (GUI ou linha de comando), ajuste `HOST`/`PORT` para cada provedor e
adicione os cenários que faltam para a Seção 3.4 (POST/PUT/DELETE, diferentes níveis de
carga, um `CSV Data Set Config` para variar os dados enviados):

```bash
jmeter -n -t loadtest/plano-de-teste.jmx -JHOST=<ip-ou-dominio> -JPORT=8080 -l loadtest/resultados.csv
```

## Testes automatizados

```bash
./mvnw test
```

Os testes usam H2 em memória (perfil `test`), então não dependem de nenhum banco
externo nem de qual provedor está rodando a aplicação.
