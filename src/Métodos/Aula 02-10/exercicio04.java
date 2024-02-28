package FIAP;

import java.util.Scanner;

public class exercicio04 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A)
		int[][] chamados = carregar();
		// B)
		relatorioErro(chamados);

		// C
		int [] arrayCriterios = relatorioCriterio(chamados);
		String[] tiposCriterios = new String[] {"Sistema Parado", "Grave", "Não Grave", "Dúvidas"};
		
		System.out.println("");
		System.out.println("---- RELATÓRIO DE CRITÉRIOS ----");
		for (int i=0;i<4;i++) {
			System.out.println("Número de chamadas - "+tiposCriterios[i]+": "+arrayCriterios[i]);
		}

	}// Main END

	// Função

	public static int[][] carregar() {

		int[][] chamados = new int[5][3];

		for (int i = 0; i < 5; i++) {

			System.out.println("Chamado " + (i + 1));

			System.out.print("Digite a identificação do funcionário: ");
			chamados[i][0] = e.nextInt();

			System.out.print("Digite o código do erro: ");
			chamados[i][1] = e.nextInt();

			while (chamados[i][1] < 1 || chamados[i][1] > 3) {
				System.out.print("Código inválido, digite novamente! (1/2/3)");
				chamados[i][1] = e.nextInt();
			}

			System.out.println("Digite o critério do erro: ");
			chamados[i][2] = e.nextInt();

			while (chamados[i][2] < 1 || chamados[i][2] > 4) {
				System.out.print("Critério inválido, digite novamente! (1/2/3/4)");
				chamados[i][2] = e.nextInt();
			}

		}

		return chamados;
	}

	public static void relatorioErro(int[][] chamados) {

		int[] contErro = new int[3];

		for (int i = 0; i < 5; i++) {
			if (chamados[i][1] == 1) {
				contErro[0]++;
			} else if (chamados[i][1] == 2) {
				contErro[1]++;
			} else {
				contErro[2]++;
			}
		}
		System.out.println("---- RELATÓRIO DE CHAMADAS POR ERRO ----");
		for (int i = 0; i < 3; i++) {
			System.out.println("Número de chamadas por erro [" + (i + 1) + "]" + ": " + contErro[i]);
		}
	}

	public static int[] relatorioCriterio(int[][] chamados) {
		int[] arrayCriterios = new int[4];

		for (int i = 0; i < 4; i++) {
			if (chamados[i][2] == 1) {
				arrayCriterios[0]++;
			} else if (chamados[i][2] == 2) {
				arrayCriterios[1]++;
			} else if (chamados[i][2] == 3) {
				arrayCriterios[2]++;
			} else {
				arrayCriterios[3]++;
			}
		}

		return arrayCriterios;
	}

}
