package FIAP;

import java.util.Scanner;

public class exercicio01 {

	static Scanner e = new Scanner(System.in);
	static String nome;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao=0;
		
		System.out.println("Digite o nome do hóspede: ");
		nome=e.next();
		
		
		while(opcao>0 && opcao<4) {
			System.out.println("[1] - Standard - R$ 380,00");
			System.out.println("[2] - Luxo - R$");
			System.out.println("[3] - SuperLuxo - R$");
			
			System.out.println("Escolha uma opção: ");
			opcao=e.nextInt();
			
			switch(opcao) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
				default:
					System.out.println("Opção Inválida - digite novamente.");
			}
		}
		
		
		
	}//main
	
	public static double valorDiaria() {
		double standard=0;
		
		return standard;
		
		
	}
	
	
	
	
	

}
