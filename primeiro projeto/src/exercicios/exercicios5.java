package exercicios;

import java.util.Scanner;

//1
public class exercicios5 {
    public static void main(String[] args) {
        ContaBancaria banco = new ContaBancaria();
        banco.setSaldo(1599.99);
        banco.setNumeroConta(142);
        banco.titular = "daniel";
        System.out.println(banco.getSaldo());
        System.out.println(banco.getNumeroConta());
        System.out.println(banco.titular);

    }
}

class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}

// 2
class IdadePessoa {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        IdadePessoa pessoa2 = new IdadePessoa();

        pessoa1.setNome("Daniel");
        pessoa1.setIdade(19);

        pessoa2.setNome("Duda");
        pessoa2.setIdade(18);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos ");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos ");
        pessoa2.verificarIdade();

    }

    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é m  enor de idade");
        }
    }

}
//3
class Produto{
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome e preço de um produto e a porcentagem de desconto.");
        String nomprod = scanner.nextLine();
        double precprod = scanner.nextDouble();
        double descprod = scanner.nextDouble();
        produto.setNome(nomprod);
        produto.setPreco(precprod);
        //produto.calcularDesconto(descprod);

        System.out.println(String.format("O nome do produto é %s o preço é %.2f e o preço final é " + produto.calcularDesconto(descprod),nomprod,precprod ));
    }
    private String nome;
    private double preco;
    private double precoFinal;
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public double calcularDesconto(double desconto){
       return precoFinal = preco*(1-(desconto/100));
    }

}
//4
class AlunoB{
    public static void main(String[] args) {
        AlunoB aluno1 = new AlunoB();
        aluno1.somarNotas(9);
        aluno1.somarNotas(9);
        aluno1.somarNotas(9);
        System.out.println("A media das notas é: " + aluno1.calcuarMedia());
    }
    private String nome;
    private double nota;
    private double notas =0;
    private double somaNotas=0;

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setNota(double nota){
        this.nota=nota;
    }
    public String getNome(){
        return nome;
    }
    public double getNota(){
        return nota;
    }
    public void somarNotas(double nota){
        somaNotas +=nota;
        notas++;
    }
    public double calcuarMedia(){
        return somaNotas/notas;
    }
}

class Livro{
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Eu te amei em outra vida");
        livro.setAutor("Daniel");
        livro.exibirDetalhes();
    }
    private String titulo;
    private String autor;

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void exibirDetalhes(){
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
