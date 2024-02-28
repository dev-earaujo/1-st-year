import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		String lojas[] = new String[] { "LojaA", "LojaB", "LojaC", "LojaD", "LojaE" };
		String produtos[] = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L" };
		double matriz[][] = new double[12][5];
		double precoBarato = 0, precoCaro = 0;
		String produtoBarato = null, produtoCaro = null, lojaBarata = null, lojaCara = null;

		for (int l = 0; l < 12; l++) {
			System.out.println("---------- Produto " + produtos[l] + " ----------");
			for (int c = 0; c < 5; c++) {
				System.out.println("Informe o preço na loja" + lojas[c] + ":");
				matriz[l][c] = e.nextDouble();
			}
		}

		for (int l = 0; l < 12; l++) {
			for (int c = 0; c < 5; c++) {
				//Menor Preco
				if (l == 0) {
					precoBarato = matriz[l][c];
					produtoBarato = produtos[l];
					lojaBarata = lojas[c];
				} else {
					if (matriz[l][c] < precoBarato) {
						precoBarato = matriz[l][c];
						produtoBarato = produtos[l];
						lojaBarata = lojas[c];
					}
				}
				
				//Maior Preco
				if (matriz[l][c] > precoCaro) {
					precoCaro = matriz[l][c];
					produtoCaro = produtos[l];
					lojaCara = lojas[c];
				}

			}//for c
		}//for l

		System.out.println("-------------------------------------------------");
		System.out.println("");
		System.out.println("Produto mais barato: " + produtoBarato);
		System.out.println("Loja: " + lojaBarata);
		System.out.println("Preço: " + precoBarato);

		System.out.println("-------------------------------------------------");
		System.out.println("");
		System.out.println("Produto mais caro: " + produtoCaro);
		System.out.println("Loja: " + lojaCara);
		System.out.println("Preço: " + precoCaro);

	}

}
