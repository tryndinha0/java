package exercicios.DESAFIOS.desafios4;

import java.util.ArrayList;

class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return "Pessoa: " + nome + " (Idade: " + idade + ")";
    }
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Daniel",19);
        Pessoa pessoa2 = new Pessoa("Duda",18);
        Pessoa pessoa3 = new Pessoa("Claudia",52);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas);

        
    }
}
