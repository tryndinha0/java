package subsistema2_cep;
public class CepApi {
    private static CepApi instancia;

    private CepApi(){
        super();
    }

    public static CepApi getInstacia(){
        if(instancia == null){
            instancia = new CepApi();
        }
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Araraquara";
    }
    public String recuperarEstado(String cep){
        return "SP";
    }
}
