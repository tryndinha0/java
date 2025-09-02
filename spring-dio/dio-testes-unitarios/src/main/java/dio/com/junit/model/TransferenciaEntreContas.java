package dio.com.junit.model;

public class TransferenciaEntreContas {
    
    public void transfere(Conta contaOrigem, Conta contaDestino,int valor){
        if(valor<=0){
            throw new IllegalArgumentException("O valor deve ser maior que 0");
        }
    }
}
