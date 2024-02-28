package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat fMoeda = new DecimalFormat("###0.00");
		Scanner e = new Scanner(System.in);

		int numParc = 0;
		double valInicial = 0, juros = 0, valParc = 0, total = 0, valJuros = 0;

		System.out.println("Digite o valor da dívida:");
		valInicial = e.nextDouble();

		numParc = 1;
		total = valInicial;
		valParc = valInicial;

		System.out.println("Total: "+ total + " Juros: "+ juros + " Números Parcelas: "+ numParc + " Valor da Parcela: "
			+ valParc);

		juros=10;
		numParc+=2;
		
		for (int cont = 1; cont < 5; cont++) {
			
			valJuros = (valInicial*juros)/100;
			total = valInicial + valJuros;
			valParc = total/numParc;
			
			System.out.println("Total: "+fMoeda.format(total) + " Juros: "+juros + " Números Parcelas: "+numParc
					+ " Valor da Parcela: "+fMoeda.format(valParc));
			
			juros+=5;
			numParc+=3;
		}

	}

}
