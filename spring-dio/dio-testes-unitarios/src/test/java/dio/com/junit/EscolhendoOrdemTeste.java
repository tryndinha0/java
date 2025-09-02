package dio.com.junit;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoOrdemTeste {

    @Order(4)
    @Test
    public void validaFluxoA(){
        Assertions.assertThat(true);
    }
    @Order(3)
    @Test
    public void validaFluxoB(){
        Assertions.assertThat(true);
    }
    @Order(2)
    @Test
    public void validaFluxoC(){
        Assertions.assertThat(true);
    }
    @Order(1)
    @Test
    public void validaFluxoD(){
        Assertions.assertThat(true);
    };
}
