import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int sem1[][] = new int[5][3];
		int sem2[][] = new int[5][3];
		int anual[][] = new int[5][3];
		int totalUnidade = 0, maiorCurso=0, indMaior=0;
		int totalCurso[] = new int[5];

		System.out.println("---- Primeiro Semestre ----");
		System.out.println("");

		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 3; c++) {
				System.out
						.println("Quantidade de matrículas na unidade " + (c + 1) + " do " + "curso " + (l + 1) + ":");
				sem1[l][c] = (int) (Math.random() * 20);

				anual[l][c] += sem1[l][c];
			}
		}

		System.out.println("---- Segundo Semestre ----");
		System.out.println("");
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 3; c++) {
				System.out
						.println("Quantidade de matrículas na unidade " + (c + 1) + " do " + "curso " + (l + 1) + ":");
				sem2[l][c] = (int) (Math.random() * 20);

				anual[l][c] += sem2[l][c];
			}
		}

		System.out.println("---- Matriz Anual ----");
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(anual[l][c] + "\t");
			}
			System.out.println("");
		}
		// total de matriculados por cada unidade
		System.out.println("----------------------");
		for (int c = 0; c < 3; c++) {
			for (int l = 0; l < 5; l++) {
				totalUnidade += anual[l][c];
			}
			System.out.print("Total de matrículas por unidade no ano: "+totalUnidade+" (Unidade "+(c+1)+")");
			System.out.println("");
			totalUnidade = 0;
		}
		System.out.println("----------------------");
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 3; c++) {
				totalCurso[l] += anual[l][c];
			}
			System.out.println("Total de matrículas de cada curso no ano: "+totalCurso[l]+" (Curso "+(l+1)+")");
		}

		System.out.println("----------------------");
		for(int l=0;l<5;l++) {
			maiorCurso=0;
			for(int c=0;c<3;c++) {
				if(anual[l][c] > maiorCurso) {
					maiorCurso=anual[l][c]; //guardando o maior número de matriculas no ano
					indMaior=c; //guardando o local
				}//fim do if
			}
			System.out.println("Curso "+(l+1)+": "+maiorCurso+" - Unidade "+(indMaior+1));
		}
		
		
		
		
		
		
		
		
	e.close();	
	}
}
