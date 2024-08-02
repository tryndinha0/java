package exercicios.DESAFIOS.desafios4;

class ProdutoPerecivel extends Produto{
    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Copo",10, 4, "18/07/2005");
        System.out.println(produtoPerecivel);
    }
    private String dataDeValidade;
    public ProdutoPerecivel(String nome, double preco, int quantidade,String dataDeValidade) {
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }
    
}
