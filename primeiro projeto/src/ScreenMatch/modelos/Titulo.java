package ScreenMatch.modelos;

import com.google.gson.annotations.SerializedName;

import ScreenMatch.excecao.ErroDeConversaoDeException;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean inlcuidoNoPlano;
    private double SomaDasAvaliacoes;
    private int totalDeAvaliacoes = 0;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeException("Não consegui converter o ano porque tem mais de 4 caracteres");
        }
            this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));

    }

    public int gettotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setincluidoNoPlano(boolean inlcuidoNoPlano) {
        this.inlcuidoNoPlano = inlcuidoNoPlano;
    }

    public void setanoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setduracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme " + nome);
        System.out.println("Ano de lançamento " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Icluído no plano: " + inlcuidoNoPlano);
    }

    public void avalia(double nota) {
        SomaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double obterMedia() {
        return SomaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo [nome=" + nome + ", anoDeLancamento=" + anoDeLancamento + ", duracaoEmMinutos="
                + duracaoEmMinutos + "]";
    }

}
