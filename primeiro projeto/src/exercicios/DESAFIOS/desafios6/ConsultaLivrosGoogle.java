package exercicios.DESAFIOS.desafios6;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class ConsultaLivrosGoogle {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o livro para buscarmos informações");
        String livro = scanner.nextLine();
        String encodedQuery = URLEncoder.encode(livro, StandardCharsets.UTF_8.toString());



        String chave = "AIzaSyCiXTJOO9Mmv6IlamOlTezGqqxgxxGBvjk";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + encodedQuery + "&key=" + chave;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
