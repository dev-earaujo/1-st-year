package Matriz;

import java.util.Scanner;

public class exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int matriz[][] = new int[4][4];
		int somaLinha = 0;
		int somaVetor[] = new int[4];
		int somaColuna[] = new int[4];
		int totalGeral=0;

		// i=linha - j=coluna
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("Digite o valor [" + i + "," + j + "]: ");
				matriz[i][j] = e.nextInt();
			}
		}

		System.err.println("");
		for (int i = 0; i < 4; i++) {
			somaLinha = 0;
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + "\t");
				somaLinha += matriz[i][j];
				totalGeral += matriz[i][j];
			}
			System.out.println("Soma da linha: "+somaLinha);
			System.out.println("total Geral: "+ totalGeral);
			System.out.println("");
		}
		
		//SOMAR MATRIZ COM VETOR
		for (int i = 0; i < 4; i++) {
			
			for (int j=0;j<4;j++) {
				somaVetor[i]+=matriz[i][j];
			
			}
			System.out.println("Soma da linha: "+somaVetor[i]);
		}
		
		
		//SOMAR COLUNA
				for (int i = 0; i < 4; i++) {
					
					for (int j=0;j<4;j++) {
						somaColuna[j]+=matriz[j][i];
					
					}
					System.out.println("Soma da coluna: "+somaColuna[i]);
				}
				
		

		
		
		
	}
}
