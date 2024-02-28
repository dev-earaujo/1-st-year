package lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat ("R$ ###0.00");
		
		double precoCar = 0, total = 0;
		int percentual = 0;
		
		System.out.println("Digite o valor do carro: ");
		precoCar = e.nextDouble();
		
		System.out.println("Preço final a vista com desconto de 20%: " + numFormatado.format(precoCar*0.8));
		
		for (int contador=6;contador<66;contador+=6) {
			percentual+=3;
			//aplicação do acréscimo de juros
			total = precoCar + (precoCar * percentual/100);
			System.out.println("O preço final parcelado em " + contador + "X é de " + numFormatado.format(total) + "com parcelas de "
					+ numFormatado.format(total/contador));
		}
		
		
		
	}

}
