package ScreenMatch.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ScreenMatch.excecao.ErroDeConversaoDeException;
import ScreenMatch.modelos.Titulo;
import ScreenMatch.modelos.TituloOmdb;

class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                        .setPrettyPrinting()
                        .create();
        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite o filme para busca: ");
            busca = scanner.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }
            String buscaEncoded = URLEncoder.encode(busca, StandardCharsets.UTF_8.toString());
            try {
                String endereco = "https://www.omdbapi.com/?t=" + buscaEncoded + "&apikey=83da1602";
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);

                
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);
                // try{
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("TItulo ja convertido");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Algo aconteceu, mas não sei o que houve.");
            }
        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("Programa finalizou corretamente");
    }
}
