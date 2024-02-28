package aula04_1704;

import java.util.Scanner;

public class treino_exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int idade = 0, qtdId50 = 0, qtdAzul = 0, qtdRuiva = 0, quantIdade = 0, somaIdade = 0, i;
		double altura = 0, peso = 0, medIdade = 0, porc;
		char corOlho, corCabelo;

		for (i = 0; i < 3; i++) {
			System.out.print("Digite sua idade: ");
			idade = e.nextInt();
			System.out.print("Digite sua altura: ");
			altura = e.nextDouble();
			System.out.print("Digite seu peso: ");
			peso = e.nextDouble();

			System.out.print("Digite a cor dos seus olhos: ");
			corOlho = e.next().toUpperCase().charAt(0);
			while (corOlho != 'A' && corOlho != 'C' && corOlho != 'P' && corOlho != 'V') {
				System.out.println("Digite a cor corretamente: ");
				corOlho = e.next().toUpperCase().charAt(0);
			}

			System.out.print("Digite a cor dos seus cabelos: ");
			corCabelo = e.next().toUpperCase().charAt(0);
			while (corCabelo != 'R' && corCabelo != 'P' && corCabelo != 'L' && corCabelo != 'C') {
				System.out.print("Digite a cor dos cabelos corretamente: ");
				corCabelo = e.next().toUpperCase().charAt(0);
			}

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

			if (corCabelo == 'R' && corOlho != 'A') {
				qtdRuiva++;
			}

		}

		porc = (qtdAzul * 100) / i;
		System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60Kg: " + qtdId50);
		System.out.println("Média das idades com pessoas inferiores a 1,50m: " + somaIdade / quantIdade);
		System.out.println("Porcentagem de pessoas com olhos azuis: " + porc + "%");
		System.out.println("Quantidade de pessoas ruivas que não possuem olhos azuis: " + qtdRuiva);

	}

}
