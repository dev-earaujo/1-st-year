package FIAP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicioextra {

	static Scanner e = new Scanner(System.in);
	static DecimalFormat formata = new DecimalFormat("R$ ###,###.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// vetor dos modelos
		String[] arrayCarro = new String[] { "Uno", "Palio", "Siena", "Bravo", "Strada", "Idea" };

		// vetor dos precos
		double[] arrayPreco = new double[] { 25370, 26490, 30000, 56800, 36200, 43890 };

		// chamada da função carregar
		int[][] matrizQtdVendas = matrizQtdCarros(arrayCarro);

		// tudo
		relatorioGeral(arrayCarro, matrizQtdVendas, arrayPreco);

	}// MAIN END

	public static int[][] matrizQtdCarros(String[] arrayCarro) {
		int[][] matrizQtdVendas = new int[3][6];

		for (int i = 0; i < 3; i++) {
			System.out.println("==== Vendas " + (i + 1) + "° TRI ====");
			for (int j = 0; j < 6; j++) {
				System.out.print("Carro [" + arrayCarro[j] + "]: ");
				matrizQtdVendas[i][j] = e.nextInt();
			}
		}

		return matrizQtdVendas;
	}

	// array para mostrar a qtd total de carros de cada linha
	public static int[] arrayQtdCarros(int[][] matrizQtdVendas) {
		int[] arrayQtdCarros = new int[6];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				arrayQtdCarros[j] += matrizQtdVendas[i][j];
			}
		}
		return arrayQtdCarros;
	}

	// array para mostrar o preço total de cada linha de carro
	public static double[] arrayPrecoVendas(double[] arrayPreco, int[] arrayQtdCarros) {
		double[] arrayPrecoTotal = new double[6];

		for (int i = 0; i < 6; i++) {
			arrayPrecoTotal[i] += arrayQtdCarros[i] * arrayPreco[i];
		}

		return arrayPrecoTotal;
	}

	// array para mostrar a quantidade de carros vendidos em cada trimestre
	public static int[] arrayCarrosPorTrimestre(int[][] matrizQtdVendas) {
		int[] arrayCarrosQtdTrismestre = new int[3];

		for (int j = 0; j < 6; j++) {
			for (int i = 0; i < 3; i++) {
				arrayCarrosQtdTrismestre[i] += matrizQtdVendas[i][j];
			}
		}

		System.out.println("=== VENDAS TRIMESTRAIS ===");
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "° TRI - TOTAL DE CARROS VENDIDOS: " + arrayCarrosQtdTrismestre[i]);
		}

		return arrayCarrosQtdTrismestre;
	}

	public static void relatorioGeral(String[] arrayCarro, int[][] matrizQtdVendas, double[] arrayPreco) {

		int[] arrayQtdCarros = arrayQtdCarros(matrizQtdVendas);

		int[] arrayCarrosQtdTrismestre = arrayCarrosPorTrimestre(matrizQtdVendas);

		double[] arrayPrecoTotal = arrayPrecoVendas(arrayPreco, arrayQtdCarros);
		

		for (int i = 0; i < 6; i++) {
			System.out.println("Carro: " + arrayCarro[i] + "\t" + "Quantidade Geral: " + arrayQtdCarros[i] + "\t"
					+ "Total: " + formata.format(arrayPrecoTotal[i]) + "\t");
		}
		
		System.out.println("====== Ranking de Carros ======");
		ranking (arrayPrecoTotal, arrayCarro);

	}
	

	public static void ranking(double [] arrayPrecoTotal, String [] arrayCarro) {
		
		String [] arrayCarrosRanking = new String [6];
		int [] arrayPrecosRanking = new int [6];
		double aux=0;
		String guardaCarro=null;
		
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				if (arrayPrecoTotal[i] > arrayPrecoTotal[j]) {
				aux = arrayPrecoTotal[i];
				guardaCarro = arrayCarro[i];
				arrayPrecoTotal[i]=arrayPrecoTotal[j];
				arrayCarro[i] = arrayCarro[j];
				arrayPrecoTotal[j]=aux;
				arrayCarro[j] = guardaCarro;
				}
			}
		}
		
		for (int i=0;i<6;i++) {
			System.out.println((i+1)+"º "+arrayCarro[i]+" --- "+formata.format(arrayPrecoTotal[i]));
		}
	}
}
