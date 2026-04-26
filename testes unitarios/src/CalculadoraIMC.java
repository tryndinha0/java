
public class CalculadoraIMC
{
    public double calcular(double peso, double altura) {
        if (altura <= 0 || peso <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser maiores que zero.");
        }
        return peso / (altura * altura);
    }

    public String classificar(double imc) {
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Normal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            return "Obesidade grau I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }
}
