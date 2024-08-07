package exercicios.DESAFIOS.desafios8;

import java.io.FileWriter;
import java.io.IOException;

class Arquivotxt {
    public static void main(String[] args) throws IOException {
        try{
        FileWriter arquivo = new FileWriter("arquivo.txt");
        arquivo.write("Conteúdo a ser gravado no arquivo.");
        arquivo.close();
        System.out.println("Linha gravada com sucesso");
        }catch(Exception e){
            System.out.println("Algum erro aconteceu");
        }
    }    
}
