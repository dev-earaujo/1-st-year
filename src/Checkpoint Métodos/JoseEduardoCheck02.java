import java.util.Scanner;

public class JoseEduardoCheck02 {
	static Scanner e = new Scanner(System.in);
	static int somaMatriz = 0;

	public static void main(String[] args) {

		String[] arrayLinhaProdutos = new String[] { "Perfumaria", "Maquiagem", "Cabelo" };
		String[] arrayRegioesBrasil = new String[] { "Sul", "Sudeste", "Norte", "Nordeste" };

		// chamada da função para a entrada de dados referente às vendas
		int[][] matrizVendas = matrizVendasProdutos(arrayLinhaProdutos, arrayRegioesBrasil);

		// chamada da função para verificar o total de vendas por produto
		int[] vendasProdutos = totalVendasProdutos(matrizVendas);

		for (int i = 0; i < 3; i++) {
			System.out.println("Total de vendas [" + arrayLinhaProdutos[i] + "]: " + vendasProdutos[i]);

		}

		// chamada do procedimento para mostrar o ranking
		rankingVendas(arrayLinhaProdutos, vendasProdutos);

		// chamada do procedimento para mostrar qual foi a maior venda realizada
		maiorVenda(arrayLinhaProdutos, arrayRegioesBrasil, matrizVendas);

	}// Main END

	public static int[][] matrizVendasProdutos(String[] arrayLinhaProdutos, String[] arrayRegioesBrasil) {
		int[][] matrizVendas = new int[4][3];

		for (int i = 0; i < 4; i++) {
			System.out.println("======== REGIÃO " + arrayRegioesBrasil[i] + " ========");
			for (int j = 0; j < 3; j++) {
				System.out.print("Digite a quantidade de vendas do produto [" + arrayLinhaProdutos[j] + "]: ");
				matrizVendas[i][j] = e.nextInt();
				somaMatriz += matrizVendas[i][j];
			}
		}

		return matrizVendas;
	}

	public static int[] totalVendasProdutos(int[][] matrizVendas) {
		int[] vendasProdutos = new int[3];

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 3; i++) {
				vendasProdutos[i] += matrizVendas[j][i];
			}
		}

		return vendasProdutos;
	}

	public static void rankingVendas(String[] arrayLinhaProdutos, int[] vendasProdutos) {

		int aux = 0;
		String guardaProduto;

		//ordenando o vetor para mostrar no ranking
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (vendasProdutos[i] > vendasProdutos[j]) {
					aux = vendasProdutos[i];
					guardaProduto = arrayLinhaProdutos[i];
					vendasProdutos[i] = vendasProdutos[j];
					arrayLinhaProdutos[i] = arrayLinhaProdutos[j];
					vendasProdutos[j] = aux;
					arrayLinhaProdutos[j] = guardaProduto;
				}
			}
		}

		// exibindo o ranking
		System.out.println("===============================");
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "° Lugar: " + vendasProdutos[i] + " [" + arrayLinhaProdutos[i] + "]");
		}
		System.out.println("===============================");
	}

	public static void maiorVenda(String[] arrayLinhaProdutos, String[] arrayRegioesBrasil, int[][] matrizVendas) {

		int maiorVendaValor = 0;
		String maiorVendaRegiao = null, maiorVendaLinha = null, guardaProduto=null;
		
		
		//reoganizando o vetor para poder exibir a linha correta de produto (havia sido ordenado no método anterior)
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				guardaProduto = arrayLinhaProdutos[i];
				arrayLinhaProdutos[i] = arrayLinhaProdutos[j];
				arrayLinhaProdutos[j] = guardaProduto;
			}
		}
		
		
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {

				if (matrizVendas[i][j] > maiorVendaValor) {
					maiorVendaValor = matrizVendas[i][j];
					maiorVendaRegiao = arrayRegioesBrasil[i];
					maiorVendaLinha = arrayLinhaProdutos[j];
				}
			}
		}
		System.out.println("===============================");
		System.out.println("Valor: " + maiorVendaValor);
		System.out.println("Região: " + maiorVendaRegiao);
		System.out.println("Linha: " + maiorVendaLinha);
		System.out.println("===============================");
	}


}
