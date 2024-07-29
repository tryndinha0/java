package exercicios.DESAFIOS.desafios2;

 class ConversorMoeda implements ConversaoFinanceira{
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.converterDolarParaReal(10, 5);
    }



    @Override
    public void converterDolarParaReal(double valorDolar,double cambio) {
        double convertido =valorDolar * cambio;
        System.out.println(String.format("O valor de %.2f dolares em reais é %.2f", valorDolar, convertido));
    }
    
    
}
