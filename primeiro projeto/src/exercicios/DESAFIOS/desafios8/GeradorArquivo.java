package exercicios.DESAFIOS.desafios8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class GeradorArquivo {
    void salvaJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter(endereco.cep()+".json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }
}
