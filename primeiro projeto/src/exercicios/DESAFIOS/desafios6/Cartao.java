package exercicios.DESAFIOS.desafios6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

class Cartao{
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }
    public boolean lancaCompra(Compra compra){
        if(this.saldo>compra.getValor()){
            this.saldo-=compra.getValor();
            this.compras.add(compra);
            return true;
        }else{

            return false;
        }
    }
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    
}


