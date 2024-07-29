package exercicios.DESAFIOS.desafios2;

class TabuadaMultiplicacao implements Tabuada{
    public static void main(String[] args) {
        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(5);
    }
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", numero, i, numero * i));
        }
    }
    
}
