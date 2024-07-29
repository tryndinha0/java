package exercicios;
//1
 class Exercicios2 {
    public static void main(String[] args){
        double nota1 = 10;
        double nota2 = 28;
        double media = (nota1 + nota2)/2;
        System.out.println(media);
    }
    
}
//2 3 e 4
   class MediaString {
    public static void main(String[] args) {
        double n1 = 2.4;
        int n3 = (int) n1;
        System.out.println(n3);

        char primeira = 'A';
        String frase = "A primeira letra do alfabeto é: ";
        System.out.println(frase+primeira); 

        double precoProduto = 5.5;
        int quantidade = 2;
        double precoTotal = quantidade * precoProduto;
        System.out.println(precoTotal);
        

    }
    
}
//5
abstract class Dolar {
    public static void main (String[] args){
        double valorConversao = 100.0;
        double dolar = 4.94;
        double formula = valorConversao/dolar;
        System.out.println(String.format("Convertendo de dolar para real fica: %.2f ", formula));


    }
}
//6
abstract class Desconto{
    public static void main(String[] args){
        double precoOriginal = 100;
        double porcentagem = 0.1;
        double desconto = precoOriginal * porcentagem;
        double precoFinal = precoOriginal * (1-porcentagem);
        System.out.println(String.format("O valor original é %.2f\nA porcentagem é %.1f%% \nO deconto é %.0f \nO preço final é %.2f", precoOriginal,porcentagem*100,desconto, precoFinal));
    }
}