package exercicios.DESAFIOS;

import java.util.Scanner;

public class Banco {
        public static void main(String[] args) {
        int opcao = 0;
       String nome = "Daniel";
       String tipoConta = "Corrente";
       double saldo = 1599.99;

       System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");
        
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao==1){
                System.out.println("O saldo atualizado é: " + saldo);
            }else if(opcao == 2){
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo suficiente");
                }else{
                    saldo -= valor;
                    System.out.println(String.format("Saldo atualizado: %.2f",saldo));
                }
            }else if(opcao == 3){
                System.out.println("Qual é o valor que deseja receber?");
                double valor = leitura.nextDouble();
                saldo +=valor;
                System.out.println(String.format("Saldo atualizado: %.2f", saldo));
            }else if(opcao == 4){
                System.out.println("Programa encerrado.");
                break;
            }else{
                System.out.println("Opção inválida");
            }
        }
    }
}
