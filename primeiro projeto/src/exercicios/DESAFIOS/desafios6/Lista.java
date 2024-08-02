package exercicios.DESAFIOS.desafios6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Lista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(6);
        numeros.add(2);
        numeros.add(8);
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}

class Tituloo implements Comparable<Tituloo> {
    String nome;

    public static void main(String[] args) {
        ArrayList<Tituloo> lista = new ArrayList<>();
        Tituloo titulo1 = new Tituloo("C");
        Tituloo titulo2 = new Tituloo("A");
        Tituloo titulo3 = new Tituloo("H");
        lista.add(titulo1);
        lista.add(titulo2);
        lista.add(titulo3);
        Collections.sort(lista);
        for (Tituloo tituloo : lista) {
            System.out.println(tituloo.nome);
        }
    }

    public Tituloo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Tituloo titulo) {
        return this.nome.compareTo(titulo.nome);
    }

}
class Teste{
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("elemento1");
        lista.add("elemento2");

        List<String> lista2 = new LinkedList<>();
        lista2.add("elemento a");
        lista2.add("elemento b");

        System.out.println(lista);
        System.out.println(lista2);
    }
}
