package aula04_1704;

import java.text.DecimalFormat;
import java.util.Scanner;

public class aula04_exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("#0.00");

		int idade = 0, qtdId50 = 0, quantIdade = 0, somaIdade = 0, qtdAzul = 0, qtdRuiva = 0, i;
		double altura = 0, peso = 0, porc;
		char corOlho, corBelo;

		for (i = 0; i < 3; i++) {

			System.out.print("Digite sua idade: ");
			idade = entrada.nextInt();
			System.out.print("Digite seu peso: ");
			peso = entrada.nextDouble();
			System.out.print("Digite sua altura: ");
			altura = entrada.nextDouble();

			System.out.print("Digite a cor dos seus olhos: ");
			corOlho = entrada.next().toUpperCase().charAt(0);

			System.out.print("Digite a cor dos seus cabelos: ");
			corBelo = entrada.next().toUpperCase().charAt(0);

			if (idade > 50 && peso < 60) {
				qtdId50++;
			}

			if (altura < 1.50) {
				quantIdade++;
				somaIdade += idade;
			}

			if (corOlho == 'A') {
				qtdAzul++;
			}

			if (corBelo == 'R' && corOlho != 'A') {
				qtdRuiva++;
			}

		}

		System.out.println("Pessoas com idade superior a 50 anos e peso inferior a 60: " + qtdId50);
		if (quantIdade != 0) {
			System.out.println("Média das idades com pessoas com altura inferior a 1,50: " + somaIdade / quantIdade);
		} else {
			System.out.println("Média das idades com pessoas com altura inferior a 1,50: 0");
		}
		porc = (qtdAzul * 100) / i;
		System.out.println("Porcentagem das pessoas com olhos azuis: " + numFormatado.format(porc) + "%");
		System.out.println("Quantidade de pessoas ruivas que não possuem olhos azuis: " + qtdRuiva);

	}

}
