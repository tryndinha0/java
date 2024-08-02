package exercicios.DESAFIOS.desafios5;

import java.util.ArrayList;

class Produto {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();
        Produto produto1 = new Produto("Sabão",5);
        Produto produto2 = new Produto("Detergente",2);
        Produto produto3 = new Produto("Copo",10);
        lista.add(produto1);
        lista.add(produto2);
        lista.add(produto3);
        double somaPrecos=0;
        for (Produto produto : lista) {
            somaPrecos+=produto.getPreco();
        }
        double precoMedio = somaPrecos/lista.size();
        System.out.println("Preco médio: " + precoMedio);
    }
    private String nome;
    private double preco;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    
}
