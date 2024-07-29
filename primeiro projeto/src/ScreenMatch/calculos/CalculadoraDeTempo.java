package ScreenMatch.calculos;

import ScreenMatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }
    
    // public void inclui(Filme f){
    //     this.tempoTotal +=f.getDuracaoEmMinutos();
    // }
    // public void inclui(Serie s){
    //     this.tempoTotal +=s.getDuracaoEmMinutos();
    // }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo.getNome() + ": " + titulo.getDuracaoEmMinutos() + " minutos");
        this.tempoTotal +=titulo.getDuracaoEmMinutos();
    }
}


