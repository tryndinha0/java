package exercicios.DESAFIOS.desafios2;

class Livro implements Calculavel {

    @Override
    public double calcularPrecoFinal(double preco) {
        return preco*1.05;
    }
    
}
