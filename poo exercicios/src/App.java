import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Geladeira geladeira = new Geladeira();
        Micro micro = new Micro();
        System.out.println("---------SISTEMA DE CADASTRAMENTO MICRO ONDAS/GELADEIRA ---------");
        System.out.println("Digitar 3 encerra o programa!");
        while (true) {
            System.out.println("Qual deles voce quer usar? Geladeira 1 / Micro 2");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    while (true) {
                        
                        System.out.println("Voce quer cadastrar ou ler a geladeira? 1 - cadastrar 2 - ler 3");
                        int escolha = scanner.nextInt();
                        switch (escolha) {
                            case 1:
                                geladeira.EntradaDados();
                                break;
                            case 2:
                                geladeira.imprimir();
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }

                    }

                case 2:
                    while (true) {
                        
                        System.out.println("Voce quer cadastrar ou ler o micro? 1 - cadastrar 2 - ler ");
                        int escolha = scanner.nextInt();
                        switch (escolha) {
                            case 1:
                                micro.EntradaDados();
                                break;
                            case 2:
                                micro.imprimir();
                                break;
                        
                            default:
                                System.out.println("opção inválida");;
                        }
                    }
                case 3:
                    System.out.println("Programa encerrado!");
                    return;
                default:
                    System.out.println("opção inválida!");

            }
            scanner.close();
        }
    }
}
