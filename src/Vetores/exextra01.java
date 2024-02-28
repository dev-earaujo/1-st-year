package Vetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exextra01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner e = new Scanner(System.in);
		DecimalFormat moeda = new DecimalFormat("R$ #,##0.00");
		DecimalFormat qtd = new DecimalFormat("#000");
		
		double valUnitario[] = new double[10];
		int qtdPeca[] = new int[10];
		double total[] = new double[10];
		double totGeral=0, comissao=0, maiorPreco=0, maiorQtd=0;
		
		
		
		for(int i=0;i<10;i++) {
			System.out.println("---------- PRODUTO "+(i+1)+" ----------");
			
			System.out.println("Informe o preço unitário do objeto: ");
			valUnitario[i]=e.nextDouble();
			
			System.out.println("Informe a quantidade vendida: ");
			qtdPeca[i]=e.nextInt();
			
			total[i]=valUnitario[i]*qtdPeca[i];
			
			if(qtdPeca[i] > maiorQtd) {
				maiorQtd=qtdPeca[i];
				maiorPreco=valUnitario[i];
			}
		}
		
		System.out.println("---------------- RELATÓRIO DE VENDAS ---------------");
		for(int r=0;r<10;r++) {
			System.out.println("Qtde.: "+qtd.format(qtdPeca[r])+"          "+"Preço: "+moeda.format(valUnitario[r])+"          "+"Total: "+moeda.format(total[r]));
			totGeral+=total[r];
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("Total Geral: "+moeda.format(totGeral));
		
		comissao+=(totGeral*5)/100;
		
		System.out.println("------------------ COMISSÃO -----------------");
		System.out.println(moeda.format(comissao));
		System.out.println("---------------------------------------------");
		
		System.out.println("----- PREÇO DA MAIOR QUANTIDADE VENDIDA -----");
		System.out.println(moeda.format(maiorPreco));
		System.out.println("---------------------------------------------");
		e.close();
	}

}
