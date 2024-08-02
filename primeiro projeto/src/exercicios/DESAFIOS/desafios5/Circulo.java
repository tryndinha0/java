package exercicios.DESAFIOS.desafios5;

import java.util.ArrayList;

class Circulo implements Forma{
    double raio;

    public static void main(String[] args) {
        ArrayList<Forma> lista = new ArrayList<>();
        Quadrado quadrado = new Quadrado();
        Circulo circulo = new Circulo();
        quadrado.lado = 5;
        circulo.raio = 5;
        lista.add(circulo);
        lista.add(quadrado);
        for (Forma forma : lista) {
            System.out.println("Area " + forma.calcularArea());
        }
    }

    @Override
    public double calcularArea() {
        return raio*raio*3.14;
    }

    public double getRaio() {
        return raio;
    }    
}
