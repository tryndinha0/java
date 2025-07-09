package exercicios.CORRIDA;

class Aplicação {
    public static void main(String[] args) {
        Carro[] carro = new Carro[2];
        carro[0] = new Carro("Daniel", "Subaru", "O mais pica");
        carro[1] = new Carro("Lucas", "Honda", "G10");
        boolean corridaContinua = true;

        while(corridaContinua){
            Carro.imprimirBarreira();

            for (int i = 0; i < 2; i++) {
                carro[i].imprimirCarro();
            }

            Carro.imprimirBarreira();

            for (int i = 0; i <2; i++) {
                carro[i].imprimeDistancia();
            }
            if(carro[0].getDistancia()>=120 || carro[1].getDistancia()>=120){
                corridaContinua=false;
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        if (carro[0].getDistancia() >= 120 && carro[1].getDistancia() >= 120) {
            System.out.println("EMPATE!");
        } else if (carro[0].getDistancia() >= 120) {
            System.out.println("Piloto 1 (" + carro[0].getPiloto() + ") GANHOU!");
        } else {
            System.out.println("Piloto 2 (" + carro[1].getPiloto() + ") GANHOU!");
        }
    }
}
