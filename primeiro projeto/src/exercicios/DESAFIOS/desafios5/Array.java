package exercicios.DESAFIOS.desafios5;

import java.util.ArrayList;

class Array {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Daniel");
        lista.add("Duda");
        lista.add("Claudia");
        for (String string : lista) {
            System.out.println(string);
        }
    }
}
