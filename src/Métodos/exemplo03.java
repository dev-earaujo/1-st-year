package FIAP;

import java.util.Scanner;

public class exemplo03 {

	static Scanner e = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tempoEmpresa=0;
		String nome;
		double salario=0;
		
		System.out.println("Digite o nome: ");
		nome=e.next();
		System.out.println("Digite o tempo na empresa: ");
		tempoEmpresa=e.nextInt();
		System.out.println("Digite o salário: ");
		salario=e.nextDouble();
		
		//chamada de procedimento com parâmetro
		analise(tempoEmpresa, salario); //parametros reais
		
	}//main
	
	public static void analise(int tempoEmpresa, double salario) {
		
		if(tempoEmpresa>10 && salario<5000) {
			System.out.println("Tem direito ao aumento.");
		}else {
			System.out.println("Não tem direito ao aumento");
		}
		
	}
	
	

}
