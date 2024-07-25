package exercicios;

import java.util.Scanner;

//1
public class Exercicios3 {
   public static void main (String[] args){
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite um número e mostraremos se é positivo ou negativo");
    double num = leitura.nextDouble();
    if(num>0){
        System.out.println("O número " + num + " é positivo");
    }else{
        System.out.println("O número " + num + " é negativo");
    }
   } 
}
//2
abstract class Comparador{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número e mostraremos se são iguais, diferentes ou o primeiro maior que o segundo");
        System.out.println("Digite o numéro 1: ");
        double num1 = leitura.nextDouble();
        System.out.println("Digite o numéro 2: ");
        double num2 = leitura.nextDouble();
        if(num1>num2){
            System.out.println("O numero 1 é maior");
        }else if(num1<num2){
            System.out.println("O numero 2 é maior");
        }else if(num1 == num2){
            System.out.println("Os números são iguais");
        }

    }
}
//3
abstract class Area{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("1 - Calcular área de um quadrado || 2 - Calcular a área de um círculo");
        int escolha = leitura.nextInt();
        if(escolha == 1){
            System.out.println("Digite o lado do quadrado");
            double lado = leitura.nextDouble();
            System.out.println("A área do quadrado é: " + lado*lado);
        }else if(escolha == 2 ){
            System.out.println("Digite o raio do circulo");
            double raio = leitura.nextDouble();
            System.out.println("O raio do circulo é: " + raio*raio*3.14);
        }else{
            System.out.println("Programa encerrado.");
        }
    }
}
//4 
abstract class Tabuada{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número e mostraremos a tabuada: ");
        int num = scanner.nextInt();
        for (int i = 0; i <=10; i++) {
            System.out.println(num + " x " + i + " = " + num*i );
        }
    }
}
//5
abstract class ParOuImpar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número e mostraremos se é par ou impar:");
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.println(String.format("O número %d é par", num));
        }else{
            System.out.println(String.format("O número %d é impar", num));
        }
    }
}
//6
abstract class Fatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número e mostraremos o fatorial dele");
        int num = scanner.nextInt();
        for(int i =num; 1<=i; i--){
            fatorial *=i;
        }
        System.out.println("O Fatorial de " + num + " é " + fatorial);
    }
}
