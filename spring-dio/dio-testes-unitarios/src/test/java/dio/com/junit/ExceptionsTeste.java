package dio.com.junit;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import dio.com.junit.model.Conta;
import dio.com.junit.model.TransferenciaEntreContas;

public class ExceptionsTeste {
    
    @Test
    public void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456",0);
        Conta contaDestino = new Conta("532342",1000);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.catchIllegalArgumentException(() -> transferenciaEntreContas.transfere(contaDestino,contaOrigem,-1));
    }
}
