package exercicios.DESAFIOS.desafios6;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

class ConsultaCriptomoeda {
    public static void main(String[] args) throws IOException, InterruptedException {
        // "CG-nRWwHCF1rGGHiVwbwCSKMNSZ"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma criptomoeda e mostraremos o valor dela: ");
        String moeda = scanner.nextLine();
        var endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + moeda + "&vs_currencies=usd";
        ;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
