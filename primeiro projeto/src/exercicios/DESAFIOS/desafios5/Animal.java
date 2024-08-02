package exercicios.DESAFIOS.desafios5;

class Animal {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
        }else{
            System.out.println("O objeto não é cachorro");
        }
    }
}
