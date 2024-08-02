package exercicios.DESAFIOS.desafios5;

import java.util.ArrayList;

class ContaBancaria {
    int numeroConta;
    double saldo;
    double menor;
    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }   
    public void setMenor(double menor){
        this.menor = menor;
    }
    public double getMenor() {
        return menor;
    }
    
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria(3, 150);
        ContaBancaria contaBancaria2 = new ContaBancaria(4, 200);
        ContaBancaria contaBancaria3 = new ContaBancaria(5, 100);
        ArrayList<ContaBancaria> lista = new ArrayList<>();
        lista.add(contaBancaria1);
        lista.add(contaBancaria2);
        lista.add(contaBancaria3);
        double menor = contaBancaria1.getSaldo();
        for (ContaBancaria contaBancaria : lista) {
            if(contaBancaria2.getSaldo()<menor){
                menor = contaBancaria2.getSaldo();
            }else if(contaBancaria3.getSaldo()<menor){
                menor = contaBancaria3.getSaldo();
            }
        }
        System.out.println(menor);
    }
    
}
