package exercicios.DESAFIOS.desafios6;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class ConsultaReceitas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma receita e mostraremos caracteristicas");
        String receita = scanner.nextLine();
        String encodedQuery = URLEncoder.encode(receita, StandardCharsets.UTF_8.toString());
        var endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + encodedQuery;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
