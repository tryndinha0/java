package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","GABRIELA","FABIANA"};
        for(String candidato : candidatos){
            entrarContato(candidato);
        }
    }

    static void entrarContato(String candidato){
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando =! atendeu;
            if(continuarTentando){
                tentativas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
        }while(continuarTentando && tentativas <=3);

        if(atendeu){
            System.out.printf("CONSEGUIMOS ENTRAR EM CONTATO COM O CANDIDATO %s EM %d TENTAVIVAS \n",candidato, tentativas);
        }else{
            System.out.printf( "NÃO CONSEGUIMOS ENTRA EM CONTATO COM O CANDIDATO %s NÚMERO MÁXIMO DE TENTATIVAS \n ",candidato);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","GABRIELA","FABIANA"};
        System.out.println("Imprimindo a lista dos candidatos informando o indice do elemento");
        
        for(int i =0; i < candidatos.length ; i++){
            System.out.println((i+1) + " ------ " + candidatos[i] );
        }

        System.out.println("Forma abrevida da interação for each");

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }


    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","GABRIELA","FABIANA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase=2000;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário: " + Math.round(salarioPretendido));
            if (salarioBase>=salarioPretendido){
                System.out.println("O candidato " + candidato + " Foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000;
        if(salarioBase >salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");

        }
    }
}
