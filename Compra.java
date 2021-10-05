import java.util.List;

public class Compra {

    private String data;
    private List<Item> item;

    public Compra(String data, List<Item> Item) {
        this.data = data;
        this.item = Item;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> itens) {
        this.item = itens;
    }

    public double obterValorTotal() {
        double result = 0;
        for (int i = 0; i < item.size(); i++) {
            result += (item.get(i).getQuantidade() * item.get(i).getProduto().getPreco());
        }
        return result;
    }

    public void adicionarItem(int quant, Produto product) {
        Item itemClass = new Item(quant, product);

        item.add(itemClass);
    }

}
