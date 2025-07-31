package Collections.list.OperacoesBasicas;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public Item removerItem(String nome) {
        Item itemRemover = null;
        for (Item i : carrinho) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemRemover = i;
                
            }
        }
        carrinho.remove(itemRemover);
        return itemRemover;
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item i : carrinho) {
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [carrinho=" + carrinho + "]";
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("album", 46.3, 1);

        carrinhoDeCompras.exibirItens(); 
        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("ALBUM");
        carrinhoDeCompras.exibirItens();
    }
}
