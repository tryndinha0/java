package dio.com.junit;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import dio.com.junit.model.Pessoa;

public class AssertionsTeste {
    @Test
    public void validarLancamento(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLançamento = {-1,5,2,3,10};

        Assertions.assertThat(primeiroLancamento).isNotEqualTo(segundoLançamento);
    }

    @Test
    public void validarSeObjetoNulo(){
        Pessoa pessoa = null;

        Assertions.assertThat(pessoa).isNull();;
    }

    @Test
    public void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        int outroValor = 5;

        Assertions.assertThat(valor).isEqualTo(outroValor);
    }
}
