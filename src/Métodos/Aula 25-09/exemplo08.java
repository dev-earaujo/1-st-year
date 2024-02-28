package FIAP;

import java.util.Scanner;

public class exemplo08 {

	static Scanner e = new Scanner(System.in);
	// vetor global
	static String[] linhaProdutos = new String[] { "Computador", "Notebook", "Tablet" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// vetor local
		String[] meses = new String[] { "Jan", "Fev", "Mar" };

		// chamada da função
		int[][] produtos = carregaMatriz(meses);
		// chamda função soma linha de produtos
		int[] somaProduto = somaLinhaMatriz(produtos);
		//chamada da função soma das colunas
		int[] somaMes = somaColunaMes(produtos);
		//chamada procedimento relatório
		relatorio(meses,somaProduto, somaMes);
		

	}// Main END

	public static int[][] carregaMatriz(String[] meses) {
		int[][] produtos = new int[3][3];

		for (int i = 0; i < 3; i++) {
			System.err.println(linhaProdutos[i]);
			for (int j = 0; j < 3; j++) {
				System.out.println("Qtd Mês de " + meses[j] + ": ");
				produtos[i][j] = e.nextInt();
			}
		}

		return produtos;
	}

	public static int[] somaLinhaMatriz(int[][] produtos) {

		int[] somaProduto = new int[3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				somaProduto[i]+=produtos[i][j];
			}
		}

		return somaProduto;
	}

	
	public static void relatorio(String [] meses, int [] somaProduto, int[] somaMes) {
		
		//exibir soma dos produtos
		System.out.println("Soma dos Produtos no trimestre: ");
		for (int i=0;i<3;i++) {
			System.out.println(linhaProdutos[i]+" - "+ somaProduto[i]);
		}
		//exibir soma dos meses
		System.out.println("Soma dos produtos por Mês: ");
		for (int i=0;i<3;i++) {
			System.out.println(meses[i]+" - "+ somaMes[i]);
		}
		
	}
	
	public static int[] somaColunaMes(int [][] produtos) {
		
		int[] somaMes = new int[3];
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				somaMes[i] += produtos[j][i];
			}
		}
		
		return somaMes;
	}
}
