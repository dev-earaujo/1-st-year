package FIAP;

import java.util.Scanner;

public class exemplo05 {
	
	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1=0, nota2=0;
		String nome;
		double media=0;
		
		System.out.println("Digite o Nome: ");
		nome=e.next();
		System.out.println("Digite a 1° Nota: ");
		nota1=e.nextDouble();
		System.out.println("Digite a 2° Nota: ");
		nota2=e.nextDouble();
		
		//chamada da funcao
		media=calculoMedia(nota1,nota2);
		System.out.println("Média: "+media);
		
	}//main
	
	//Criação de função
	public static double calculoMedia(double nota1, double nota2) {
		double media=0;
		
		media=(nota1+nota2)/2;
		
		return media;
	}
	
	

}
