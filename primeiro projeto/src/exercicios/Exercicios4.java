package exercicios;

import java.util.Scanner;

//1
 class Exercicios4 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// 2
class Calculadora {
    public static void main(String[] args) {
        Calculadora dobrar = new Calculadora();
        System.out.println("Digite um número e mostraremos o dobro");
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        dobrar.dobro(numero);
    }

    void dobro(double num) {
        System.out.println("O dobro de " + num + " é " + num * 2);
    }

}

// 3
class Musica {
    public static void main(String[] args) {
        Musica song = new Musica();
        // song.Parametros();
        song.Parametros("ABCD", "Nayeon", 2024, 10);

    }

    private String titulo;
    private String artista;
    private int anoDeLancamento;
    private int numAvaliacoes;

    void Parametros(String titulo, String artista, int anoDeLancamento, int numAvaliacoes) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoDeLancamento = anoDeLancamento;
        this.numAvaliacoes = numAvaliacoes;
        System.out.println(String.format("%s\n%s\n%d\n%d", titulo, artista, anoDeLancamento, numAvaliacoes));
        // System.out.println(artista);
        // System.out.println(anoDeLancamento);
        // System.out.println(numAvaliacoes);
    }

}

// 4
    class Carro {
    private String modelo;
    private int ano;
    private String cor;

    void Atributos(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    void Ficha() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.Atributos("Ford Ka", 2023, "Preto");
        carro.Ficha();
    }
}

// 5
 class Aluno {
    private String nome;
    private int idade;
    static Aluno pessoa1 = new Aluno("Daniel", 19);
    static Aluno pessoa2 = new Aluno("Duda", 18);

    public static void main(String[] args) {
        pessoa1.informaçoes();
        pessoa2.informaçoes();
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void informaçoes() {
        System.out.println(nome + " " + idade);
        // System.out.println(idade);
    }
}