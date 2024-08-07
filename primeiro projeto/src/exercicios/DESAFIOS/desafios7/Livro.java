package exercicios.DESAFIOS.desafios7;
import com.google.gson.Gson;
record Editora(String nome, String cidade) {}
record Livro(String titulo, String autor, Editora editora) {}
class Batata {
    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";
        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println(livro);
    }
}
