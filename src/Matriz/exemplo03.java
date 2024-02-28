package Matriz;

import java.util.Scanner;

public class exemplo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner e = new Scanner(System.in);
		
		double matrizNotas[][] = new double[3][4];
		
		
		for (int a=0;a<3;a++) {
			System.out.println("Aluno "+(a+1));
			for(int n=0;n<3;n++) {
				System.out.println("Informe a nota da "+(n+1)+"° prova: ");
				matrizNotas[a][n]=e.nextDouble();
				//soma das notas
				matrizNotas[a][3]+=matrizNotas[a][n];
			}
			//calculo das médias
			matrizNotas[a][3]= matrizNotas[a][3]/3;
		}
		
		
		for(int a=0;a<3;a++) {
			for(int n=0;n<4;n++) {
				System.out.print(matrizNotas[a][n]+"\t");
			}
			System.out.println("");
		}
		
		
		
		
	}

}
