package Matriz;

import java.util.Scanner;

public class exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int numeros[][] = new int[3][3];

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {

				System.out.print("Matriz Números [" + linha + "," + coluna + "]");
				numeros[linha][coluna] = e.nextInt();

			}
		}

		// EXIBIR MATRIZ
		System.out.println("");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print(numeros[linha][coluna]+"\t");
			}
			System.out.println("");
		}

	}
}
