package aula04_1704;

import java.util.Scanner;

public class aula04_exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int pessoa = 0, idade = 0, faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, faixa5 = 0, i;
		double porc;

		for (i = 0; i < 5; i++) {
			pessoa++;
			System.out.println(pessoa + "° Pessoa");
			System.out.print("Digite a idade: ");
			idade = entrada.nextInt();

			if (idade < 16) {
				faixa1++;
			} else {
				if (idade >= 16 && idade < 31) {
					faixa2++;
				} else {
					if (idade >= 31 && idade <= 45) {
						faixa3++;
					} else {
						if (idade >= 46 && idade <= 60) {
							faixa4++;
						} else {
							faixa5++;
						}
					}
				}
			}
		}

		porc = (faixa1 * 100) / i;
		System.out.println("Número de pessoas na 1° Faixa: " + faixa1);
		System.out.println("Número de pessoas na 2° Faixa: " + faixa2);
		System.out.println("Número de pessoas na 3° Faixa: " + faixa3);
		System.out.println("Número de pessoas na 4° Faixa: " + faixa4);
		System.out.println("Número de pessoas na 5° Faixa: " + faixa5);
		System.out.println("Porcentagem de pessoas na 1° Faixa: " + porc + "%");

	}

}
