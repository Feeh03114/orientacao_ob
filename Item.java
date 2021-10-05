public class Item {

    private Integer quantidade;
    private Produto produto;

    public Item(int quant, Produto product) {
        this.quantidade = quant;
        this.produto = product;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quant) {
        this.quantidade = quant;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto product) {
        this.produto = product;
    }
}