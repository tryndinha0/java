package dio.com.junit;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.Assumptions;
import org.junit.Test;

public class AssumptionsTeste {
    
    @Test
    public void validarAlgoSomenteNoUsuarioDaniel(){
        Assumptions.assumeThat("root".equals(System.getenv("USER")));
        Assertions.assertThat(10).isEqualTo(5+5);
    }
}
