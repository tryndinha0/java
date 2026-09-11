package br.tcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * A mesma imagem gerada a partir desta aplicacao e implantada, sem alteracoes,
 * na AWS, no Microsoft Azure e no Google Cloud. Toda a configuracao especifica
 * de cada ambiente (host do banco, credenciais, porta) e injetada por variaveis
 * de ambiente, nunca por codigo ou por perfis distintos por provedor.
 */
@SpringBootApplication
public class CloudCompareApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudCompareApiApplication.class, args);
    }
}
