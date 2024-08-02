package exercicios.DESAFIOS.desafios4;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public static void main(String[] args) {
        ArrayList<Produto> listaProduto = new ArrayList<>();
        Produto produto1 = new Produto("Detergente", 4.5, 3);
        Produto produto2 = new Produto("Sabonete", 2.8, 5);
        Produto produto3 = new Produto("Telefone", 4899.99, 1);
        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);
        System.out.println(listaProduto.size());
        System.out.println(listaProduto.get(0).getNome());
        for(Produto produto : listaProduto){
            System.out.println(produto);
        }
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
    

}
