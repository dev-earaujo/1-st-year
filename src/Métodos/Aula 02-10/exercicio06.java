package FIAP;

import java.util.Scanner;

public class exercicio06 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// chamada do Sexo
		char[] arraySexo = sexo();

		// chamada do Olho
		char[] arrayCorOlhos = corOlhos();

		// chamada do Cabelo
		char[] arrayCorCabelo = corCabelo();

		// chamada da Idade
		int[] arrayIdade = idade();

		// chamada da Média da Idade de pessoas com cabelos pretos e olhos castanhos
		double mediaIdadeOlhoCabelo = calculaMediaIdade(arrayCorCabelo, arrayCorOlhos, arrayIdade);
		System.out.println("");
		System.out.println("- MÉDIA DE IDADE PESSOAS COM CABELOS PRETOS E OLHOS CASTANHOS -");
		System.out.println(mediaIdadeOlhoCabelo);
		
		//chamada da Maior idade entre os habitantes
		int idadeMaior = maiorIdade(arrayIdade);
		System.out.println("");
		System.out.println("- MAIOR IDADE ENTRE OS HABITANTES -");
		System.out.println(idadeMaior);

	}// Main END

	public static char[] sexo() {
		char[] arraySexo = new char[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o sexo (F ou M): ");
			arraySexo[i] = e.next().toUpperCase().charAt(0);

			while (arraySexo[i] != 'M' && arraySexo[i] != 'F') {
				System.out.println("Informação inválida, digite novamente! (F - Fêmea | M - Macho)");
				arraySexo[i] = e.next().toUpperCase().charAt(0);
			}
		}

		return arraySexo;
	}

	public static char[] corOlhos() {
		char[] arrayCorOlhos = new char[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a cor dos olhos (A ou C): ");
			arrayCorOlhos[i] = e.next().toUpperCase().charAt(0);

			while (arrayCorOlhos[i] != 'A' && arrayCorOlhos[i] != 'C') {
				System.out.println("Informação inválida, digite novamente! (A - Azuis | C - Castanhos)");
				arrayCorOlhos[i] = e.next().toUpperCase().charAt(0);
			}
		}

		return arrayCorOlhos;
	}

	public static char[] corCabelo() {
		char[] arrayCorCabelo = new char[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a cor dos cabelos (L , P ou C): ");
			arrayCorCabelo[i] = e.next().toUpperCase().charAt(0);

			while (arrayCorCabelo[i] != 'L' && arrayCorCabelo[i] != 'P' && arrayCorCabelo[i] != 'C') {
				System.out.println("Informação inválida, digite novamente! (L - Louros | P - Pretos | C - Castanhos)");
				arrayCorCabelo[i] = e.next().toUpperCase().charAt(0);
			}
		}

		return arrayCorCabelo;
	}

	public static int[] idade() {
		int[] arrayIdade = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a idade: ");
			arrayIdade[i] = e.nextInt();
		}

		return arrayIdade;
	}

	public static double calculaMediaIdade(char[] arrayCorCabelo, char[] arrayCorOlhos, int[] arrayIdade) {
		double mediaIdadeOlhoCabelo = 0;
		int idadePessoas=0, qtdPessoas=0;
		
		for (int i = 0; i < 5; i++) {
			if (arrayCorOlhos[i] == 'C' && arrayCorCabelo[i] == 'P') {
				idadePessoas+=arrayIdade[i];
				qtdPessoas++;
			}
		}
		

		mediaIdadeOlhoCabelo = (idadePessoas/qtdPessoas);
		
		return mediaIdadeOlhoCabelo;
	}
	
	public static int maiorIdade(int[] arrayIdade) {
		int idadeMaior=0;
		
		for (int i=0;i<5;i++) {
			if(arrayIdade[i] > idadeMaior) {
				idadeMaior=arrayIdade[i];
			}
		}
		
		return idadeMaior;
	}
}
