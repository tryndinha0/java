package Trabalho;

public class Animal {
    private String nome;
    private int numeroPatas;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public Animal(String nome, int numeroPatas) {
        this.nome = nome;
        this.numeroPatas = numeroPatas;
    }

    public void emitirSom(){
        System.out.println("Seu animal fez um barulhinho");
    };
    public String toString() {
        return "Nome: " + nome + ", Número de patas: " + numeroPatas;
    }
}
