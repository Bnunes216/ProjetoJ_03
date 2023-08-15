package carrinho;

import java.util.ArrayList;
import java.util.List;

class Fatura {

    private List<Item> itens;
    private double valorTotalFatura;

    public Fatura() {
        this.itens = new ArrayList<>();
        this.valorTotalFatura = 0.0;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
        valorTotalFatura = valorTotalFatura + item.getValorTotal();
    }

    public void exibirFatura() {
        System.out.println("----- Fatura -----");
        for (Item item : itens) {
            Produto produto = item.getProduto();
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("Valor Total: " + item.getValorTotal());
            System.out.println("------------------");
        }
        System.out.println("Valor Total da Fatura: " + valorTotalFatura);
    }
}