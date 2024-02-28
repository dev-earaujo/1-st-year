package aula04_1704;

import java.text.DecimalFormat;
import java.util.Scanner;

public class aula04_exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("#0.00");

		int voto = 0, voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, nulo = 0, branco = 0, totalVotos = 0, contador = 0;
		double porcNulo, porcBranco;

		System.out.print("Digite o voto: ");
		voto = entrada.nextInt();

		while (voto != 0) {
			switch (voto) {
			case 1:
				voto1++;
				break;
			case 2:
				voto2++;
				break;
			case 3:
				voto3++;
				break;
			case 4:
				voto4++;
				break;
			case 5:
				nulo++;
				break;
			case 6:
				branco++;
				break;
			default:
				System.out.println("Voto inválido!");
				contador--;
			}
			contador++;

			System.out.print("Digite o voto: ");
			voto = entrada.nextInt();
		}
		totalVotos = voto1 + voto2 + voto3 + voto4 + nulo + branco;
		System.out.println("Votos no 1° Candidato: " + voto1);
		System.out.println("Votos no 2° Candidato: " + voto2);
		System.out.println("Votos no 3° Candidato: " + voto3);
		System.out.println("Votos no 4° Candidato: " + voto4);
		System.out.println("Votos em branco: " + branco);
		System.out.println("Votos nulos: " + nulo);
		porcNulo = (nulo * 100) / totalVotos;
		porcBranco = (branco * 100) / totalVotos;
		System.out.println("Porcentagem de votos nulos: " + numFormatado.format(porcNulo) + "%");
		System.out.println("Porcentagem de votos em branco: " + numFormatado.format(porcBranco) + "%");

	}

}
