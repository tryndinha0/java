package exercicios.DESAFIOS;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomnum = new Random().nextInt(100);
        System.out.println("Brinque no nosso jogo de adivinhação.\nVocê tem 5 tentativas");
        for (int i = 0; i < 5; i++) {
            double leitura = scanner.nextDouble();
            if(leitura == randomnum){
                System.out.println(String.format("PARABÉNS!!!! Você acertou em %.0f Tentativas",i));
                break;
            }else{
                System.out.println("Tente Novamente.");
                if(leitura<randomnum){
                    System.out.println("O numero digitado é menor que o aleatório");
                }else{
                    System.out.println("O número digitado é maior que o aleatório.");
                }
            }
            if (i == 4 && leitura != randomnum) {
                System.out.println("Você não conseguiu acertar o número em 5 tentativas. \n O número era: " + randomnum);
           }
        }
        System.out.println("\n\nFIM");
    }
}
