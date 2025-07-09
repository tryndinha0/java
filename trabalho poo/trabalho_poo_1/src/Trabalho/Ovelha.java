package Trabalho;

public class Ovelha extends Animal {
    public Ovelha(String nome, int numeroPatas,String la) {
        super(nome, numeroPatas);
        this.cor_de_La = la;
    }
    private String cor_de_La;
    
    @Override
    public void emitirSom() {
        System.out.println("O barulho do animal: " + this.getNome() + " é beeeeeeeeeeeeee");
    }
    @Override
    public String toString() {
        return "Nome: " + this.getNome() + ", Número de patas: " + this.getNumeroPatas() + ", Cor da lã: " + this.getCor_de_La();
    }
    public String getCor_de_La() {
        return cor_de_La;
    }

    public void setCor_de_La(String cor_de_La) {
        this.cor_de_La = cor_de_La;
    }
}
