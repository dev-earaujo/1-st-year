package aula04_1704;

import java.text.DecimalFormat;
import java.util.Scanner;

public class aula04_exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("#0.00");

		int canal = 0, numPessoas = 0, totNumero = 0, canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;
		double porc4, porc5, porc7, porc12;

		System.out.println("CANAIS: 4, 5, 7, 12");
		System.out.print("Digite o número do canal: ");
		canal = e.nextInt();

		while (canal != 4 && canal != 5 && canal != 7 && canal != 12 && canal != 0) {
			System.out.print("Digite o número do canal corretamente: ");
			canal = e.nextInt();
		}

		while (canal != 0) {

			switch (canal) {
			case 4:
				System.out.print("Digite o número de pessoas: ");
				numPessoas = e.nextInt();
				canal4 += numPessoas;
				break;
			case 5:
				System.out.print("Digite o número de pessoas: ");
				numPessoas = e.nextInt();
				canal5 += numPessoas;
				break;
			case 7:
				System.out.print("Digite o número de pessoas: ");
				numPessoas = e.nextInt();
				canal7 += numPessoas;
				break;
			case 12:
				System.out.print("Digite o número de pessoas: ");
				numPessoas = e.nextInt();
				canal12 += numPessoas;
				break;
			}
			System.out.print("Digite o número do canal: ");
			canal = e.nextInt();

			while (canal != 4 && canal != 5 && canal != 7 && canal != 12 && canal != 0) {
				System.out.print("Digite o número do canal corretamente: ");
				canal = e.nextInt();
			}
			totNumero += numPessoas;
		}

		porc4 = (canal4 * 100) / totNumero;
		porc5 = (canal5 * 100) / totNumero;
		porc7 = (canal7 * 100) / totNumero;
		porc12 = (canal12 * 100) / totNumero;

		System.out.println("Canal 4: " + numFormatado.format(porc4) + "%");
		System.out.println("Canal 5: " + numFormatado.format(porc5) + "%");
		System.out.println("Canal 7: " + numFormatado.format(porc7) + "%");
		System.out.println("Canal 12: " + numFormatado.format(porc12) + "%");

	}

}
