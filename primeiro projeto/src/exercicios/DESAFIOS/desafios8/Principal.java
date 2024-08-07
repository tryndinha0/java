package exercicios.DESAFIOS.desafios8;

import java.io.IOException;
import java.util.Scanner;

class Principal {
    public static void main(String[] args) {
        ConsultaCep consulta = new ConsultaCep();
        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite um CEP");
        var cep = leitura.nextLine();

        try{
            Endereco novoEndereco = consulta.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorArquivo gerador = new GeradorArquivo();
            gerador.salvaJson(novoEndereco);
        }catch(RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
       
        
        
    }
}
