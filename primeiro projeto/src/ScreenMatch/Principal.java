package ScreenMatch;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setanoDeLancamento(1970);
        meuFilme.setduracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações" + meuFilme.gettotalDeAvaliacoes());
        System.out.println(meuFilme.obterMedia());
    }
}
