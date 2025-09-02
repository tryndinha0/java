package dio.com.junit;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {
    //@EnabledIfEnvironmentVariable(named = "USER", matches = "daniel")
    @Test
    // @EnabledOnOs(OS.LINUX)
    public void validarAlgoSomenteNoUsuarioDaniel(){
        Assertions.assertThat(10).isEqualTo(5+5);
    }
}
