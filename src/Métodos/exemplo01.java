package FIAP;

import java.util.Scanner;

public class exemplo01 {
	
	//deixa o Scanner como global
	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//chamada do procedimento
		verificar();
		
		
		
	}//fecha MAIN
	
	//PROCEDIMENTO - SEMPRE VOID NÃO TEM RETORNO
	public static void verificar() {
		int  num=0;
		
		System.out.println("Digite um número: ");
		num=e.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Número Par!");
		}else {
			System.out.println("Número Ímpar!");
		}
		
	}
	
	
	

}
