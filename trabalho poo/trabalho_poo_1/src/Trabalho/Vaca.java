package Trabalho;

public class Vaca extends Animal{
    public Vaca(String nome, int numeroPatas,String queijo) {
        super(nome, numeroPatas);
        this.tipo_de_queijo = queijo;
    }
    private String tipo_de_queijo;
    
    @Override
    public void emitirSom() {
        System.out.println("O barulho do animal: " + this.getNome() + " é MUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }
    @Override
    public String toString() {
        return "Nome: " + this.getNome() + ", Número de patas: " + this.getNumeroPatas() + ", Tipo de queijo: " + this.getTipo_de_queijo();
    }
    public String getTipo_de_queijo() {
        return tipo_de_queijo;
    }

    public void setTipo_de_queijo(String tipo_de_queijo) {
        this.tipo_de_queijo = tipo_de_queijo;
    }
}
