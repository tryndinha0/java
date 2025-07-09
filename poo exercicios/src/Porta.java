import java.util.Scanner;

class Porta {
    double comprimento, largura;
    boolean possui_vidro;

    double getComprimento() {
        return comprimento;
    }

    void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    double getLargura() {
        return largura;
    }

    void setLargura(double largura) {
        this.largura = largura;
    }

    void imprimir() {
        System.out.println(this.getComprimento());
        System.out.println(this.getLargura());
        if(this.possui_vidro==true){
            System.out.println("Tem vidro");
        }else{
            System.out.println("não tem vidro");
        }
    }

    void EntradaDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento da porta");
        this.comprimento = scanner.nextDouble();

        System.out.println("Digite a largura da porta");
        this.largura = scanner.nextDouble();

        System.out.println("A porta tem vidro? (true/false)");
        this.possui_vidro = scanner.nextBoolean();

        

    }

}
