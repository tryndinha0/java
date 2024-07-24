package exercicios;

public class CelsiusParaFahrenheit{
    public static void main(String[] args){
        int temperatura = 100;
        double formula = (temperatura *1.8) + 32;
        String mensagem = String.format("A temperatura %d em Celsius é %f em Fahrenheit",temperatura,formula);

        System.out.println(mensagem);

        int inteiro = (int) formula;

        System.out.println("A temperatura fahrenheit em inteiro é: " + inteiro);

    }
}