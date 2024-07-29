package exercicios.DESAFIOS.desafios2;

class ProdutoFisico implements Calculavel{

    @Override
    public double calcularPrecoFinal(double preco) {
        return preco * 0.9; 
    }
    
}
