package FIAP;

import java.util.Scanner;

public class Treinamento {

	static String[] racers = new String[] { "Daniel Ricciardo", "Kimi Raikkonen", "Lewis Hamilton", "Nico Rosberg",
			"Sebastian Vettel" };

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] countriesRacers = new String[] { "Bélgica", "Itália", "Cingapura", "Malásia", "Japão" };

		relatorioGerencial(countriesRacers);

	} // Main END

	public static void relatorioGerencial(String[] countriesRacers) {
		int[][] arrayPontosPiloto = pontuacao(countriesRacers);
		int[] verificacao = verificaPontuacao(arrayPontosPiloto);
		int[] arrayWinner = winnerPerGP(arrayPontosPiloto, countriesRacers);
		theBigWinner(arrayPontosPiloto, verificacao);
	}

	public static int[][] pontuacao(String[] countriesRacers) {
		int[][] arrayPontosPiloto = new int[5][5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Piloto: " + racers[i]);
			for (int j = 0; j < 5; j++) {
				System.out.println("-- Pontuação GP " + countriesRacers[j]+": ");
				arrayPontosPiloto[i][j] = e.nextInt();
			}
		}

		return arrayPontosPiloto;
	}
	
	public static int[] verificaPontuacao(int [][] arrayPontosPiloto) {
		int [] verificacao = new int[5];
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				verificacao[i]+=arrayPontosPiloto[i][j];
			}
		}
		
		for (int i=0;i<5;i++) {
			System.out.println("Piloto "+ racers[i]+": ");
			System.out.println("Pontuação: "+verificacao[i]);
		}
		
		return verificacao;
	}

	public static int[] winnerPerGP (int [][] arrayPontosPiloto, String[] countriesRacers) {
		int[] arrayWinner = new int[5];
		
		for (int i=0;i<5;i++) {
			int aux=0;
			for (int j=0;j<5;j++) {
				if (arrayPontosPiloto[j][i] > aux) {
					aux = arrayPontosPiloto[j][i];
					arrayWinner[i]=j;
				}
			}
		}
		
		for (int i=0;i<5;i++) {
			int winners = arrayWinner[i];
			System.out.println("Vencedor do GP "+countriesRacers[i]+"------"+racers[winners]);
		}
		
		return arrayWinner;
	}
	
	public static void theBigWinner (int [][] arrayPontosPiloto, int [] verificacao) {
		
		int aux=0;
		String auxRacers=null;
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				if (verificacao[i] > aux) {
					aux = verificacao[i];
					auxRacers = racers[i];
					verificacao[i]=verificacao[j];
					racers[i]=racers[j];
					verificacao[j]=aux;
					racers[j]=auxRacers;
				}
			}
		}
		
		System.out.println("THE BIG WIENER IS: "+racers[0]+" With ==="+verificacao[0]);
		
	}
}
