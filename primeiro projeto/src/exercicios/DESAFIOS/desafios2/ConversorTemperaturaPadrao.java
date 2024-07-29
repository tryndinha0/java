package exercicios.DESAFIOS.desafios2;

class ConversorTemperaturaPadrao implements ConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao(); 
            conversorTemperatura.celsiusParaFahrenheit(15);
        conversorTemperatura.fahrenheitparaCelsius(40);
    }
    @Override
    public void celsiusParaFahrenheit(int celsius) {
        double convertido = (celsius*1.8) + 32;
        System.out.println(convertido);
    }

    @Override
    public void fahrenheitparaCelsius(int fahrenheit) {
        double convertido = (fahrenheit - 32)/1.8;
        System.out.println(convertido);
    }

}
