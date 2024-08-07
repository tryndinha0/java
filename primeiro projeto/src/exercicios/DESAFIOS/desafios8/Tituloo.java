package exercicios.DESAFIOS.desafios8;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class Tituloo {
    private String nome;
    private int duracao;
    private int anoLancamento;
    private boolean avaliacao;
    public Tituloo(String nome, int duracao, int anoLancamento, boolean avaliacao) {
        this.nome = nome;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
    }
    public static void main(String[] args) throws IOException {
        FileWriter json = new FileWriter("filmes.json");
        Tituloo tituloo = new Tituloo("Coraline", 120, 2009, true);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String filmes = gson.toJson(tituloo);
        json.write(filmes);
        json.close();
        System.out.println(filmes);
    }
}
