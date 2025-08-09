package facade;

import subsistema1_crm.CrmService;
import subsistema2_cep.CepApi;

public class Facade {
    public void migrarCilente(String nome, String cep){
        String cidade = CepApi.getInstacia().recuperarCidade(cep);
        String estado = CepApi.getInstacia().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
