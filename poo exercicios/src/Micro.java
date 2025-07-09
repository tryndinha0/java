import java.util.Scanner;

class Micro {
    String marca, modelo;
    int volume, potmin, potmax;
    double preco;
    Porta porta = new Porta();

    String getMarca() {
        return marca;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    String getModelo() {
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    int getVolume() {
        return volume;
    }

    void setVolume(int volume) {
        this.volume = volume;
    }

    int getPotmin() {
        return potmin;
    }

    void setPotmin(int potmin) {
        this.potmin = potmin;
    }

    int getPotmax() {
        return potmax;
    }

    void setPotmax(int potmax) {
        this.potmax = potmax;
    }

    double getPreco() {
        return preco;
    }

    void setPreco(double preco) {
        this.preco = preco;
    }

    Porta getPorta() {
        return porta;
    }

    void setPorta(Porta porta) {
        this.porta = porta;
    }

    void imprimir() {
        System.out.println(this.getMarca());
        System.out.println(this.getModelo());
        System.out.println(this.getPotmax());
        System.out.println(this.getPotmin());
        System.out.println(this.getVolume());
        this.porta.imprimir();
    }

    void EntradaDados(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca");
        this.marca = scanner.nextLine();

        System.out.println("Digite o modelo");
        this.modelo = scanner.nextLine();

        System.out.println("digite o volume");
        this.volume = scanner.nextInt();

        System.out.println("Digita a potencia minima");
        this.potmin = scanner.nextInt();

        System.out.println("Digita a potencia maxima");
        this.potmax = scanner.nextInt();

        System.out.println("Digite o preço");
        this.preco = scanner.nextDouble();

        System.out.println("Agora as caractéristica da porta!!");

        this.porta.EntradaDados();

    }
}
