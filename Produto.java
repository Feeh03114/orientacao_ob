public class Produto {

	private double preco;
	private String nome;

	public Produto(String nome, double preco) {
		this.preco = preco;
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String imprimir() {
		return "Produto:" + nome + "\n" + "Preço: R$" + preco;
	}

}