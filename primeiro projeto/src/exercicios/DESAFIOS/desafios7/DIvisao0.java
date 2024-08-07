package exercicios.DESAFIOS.desafios7;

import java.util.Scanner;

class Divisao0{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faremos uma divisão do numero 1 pelo numero 2 para você");
        System.out.println("Digite o número 1");
        int num1 = scanner.nextInt();
        System.out.println("Digite o número 2");
        int num2 = scanner.nextInt();
        try{
            int dividido = num1/num2;
            System.out.println("O primero número dividido pelo segundo é: " + dividido);
        }catch (ArithmeticException a){
            System.out.println(a.getMessage());
            System.out.println("Voce está tentando dividir um numero por zero, isso é impossivel");
        }finally{
            System.out.println("Programa encerrado");
        }
    }
}