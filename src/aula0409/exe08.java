package aula0409;

import java.util.Scanner;

public class exe08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int matriz[][] = new int[5][3];
		int somaArmz[] = new int[4];
		int totalProd[] = new int[3];
		int qtdTotalArmazem=0;
		int custoTotalProduto[] = new int [3];
		int prod2=0, armz2=0, menorEstoque=0, maiorEstoque=0, menorArmazem=0, maiorArmazem=0;

		for (int i = 0; i < 4; i++) {
			System.out.println("---- Estoque no armazém ( " + (i + 1) + " ) ----");
			for (int j = 0; j < 3; j++) {
				System.out.print("---- Informe a quantidade em estoque do " + "Produto ( " + (j + 1) + " ) : ");
				matriz[i][j] = e.nextInt();
				
				//Soma dos Armazens
				somaArmz[i]+=matriz[i][j];
				
				//Maior estoque do produto 2
				if(j==1 && prod2<matriz[i][j]) {
					prod2=matriz[i][j];
					armz2=i;
				}
				
					
				
			}
		}
		
		System.out.println("");
		System.out.println("------------ CUSTO DE CADA PRODUTO ------------");
		for (int c = 0; c < 3; c++) {
			System.out.print("---- Informe o custo de cada" + "Produto ( " + (c + 1) + " ) : ");
			matriz[4][c] = e.nextInt();
		}
		
		System.out.println("");
		System.out.println("------------ QUANTIDADE DE ITENS EM CADA ARMAZÉM ------------");
		for (int i=0;i<4;i++) {
			System.out.println("---- Estoque no armazém ( "+(i+1)+" ) : "+somaArmz[i]);
		}
		
		System.out.println("");
		System.out.println("------------ ARMAZÉM COM MAIOR ESTOQUE DO PRODUTO 2 ------------");
			System.out.println("---- Armazém ( "+(armz2+1)+" ) - Quantidade em estoque: "+prod2);
		
		System.out.println("");	
		System.out.println("------------ ARMAZÉM COM MAIOR E MENOR ESTOQUE -----------");
		for(int i=0;i<4;i++) {
			if(i==0) {
				menorEstoque=somaArmz[i];
				menorArmazem=i+1;
			} else if (menorEstoque>somaArmz[i]) {
				menorEstoque=somaArmz[i];
				menorArmazem=i+1;
			}
			if(somaArmz[i] > maiorEstoque) {
				maiorEstoque=somaArmz[i];
				maiorArmazem=i+1;
			}
		}
		
		System.out.println("");
		System.out.println("---- Armazém ( "+(menorArmazem)+" ) - Quantidade em estoque: "+menorEstoque);
		System.out.println("---- Armazém ( "+(maiorArmazem)+" ) - Quantidade em estoque: "+maiorEstoque);
		
		System.out.println("");
		System.out.println("------------ CUSTO TOTAL DE CADA PRODUTO -----------");
		

			
			for(int i=0;i<3;i++) { //produto (coluna)
				for (int j=0;j<4;j++) { //armazem (linha)
					totalProd[i]+=matriz[j][i];
				}
				
				custoTotalProduto[i] = totalProd [i]*matriz[4][i];
				System.out.println("Custo total do produto ( "+(i+1)+" ) : "+custoTotalProduto[i]);
				
			}
		
			System.out.println("");
			System.out.println("------------ CUSTO TOTAL DE CADA ARMAZÉM ------------");
			System.out.println("");
			
			for (int i=0;i<4;i++) {
				qtdTotalArmazem=0;
				for (int j=0;j<3;j++) {
					qtdTotalArmazem+=matriz[i][j]*matriz[4][j];
				}
				
				System.out.println("Custo total do armazém ( "+ (i+1)+" ) : "+ qtdTotalArmazem);
			}
			
			
			
			
		
	}

}
