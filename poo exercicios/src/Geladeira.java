import java.util.Scanner;

class Geladeira {

    String marca, modelo;
    int volume;
    double tempmax, tempmin;
    Porta portaFreezer = new Porta();
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

    double getTempmax() {
        return tempmax;
    }

    void setTempmax(double tempmax) {
        this.tempmax = tempmax;
    }

    double getTempmin() {
        return tempmin;
    }

    void setTempmin(double tempmin) {
        this.tempmin = tempmin;
    }

    Porta getPortaFreezer() {
        return portaFreezer;
    }

    void setPortaFreezer(Porta portaFreezer) {
        this.portaFreezer = portaFreezer;
    }

    Porta getPorta() {
        return porta;
    }

    void setPorta(Porta porta) {
        this.porta = porta;
    }
    

    void EntradaDados(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca");
        this.marca = scanner.nextLine();

        System.out.println("Digite o modelo");
        this.modelo = scanner.nextLine();

        System.out.println("Digite o volume");
        this.volume = scanner.nextInt();

        System.out.println("Digite a temperatura maxima");
        this.tempmax = scanner.nextDouble();

        System.out.println("Digite a temperatura minima");
        this.tempmin = scanner.nextDouble();

        System.out.println("Sobre a porta do freezer: ");
        portaFreezer.EntradaDados();

        System.out.println("Sobre a porta normal:");
        porta.EntradaDados();

        
    }
    
    void imprimir(){
        System.out.println(this.getMarca());
        System.out.println(this.getModelo());
        System.out.println(this.getTempmax());
        System.out.println(this.getTempmin());
        System.out.println(this.getVolume());
        System.out.println("Características da porta normal");
        this.porta.imprimir();
        System.out.println("Características da porta do freezer");
        this.portaFreezer.imprimir();
    }
}
