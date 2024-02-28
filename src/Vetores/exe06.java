package Vetores;

import java.util.Scanner;

public class exe06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int vetor1[] = new int[] { 7, 5, 3, 4, 1 };
		int vetor2[] = new int[] { 2, 9, 10, 8, 6 };
		int resultante[] = new int[10];
		int j = 0;

		for (int i = 0; i < 5; i++) {

			resultante[j] = vetor1[i];
			System.out.println("Valor resultante: " + resultante[j]);

			j++;

			resultante[j] = vetor2[i];
			System.out.println("Valor resultante: " + resultante[j]);

			j++;
		}

		e.close();
	}

}
