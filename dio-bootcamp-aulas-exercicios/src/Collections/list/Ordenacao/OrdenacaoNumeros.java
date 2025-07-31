package Collections.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {
    private ArrayList<Integer> ordenacao;

    public OrdenacaoNumeros(){
        this.ordenacao = new ArrayList<>();
    }

    public void adicionarNumero(int n){
        ordenacao.add(n);
    }


    public ArrayList<Integer> ordenarAsc(){
        ArrayList<Integer> ordenacaoAsc = new ArrayList<>(ordenacao);
        Collections.sort(ordenacaoAsc);
        return ordenacaoAsc;
    }

    public ArrayList<Integer> ordenarDesc(){
        ArrayList<Integer> ordenacaoDesc = new ArrayList<>(ordenacao);
        ordenacaoDesc.sort(Collections.reverseOrder());
        return ordenacaoDesc;
    }

    public void exibirNumeros(){
        System.out.println(ordenacao);
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros [ordenacao=" + ordenacao + "]";
    }

    public static void main(String[] args) {
    // Criando uma instância da classe OrdenacaoNumeros
    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

    // Adicionando números à lista
    numeros.adicionarNumero(2);
    numeros.adicionarNumero(5);
    numeros.adicionarNumero(4);
    numeros.adicionarNumero(1);
    numeros.adicionarNumero(99);

    // Exibindo a lista de números adicionados
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem ascendente
    System.out.println(numeros.ordenarAsc());

    // Exibindo a lista
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem descendente
    System.out.println(numeros.ordenarDesc());

    // Exibindo a lista
    numeros.exibirNumeros();
  }
}
