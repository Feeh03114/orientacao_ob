
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ClienteTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Cliente> list = new ArrayList<Cliente>();

		Cliente crs = new Cliente(null, null, null);

		while (true) {

			System.out.println("\n===MENU===");
			System.out.println("1-Criar Cliente \n2-Mostrar cliente \n5-Mostrar total gasto pelo cliente" + "\n6-Sair");
			int escolha = sc.nextInt();

			switch (escolha) {
				case 1:
					System.out.println("Deseja criar quantos clientes: ");
					int C = sc.nextInt();
					SimpleDateFormat formDate = new SimpleDateFormat("dd/MM/yyyy");

					for (int i = 0; i < C; i++) {
						System.out.println("Nome: ");
						String name = sc.next();
						System.out.println("Telefone: ");
						String telefone = sc.next();

						List<Compra> compras = new ArrayList<Compra>();

						for (int n = 0; n < 2; n++) {
							System.out.println("Compra:" + (n + 1));
							List<Item> list_item = new ArrayList<Item>();
							Compra item_compra = null;
							Item item = null;

							for (int u = 0; u < 2; u++) {

								System.out.println("Produto: ");
								String name_prod = sc.next();
								System.out.println("Preço: ");
								Double preco = sc.nextDouble();
								System.out.println("Quantidade: ");
								Integer quant = sc.nextInt();

								Produto product = new Produto(name_prod, preco);

								item = new Item(quant, product);
								list_item.add(item);
							}
							String data = formDate.format(new Date()).toString();
							item_compra = new Compra(data, list_item);
							compras.add(item_compra);

						}

						crs = new Cliente(name, telefone, compras);
						list.add(crs);

					}

					break;
				case 2:
					System.out.println("Nome do cliente: ");
					String name = sc.next();

					for (Cliente cliente : list) {
						if (cliente.getNome().equals(name)) {
							System.out.println(cliente.imprimir());
						}
					}

					break;
				case 5:
					System.out.println("Nome do cliente: ");
					name = sc.next();

					for (Cliente cliente : list) {
						if (cliente.getNome().equals(name)) {
							System.out.println(cliente.totalDeGastos());
						}
					}

					break;
				case 6:
					System.out.println("Encerrando o programa");
					sc.close();
					return;
			}
		}
	}
}