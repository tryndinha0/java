package exercicios.DESAFIOS.desafios2;

class CalcularSalaRetangular implements CalculoGeometrico {
    public static void main(String[] args) {
        CalcularSalaRetangular calcularSalaRetangular = new CalcularSalaRetangular();
        calcularSalaRetangular.calcularArea(2, 5);
        calcularSalaRetangular.calcularPerimetro(4, 4);
    }
    @Override
    public void calcularArea(double base, double altura) {
        double area = base * altura;
        System.out.println("A area do retangulo é: " + area);
    }

    @Override
    public void calcularPerimetro(double base, double altura) {
        double perimetro = 2*(base+altura);
        System.out.println("O perimetro do retangulo é: " + perimetro);
    }

}
