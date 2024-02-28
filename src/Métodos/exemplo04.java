package FIAP;

import java.util.Scanner;

public class exemplo04 {


	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao = 0, n1=0, n2=0;

		while (opcao != 5) {
			System.out.println("[1] - Adição");
			System.out.println("[2] - Subtração");
			System.out.println("[3] - Multiplicação");
			System.out.println("[4] - Divisão");
			System.out.println("[5] - Sair");

			System.out.println("Escolha uma opção: ");
			opcao = e.nextInt();
			
			//entradas n1 e n2
			if(opcao>0 && opcao<5) {
				System.out.println("Digite o 1° valor: ");
				n1 = e.nextInt();
				System.out.println("Digite o 2° valor: ");
				n2 = e.nextInt();
			}

			switch (opcao) {
			case 1: adicao(n1,n2);
				break;
			case 2: subtracao(n1,n2);
				break;
			case 3: multiplicacao(n1,n2);
				break;
			case 4: divisao(n1,n2);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Opção Inválida - digite novamente.");
			}

		}

	}// fecha MAIN

	// Adicao
	public static void adicao(int n1, int n2) {
		int resultado = 0;

		System.out.println("------ PROCEDIMENTO ADIÇÃO ------");
		resultado = n1 + n2;
		System.out.println("Resultado da adição: "+resultado);
	}

	//subtracao
		
	public static void subtracao(int n1, int n2) {
		int resultado=0;
		
		System.out.println("------ PROCEDIMENTO SUBTRAÇÃO ------");
		resultado = n1 - n2;
		System.out.println("Resultado da subtração: "+resultado);
		
		
	}
	
	//multiplicacao
	
	public static void multiplicacao(int n1, int n2) {
		int resultado=0;
		
		System.out.println("------ PROCEDIMENTO MULTIPLICAÇÃO ------");
		resultado = n1 * n2;
		System.out.println("Resultado da multiplicação: "+resultado);
		
		
	}
	
	//divisao
	
	public static void divisao(int n1, int n2) {
		int resultado=0;
		
		System.out.println("------ PROCEDIMENTO DIVISÃO ------");
		resultado = n1 / n2;
		System.out.println("Resultado da divisão: "+resultado);
		
		
	}
	
	
	
}
