package lista03;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int tipo = 0, qtdComputador = 0, qtdParcelas = 0;
		double pagVista = 0, pagPrazo = 0, precoI3 = 0, precoI5=0, precoI7=0, precoI32= 0, precoI52=0, precoI72=0, precoF=0, precoTotal = 0, valFinal = 0;
		String nome, modelo;
		char cp;

		System.out.println("Informe o nome do cliente: ");
		nome = e.next();

		System.out.println("Informe o tipo do computador: ");
		tipo = e.nextInt();
		while (tipo != 0) {

			while (tipo != 1 && tipo != 2) {
				System.out.println("Informe o tipo do computador corretamente: ");
				tipo = e.nextInt();
			}

			System.out.println("Digite o modelo: ");
			modelo = e.next().toLowerCase();

			while (!(modelo.equalsIgnoreCase("i3") || modelo.equalsIgnoreCase("i5") || modelo.equalsIgnoreCase("i7"))) {
				System.out.println("Digite o modelo corretamente: ");
				modelo = e.next().toLowerCase();
			}

			System.out.println("Digite a quantidade de computadores: ");
			qtdComputador += e.nextInt();
			System.out.println("Informe o tipo do computador: ");
			tipo = e.nextInt();

			if (tipo == 1 && modelo.equalsIgnoreCase("i3")) {
				precoI3 = 1801;
			} else {
				if (tipo == 1 && modelo.equalsIgnoreCase("i5")) {
					precoI5 = 2429;
				} else {
					if (tipo == 1 && modelo.equalsIgnoreCase("i7")) {
						precoI7 = 3150;
					} else {
						if (tipo == 2 && modelo.equalsIgnoreCase("i3")) {
							precoI32 = 1899;
						} else {
							if (tipo == 2 && modelo.equalsIgnoreCase("i5")) {
								precoI52 = 2799;
							} else
								precoI72 = 3199;
						}
					}
				}

			}
			precoF = precoI3 + precoI5 + precoI7 + precoI32 + precoI52 + precoI72;
		}

		System.out.println("Escolha a forma de pagamento V(À Vista) ou P(À Prazo): ");
		cp = e.next().toUpperCase().charAt(0);
		while (cp != 'V' && cp != 'P') {
			System.out.println("Escolha a forma de pagamento correta: ");
			cp = e.next().toUpperCase().charAt(0);
		}

		System.out.println("Total de computadores comprados: " + qtdComputador);
		System.out.println("Valor dos itens: " + precoF);
		System.out.println("Forma de pagamento escolhida: " + cp);
		System.out.println("Valor final da compra: " + valFinal);

	}
}
