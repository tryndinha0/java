package exercicios.CarroModelo;
//1
class TESTA {
    public static void main(String[] args) {
        Carro5 carro = new Carro5();
        carro.definirModelo("Civic");
        carro.definirPrecos(30, 15, 20);  // Corrigido o nome do método
        carro.exibirInfo();
    }
}

  class Carro5 {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {  // Corrigido o nome do método
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    private double calcularMenorPreco() {
        double menorPreco = precoAno1;
        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }
        if (precoAno3 < menorPreco) {  // Corrigido para if em vez de else if
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    private double calcularMaiorPreco() {  // Corrigido o nome do método
        double maiorPreco = precoAno1;
        if (precoAno2 > maiorPreco) {  // Corrigido para >
            maiorPreco = precoAno2;
        }
        if (precoAno3 > maiorPreco) {  // Corrigido para if em vez de else if
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + precoAno1);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }
}

//2
class Animal{
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        gato.emitirSom();
        gato.arranharMoveis();

    }
    public void emitirSom(){
        System.out.println("Fazendo barulho!!");
    }
}

class Cachorro extends Animal{
    public void abanarRabo(){
        System.out.println("Abanando o rabo!!");
    }
    @Override
    public void emitirSom(){
        System.out.println("O cachorro late!");
    }
    
}
class Gato extends Animal{
    public void arranharMoveis(){
        System.out.println("Arranhando os moveis!");
    }
    @Override
    public void emitirSom(){
        System.out.println("O gato mia!");
    }
}
