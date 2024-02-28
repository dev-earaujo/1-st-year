package lista2;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int cp = 0;
		double pEtiqueta = 0, preco = 0, desconto1 = 0, preco1 = 0, desconto2 = 0, preco2 = 0, preco3 = 0,
				acrescimo = 0, preco4 = 0;
		String continuar;

		System.out.print("Digite o preço da etiqueta: ");
		pEtiqueta = e.nextDouble();

		preco += pEtiqueta;

		while (pEtiqueta != 0) {
			System.out.print("Digite o preço da etiqueta: ");
			pEtiqueta = e.nextDouble();
			preco += pEtiqueta;
		}

		System.out.print("Digite a condição de pagamento: ");
		cp = e.nextInt();
		while (cp != 1 && cp != 2 && cp != 3 && cp != 4) {
			System.out.print("Digite o código de condição de pagamento novamente.");
			cp = e.nextInt();
		}

		switch (cp) {
		case 1:
			System.out.println("À vista em dinheiro ou cheque (10% de Desconto).");
			desconto1 = preco * 0.1;
			preco1 = preco - desconto1;
			System.out.println("Valor a pagar: " + preco1);
			break;
		case 2:
			System.out.println("À vista com cartão de crédito (5% de Desconto).");
			desconto2 = preco * 0.05;
			preco2 = preco - desconto2;
			System.out.println("Valor a pagar: " + preco2);
			break;
		case 3:
			System.out.println("Em 2 vezes, preço normal e sem juros.");
			preco3 = preco;
			System.out.println("Valor a pagar: " + preco3);
			break;
		case 4:
			System.out.println("Em 3 vezes (acréscimo de 10%).");
			acrescimo = preco * 0.10;
			preco4 = preco + acrescimo;
			System.out.println("Valor a pagar: " + preco4);
			break;
		}

	}
}
