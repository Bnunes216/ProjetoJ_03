package carrinho;

class Item {
    private Produto produto;
    private int quantidade;
    private double valorTotal;

    public Item(Produto produtoSelecionado, int quantidade) {
        this.produto = produtoSelecionado;
        this.quantidade = quantidade;
        this.valorTotal = produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}