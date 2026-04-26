import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraIMCTest {
    private final CalculadoraIMC calculadora = new CalculadoraIMC();

    @Test
    public void deveRetornarClassificacaoMagreza() {
        // Cenário: Pessoa com 50kg e 1.75m de altura
        double imc = calculadora.calcular(50.0, 1.75);
        // IMC esperado: ~16.32

        String resultado = calculadora.classificar(imc);
        System.out.println("Resultado obtido: " + resultado);
        System.out.println("-------------------------------------------------");
        assertEquals("Magreza", resultado, "O IMC menor que 18,5 deve ser classificado como Magreza");
    }

    @Test
    public void deveRetornarClassificacaoNormal() {
        // Cenário: Pessoa com 70kg e 1.75m de altura
        double imc = calculadora.calcular(70.0, 1.75);
        // IMC esperado: ~22.86

        String resultado = calculadora.classificar(imc);
        System.out.println("Resultado obtido: " + resultado);
        System.out.println("-------------------------------------------------");
        assertEquals("Normal", resultado, "O IMC entre 18,5 e 24,9 deve ser classificado como Normal");
    }

    @Test
    public void deveRetornarClassificacaoSobrepeso() {
        // pessoa com 85kg e 1.75 de altura
        double imc = calculadora.calcular(85.0, 1.75);
        // IMC esperado: ~27.75

        String resultado = calculadora.classificar(imc);
        System.out.println("Resultado obtido: " + resultado);
        System.out.println("-------------------------------------------------");
        assertEquals("Sobrepeso", resultado, "O IMC entre 25 e 29,9 deve ser classificado como Sobrepeso");
    }
    @Test
    public void deveRetornarClassificacaoObesidadeGrauI() {
        // pessoa com 95kg e 1.75 de altura
        double imc = calculadora.calcular(95.0, 1.75); // ~31.02
        String resultado = calculadora.classificar(imc);

        System.out.println("Resultado obtido: " + resultado);
        System.out.println("-------------------------------------------------");
        assertEquals("Obesidade grau I", resultado, "O IMC entre 30 e 34,9 deve ser classificado como Obesidade grau I");
    }

    @Test
    public void deveRetornarClassificacaoObesidadeGrauII() {
        // pessoa com 115kg e 1.75m de altura
        double imc = calculadora.calcular(115.0, 1.75); // ~37.55
        String resultado = calculadora.classificar(imc);

        System.out.println("Resultado obtido: " + resultado);
        System.out.println("-------------------------------------------------");
        assertEquals("Obesidade grau II", resultado, "O IMC entre 35 e 39,9 deve ser classificado como Obesidade grau II");
    }

    @Test
    public void deveRetornarClassificacaoObesidadeGrauIII() {
        //pessoa com 130kg e 1.75m de altura
        double imc = calculadora.calcular(130.0, 1.75); // ~42.44
        String resultado = calculadora.classificar(imc);

        System.out.println("Resultado obtido: " + resultado);
        System.out.println("-------------------------------------------------");
        assertEquals("Obesidade grau III", resultado, "O IMC maior que 40 deve ser classificado como Obesidade grau III");
    }
}
