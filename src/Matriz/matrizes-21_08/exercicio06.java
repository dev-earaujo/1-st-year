import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);
		DecimalFormat moeda = new DecimalFormat("R$ #,##0.00");

		String produtos[] = new String[] { "Camisa", "Blusa", "Calça", "Vestido", "Meia" };
		double precos[][] = new double[5][4];
		double impostos[][] = new double[5][4];
		double custo[] = new double[] { 10, 15, 20, 10, 5 };
		double custoFinal=0;

		//carrega matri precos e impostos
		for (int p = 0; p < 5; p++) {
			System.out.println("Informe o preço do produto " + produtos[p]);
			for (int l = 0; l < 4; l++) {
				System.out.println("Preço do produto na loja " + (l + 1) + ": ");
				precos[p][l] = (double) (Math.random() * 120);

				// Seleção encadeada para verificar imposto

				if (precos[p][l] <= 50) {
					impostos[p][l] = precos[p][l] * 0.05;
				} else if (precos[p][l] > 50 && precos[p][l] <= 100) {
					impostos[p][l] = precos[p][l] * 0.10;
				} else {
					impostos[p][l] = precos[p][l] * 0.20;
				}

			}
		}

		
		for(int i=0;i<5;i++) {
			System.out.println(" ");
			System.out.println("Nome do produto: "+produtos[i]+" - Custo do Trnasporte: "+moeda.format(custo[i]));
			for(int j=0;j<4;j++) {
				custoFinal=impostos[i][j]+precos[i][j]+custo[i];
				
				System.out.println("-------- Loja: "+(j+1)+" --------");
				System.out.println("Imposto: "+moeda.format(impostos[i][j]));
				System.out.println("Preço: "+moeda.format(precos[i][j]));
				System.out.println("Preço Final: "+moeda.format(custoFinal));
			}
		}
		
		
		
		
		
	}

}
