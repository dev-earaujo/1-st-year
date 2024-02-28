package FIAP;

import java.util.Scanner;


public class exercicio08 {

	static Scanner e = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] arrayProdutos = new String[] {"Notebook", "Computadores", "Tablets", "Servidores"};
		int [] arrayMetaVendas = new int[] {100, 150, 200, 250};
		
		
		//chamada da matriz com as vendas
		int [][] vendasTrimestre = matrizVendasTrimestre(arrayProdutos);
		
		//chamada da quantidade de produtos vendidos por linha
		int [] produtosPorLinha = qtdProdutosLinha(vendasTrimestre);
		
		//chamada da quantidade de produtos vendidos em cada trimestre (vendidos por coluna)
		int [] vendasTotalTrimestre = totalVendasTrimestre(vendasTrimestre);
		
		//chamada da verificação se atingiu a meta
		String[] totalMeta = arrayMeta(produtosPorLinha, arrayMetaVendas, arrayProdutos);
		
		
		
	}//MAIN END
	
	public static int [][] matrizVendasTrimestre(String[] arrayProdutos){
		int [][] vendasTrimestre = new int [4][3];
		
		for (int i=0;i<4;i++) {
			System.out.println("----- Produto: "+ arrayProdutos[i]+" -----");
	
			for (int j=0;j<3;j++) {
				System.out.println("Digite a quantidade vendida no "+(j+1)+"° trimestre: ");
				vendasTrimestre[i][j]=e.nextInt();
			}
		}
		
		
		return vendasTrimestre;
	}

	public static int [] qtdProdutosLinha (int [][] vendasTrimestre) {
		int [] produtosPorLinha = new int [4];
		
		//soma das linhas
		for (int i=0; i<4;i++) {
			for (int j=0;j<3;j++) {
				produtosPorLinha[i] += vendasTrimestre[i][j];
			}
			System.out.println("");
			System.out.println("Quantidade de produtos vendidos na "+(i+1)+"° linha: "+produtosPorLinha[i]);
			System.out.println("=========================================================================");
		}
		return produtosPorLinha;
	}

	public static int [] totalVendasTrimestre (int [][] vendasTrimestre) {
		int [] vendasTotalTrimestre = new int [4];
		
		for (int i=0;i<3;i++) {
		
			for (int j=0; j<4;j++) {
			
				vendasTotalTrimestre[i] += vendasTrimestre [j][i];
			}
			System.out.println("");
			System.out.println("Vendas do "+(i+1)+"° Trimestre: "+vendasTotalTrimestre[i]);
			System.out.println("==============================");
		}
		
		return vendasTotalTrimestre;
	}

	public static String[] arrayMeta (int[] produtosPorLinha, int[] arrayMetaVendas, String[] arrayProdutos) {
		String[] totalMeta = new String[4];
		
		for (int i=0;i<4;i++) {
			if (produtosPorLinha[i] >= arrayMetaVendas[i]) {
				totalMeta[i] = "Sim";
			}else {
				totalMeta[i] = "Não";
				
			}
			
			System.out.println("O produto "+(arrayProdutos[i])+ "atingiu a meta? "+totalMeta[i]);
		}
		
		return totalMeta;
	}


}
