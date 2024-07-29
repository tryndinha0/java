package ScreenMatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean inlcuidoNoPlano;
    private double SomaDasAvaliacoes;
    private int totalDeAvaliacoes=0;
    private int duracaoEmMinutos;

    public int gettotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setincluidoNoPlano(boolean inlcuidoNoPlano){
        this.inlcuidoNoPlano = inlcuidoNoPlano;
    }
    public void setanoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setduracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme " + nome);
        System.out.println("Ano de lançamento " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Icluído no plano: " + inlcuidoNoPlano);
    }

    public void avalia(double nota){
        SomaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double obterMedia(){
        return SomaDasAvaliacoes/totalDeAvaliacoes;
    }
}
