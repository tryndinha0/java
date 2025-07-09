package exercicios.CORRIDA;

import java.util.Random;

class Carro{
    private String piloto;
    private String marca;
    private String modelo;
    private int distancia=0;

    Random random = new Random();

    Carro(String piloto, String marca, String modelo) {
        this.piloto = piloto;
        this.marca = marca;
        this.modelo = modelo;
    }
    static void imprimirBarreira() {
        System.out.println("============================================================================================================================================X");
    }
    void imprimirCarro(){
        int numSorteado = random.nextInt(3)+1;
        distancia += numSorteado;
        String espacoSoma = " ".repeat(distancia);
        System.out.print(
                espacoSoma + "       _______      \n" +
                        espacoSoma + "     //  ||\\ \\     \n" +
                        espacoSoma + " ___//___||_\\ \\___ \n" +
                        espacoSoma + "|    _ " + piloto + "     _  )\n" +
                        espacoSoma + "|___/ \\________/ \\_|\n" +
                        espacoSoma + "    \\_/        \\_/   \n"
        );

        System.out.println(" ");
    }
    void imprimeDistancia() {
        System.out.println(piloto + " - " + marca + " " + modelo + " | distancia percorrida: " + distancia);
    }
    int getDistancia() {
        return distancia;
    }
    String getPiloto() {
        return piloto;
    }
    
}