package Matriz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exemplo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);
		DecimalFormat moeda = new DecimalFormat("R$ #,##0.00");

		int matrizProd[][] = new int[5][2];
		double matrizPreco[][] = new double[5][2];
		int totalGeral=0;

		for (int linha = 0; linha < 5; linha++) {
			System.out.print("Digite o código: ");
			matrizProd[linha][0]=e.nextInt();
			
			System.out.print("Digite o preço: ");
			matrizPreco[linha][0]=e.nextDouble();
			
			System.out.print("Digite a quantidade? ");
			matrizProd[linha][1]=e.nextInt();
			
			matrizPreco[linha][1]=matrizPreco[linha][0]*matrizProd[linha][1];
			totalGeral += matrizPreco[linha][1];
			}
		
		for (int i=0;i<5;i++) {
			System.out.println("Código: "+matrizProd[i][0]+" Preço: "+moeda.format(matrizPreco[i][0])
					+" Quantidade: "+matrizProd[i][1] + " Total: "+moeda.format( matrizPreco[i][1]));
		}
		
		System.out.println("Total Geral: "+totalGeral);
		
		}

	}


