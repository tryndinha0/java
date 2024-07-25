package ScreenMatch;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean inlcuidoNoPlano;
    private double SomaDasAvaliacoes;
    private int totalDeAvaliacoes=0;
    private int duracaoEmMinutos;

    int gettotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome){
        this.nome = nome;
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

    void exibeFichaTecnica(){
        System.out.println("Nome do filme " + nome);
        System.out.println("Ano de lançamento " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Icluído no plano: " + inlcuidoNoPlano);
    }

    void avalia(double nota){
        SomaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    double obterMedia(){
        return SomaDasAvaliacoes/totalDeAvaliacoes;
    }
}
