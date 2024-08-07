package exercicios.DESAFIOS.desafios7;

import com.google.gson.Gson;
import exercicios.DESAFIOS.desafios7.Json;

class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Json pessoa = gson.fromJson(jsonPessoa, Json.class);
        System.out.println(pessoa);
    }
}