package FIAP;

import java.util.Scanner;

public class exemplo07 {

	static Scanner e = new Scanner(System.in);

	// Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Chamada da Função
		String[] nomesAlunos = carregaNome();

		// Chamada procedimento
		listaAlunos(nomesAlunos);

	}// Main End

	// Função
	public static String[] carregaNome() {

		String[] nomesAlunos = new String[4];
		System.out.println("Função - Carrega os nomes");
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite o " + (i + 1) + "° nome: ");
			nomesAlunos[i] = e.next();
		}

		return nomesAlunos;
	}

	// Procedimento
	public static void listaAlunos(String[] nomesAlunos) {
		System.out.println("Procediento - Lista de Alunos");
		for (int i = 0; i < 4; i++) {
			System.out.println(nomesAlunos[i]);
		}

	}

}
