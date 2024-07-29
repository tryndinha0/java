import ScreenMatch.calculos.CalculadoraDeTempo;
import ScreenMatch.calculos.FiltroRecomendacao;
import ScreenMatch.modelos.Episodio;
import ScreenMatch.modelos.Filme;
import ScreenMatch.modelos.Serie;
import ScreenMatch.modelos.Titulo;
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setanoDeLancamento(1970);
        meuFilme.setduracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações" + meuFilme.gettotalDeAvaliacoes());
        System.out.println(meuFilme.obterMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setanoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setanoDeLancamento(2023);
        outroFilme.setduracaoEmMinutos(200);
        System.out.println("Duração do filme: " + outroFilme.getDuracaoEmMinutos());

        System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
    
}
