import java.util.List;
import java.util.jar.Attributes.Name;

public class Cliente {

    private String nome;
    private String telefone;
    private List<Compra> compras;

    public Cliente(String nome, String telefone, List<Compra> compra) {
        this.nome = nome;
        this.telefone = telefone;
        this.compras = compra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double totalDeGastos() {
        double result = 0;
        for (int i = 0; i < compras.size(); i++) {
            result += (compras.get(i).obterValorTotal());
        }
        return result;
    }

    public String imprimir() {
        String resp = "";

        resp += "Cliente: " + nome + "\nTelefone: " + telefone + "\nCompras: ";
        for (int f = 0; f < compras.size(); f++) {
            resp += "\n--Data: " + compras.get(f).getData();
            for (int i = 0; i < compras.get(f).getItem().size(); i++) {
                resp += "\n----Produto: " + compras.get(f).getItem().get(i).getProduto().getNome();
                resp += "\n----Preço: " + compras.get(f).getItem().get(i).getProduto().getPreco();
            }
            resp += "\nTotal da Compra: " + compras.get(f).obterValorTotal();
        }

        return resp;

    }

}
