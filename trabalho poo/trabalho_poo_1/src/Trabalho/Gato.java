package Trabalho;

public class Gato extends Animal {
    public Gato(String nome, int numeroPatas, String raca) {
        super(nome, numeroPatas);
        this.raca=raca;
    }
    private String raca;
    @Override
    public void emitirSom() {
        System.out.println("O barulho do animal: "+ this.getNome() + " é MIAAAAAAAAAAAAAAAAAAU");
    }
    @Override
    public String toString() {
        return "Nome: " + this.getNome() + ", Número de patas: " + this.getNumeroPatas() + ", Raça: " + this.getRaca();
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
}
