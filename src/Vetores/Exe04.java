package Vetores;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		String nomeFunc[] = new String[] { "ANA", "JOSÉ", "LUIZ", "LUISA", "LUCAS" };
		double salario[] = new double[] { 750, 1200, 740, 1240, 1590 };
		int tempoTrabalho[] = new int[] { 3, 6, 2, 4, 6 };
		double novoSalario = 0;

		for (int i = 0; i < 5; i++) {

			System.out.println("----------" + (i + 1) + "° Funcionário ----------------");
			System.out.println("Informe o nome do funcionário: " + nomeFunc[i]);

			System.out.println("Informe o salário: " + salario[i]);

			System.out.println("Informe o tempo de serviço: " + tempoTrabalho[i]);
		}

		for (int i = 0; i < 5; i++) {

			if (salario[i] >= 780 && tempoTrabalho[i] <= 5) {
				System.out.println("---------- FUNCIONARIOS QUE NÃO TERÃO AUMENTO----------");
				System.out.println(nomeFunc[i]);
			}

		}
		System.out.println("---------- FUNCIONARIOS QUE TERÃO AUMENTO----------");
		for (int i = 0; i < 5; i++) {

			if (salario[i] < 780 || tempoTrabalho[i] > 5) {

				if (salario[i] < 780 && tempoTrabalho[i] > 5) {
					novoSalario = salario[i] + (salario[i] * 0.35);
				} else {
					if (tempoTrabalho[i] > 5) {
						novoSalario = salario[i] + (salario[i] * 0.25);
					} else {
						novoSalario = (salario[i] * 1.15);
					}
				}

			}
			System.out.println("Nome: "+nomeFunc[i]+" - Novo Salário: "+novoSalario);
		}
	}

}
