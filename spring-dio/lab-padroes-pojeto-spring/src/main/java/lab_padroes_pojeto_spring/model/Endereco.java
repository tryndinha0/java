package lab_padroes_pojeto_spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Endereco {
    @Id
    private String cep;
    private String logradouro,complemento,bairro,localidade,uf,ibge,gia,ddd,siafi;
    public String getCep() {
        return cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public String getLocalidade() {
        return localidade;
    }
    public String getUf() {
        return uf;
    }
    public String getIbge() {
        return ibge;
    }
    public String getGia() {
        return gia;
    }
    public String getDdd() {
        return ddd;
    }
    public String getSiafi() {
        return siafi;
    }

    
}
