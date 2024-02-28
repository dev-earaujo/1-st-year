package lista2;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int idade = 0, qtdA = 0, qtdB = 0, qtdC = 0, qtdD = 0, qtdE = 0, somaIdade=0, qtdPessoas=0;
		double medIdade = 0;
		char op = 0;

		System.out.print("Informe sua idade: ");
		idade = e.nextInt();
		somaIdade+=idade;

		while (idade != 0) {
			System.out.print("Sua opinião em relação ao filme: ");
			op = e.next().toUpperCase().charAt(0);

			while (op != 'A' && op != 'B' && op != 'C' && op != 'D' && op != 'E') {
				System.out.print("Digite sua opinião corretamente: ");
				op = e.next().toUpperCase().charAt(0);
			}

			if (op == 'A') {
				qtdA++;
			} else {
				if (op == 'B') {
					qtdB++;
				} else {
					if (op == 'C') {
						qtdC++;
					} else {
						if (op == 'D') {
							qtdD++;
						} else {
							if (op == 'E') {
								qtdE++;
							}
						}
					}
				}
			}
			System.out.print("Informe sua idade: ");
			idade = e.nextInt();
			somaIdade+=idade;
		}
		
		qtdPessoas=qtdA+qtdB+qtdC+qtdD+qtdE;
		medIdade=somaIdade/qtdPessoas;
		System.out.println("Pessoas que responderam à pesquisa: " + qtdPessoas);
		System.out.println("Porcentagem A: "+(qtdA*100)/qtdPessoas+"%");
		System.out.println("Porcentagem B: "+(qtdB*100)/qtdPessoas+"%");
		System.out.println("Porcentagem C: "+(qtdC*100)/qtdPessoas+"%");
		System.out.println("Porcentagem D: "+(qtdD*100)/qtdPessoas+"%");
		System.out.println("Porcentagem E: "+(qtdE*100)/qtdPessoas+"%");
		System.out.println("Média das Idades: "+ medIdade);

	}

}
