package Collections.map.Busca;

public class Produto {
    private long cod;
    private String nome;
    private int quantidade;
    private double preco;

    
    public Produto(long cod, String nome, int quantidade, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }


    public long getCod() {
        return cod;
    }


    public void setCod(long cod) {
        this.cod = cod;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Produto [cod=" + cod + ", nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }

    
}
