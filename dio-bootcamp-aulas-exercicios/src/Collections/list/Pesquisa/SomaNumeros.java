package Collections.list.Pesquisa;

import java.util.ArrayList;

public class SomaNumeros {
    private ArrayList<Integer> lista = new ArrayList<>();

    public void adicionarNumero(Integer n) {
        lista.add(n);
    }

    public int encontrarMaiorNumero() {
        int maiorMumero = Integer.MIN_VALUE;
        if (!lista.isEmpty()) {
            for (Integer i : lista) {
                if (i > maiorMumero) {
                    maiorMumero = i;
                }
            }

        }
        return maiorMumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!lista.isEmpty()) {
            for (Integer i : lista) {
                if (i < menorNumero) {
                    menorNumero = i;
                }
            }

        }
        return menorNumero;
    }


    public void exibirNumeros(){
        System.out.println(lista);
    }

    public static void main(String[] args) {
    // Criando uma instância da classe SomaNumeros
    SomaNumeros somaNumeros = new SomaNumeros();

    // Adicionando números à lista
    somaNumeros.adicionarNumero(5);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(-2);
    somaNumeros.adicionarNumero(10);

    // Exibindo a lista de números adicionados
    System.out.println("Números adicionados:");
    somaNumeros.exibirNumeros();

    // Encontrando e exibindo o maior número na lista
    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

    // Encontrando e exibindo o menor número na lista
    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
  }
}
