
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ClienteTeste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Cliente> list = new ArrayList<Cliente>();

		Cliente crs = new Cliente(null, null, null);

		while (true) {

			System.out.println("===MENU===");
			System.out.println("1-Criar Cliente \n2-Mostrar Cliente \n5-Mostrar total gasto" + "\n6-Sair");
			int escolha = sc.nextInt();

			switch (escolha) {
				case 1:
					System.out.println("Deseja criar quantos clientes: ");
					int C = sc.nextInt();

					for (int i = 0; i < C; i++) {
						System.out.println("Nome: ");
						String name = sc.next();
						System.out.println("Telefone: ");
						String telefone = sc.next();

						Compra compras;
						Item list_item;
						for (int n = 0; n < 2; n++) {
							for (int u = 0; u < 2; u++) {
								System.out.println("Produto: ");
								String name_prod = sc.next();
								System.out.println("Produto: ");
								Double preco = sc.nextDouble();
								System.out.println("Quantidade: ");
								Integer quant = sc.nextInt();

								Produto product = new Produto(name_prod, preco);

								list_item = new Item(quant, product);
							}
							String data = new Date().toString();
							compras = new Compra(data, list_item);
						}

						crs = new Cliente(name, telefone, compras);

						list.add(crs);
					}

					break;
				case 2:
					System.out.println("Nome do cliente: ");
					String name = sc.next();

					for (int f = 0; f < list.size(); f++) {
						if (list.get(f).getNome().equals(name)) {
							System.out.println(list.get(f).imprimir());
						}
					}
					break;
				case 5:
					System.out.println("Nome do cliente: ");
					name = sc.next();

					for (int j = 0; j < list.size(); j++) {
						if (list.get(f).getNome().equals(name)) {
							System.out.println(list.get(f).totalDeGastos());
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