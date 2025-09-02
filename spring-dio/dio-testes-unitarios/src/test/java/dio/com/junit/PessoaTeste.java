package dio.com.junit;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import dio.com.junit.model.Pessoa;

public class PessoaTeste {
    @Test
    public void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("daniel",LocalDate.of(2023, 7, 18));
        Assertions.assertThat(pessoa.getIdade()).isEqualTo(2);
    }
    
}
