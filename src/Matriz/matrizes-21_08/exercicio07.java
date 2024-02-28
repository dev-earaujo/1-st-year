import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);
		DecimalFormat dist = new DecimalFormat("##0.0");

		String cidades[] = new String[] { "A", "B", "C", "D", "E" };
		double distancia[][] = new double[5][5];
		double consumo = 0, distGasto=0;

		System.out.println("-------- NOMES DAS CIDADES --------");
		for (int l = 0; l < 5; l++) {
			System.out.println("Informe o nome da " + (l + 1) + "° cidade: " + cidades[l]);
		}
		System.out.println("-----------------------------------");

		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {

				if (l != c) {
					System.out.println("Informe a distância entre a cidade " + cidades[c] + " e " + cidades[l] + ": ");
					distancia[l][c] = e.nextDouble();
				}

				if (l == c) {
					distancia[l][c] = 0;
				}
			}
		}
		System.out.println("---------------------------------------------");
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				System.out.print(dist.format(distancia[l][c]) + "\t");
			}
			System.out.println("");
		}
		System.out.println("-----------------------------------------------");
		System.out.println("----- CONSUMO DE COMBUSTÍVEL PELO VEÍCULO -----");
		System.out.println("Informe o consumo de um veículo: ");
		consumo=e.nextDouble();
		System.out.println("-----------------------------------------------");
		System.out.println("");
		
		
		System.out.println("");
		System.out.println("---------------- Percursos Inferiores à 250 KM ----------------");
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				if (distancia[l][c] <= 250 && (l!=c)) {
					System.out.println("-- Distância: " + dist.format(distancia[l][c]) + " Km" + " -- Entre a cidade " + cidades[c]
							+ " e " + cidades[l]);
				}
			}
		}

		
		System.out.println("------------------- CONSUMO POR PERCURSO ---------------------");
		for(int l=0;l<5;l++) {
			for(int c=0;c<5;c++) {
				distGasto=distancia[l][c]/consumo;
				
				System.out.println("Consumo entre a cidade " + cidades[c]+ " e " + cidades[l]+" é: "+dist.format(distGasto));
			}
		}
		
		
		
		
		
		
		
		
	}

}