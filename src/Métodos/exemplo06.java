package FIAP;

import java.util.Scanner;

public class exemplo06 {

	//variaveis GLOBAIS
	static Scanner e = new Scanner(System.in);
	static String nome;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double media=0;
		
		System.out.println("Digite o nome: ");
		nome=e.next();
		
		//chamada da funcao
		//criamos uma variavel double para receber o retorno da funçao
		media=notas();
		
		//Chamada Procedimento
		//com passagem de parâmetro (parâmetro double)
		analise(media);
		
	}//main
	
	
	//FUNÇAO RETORNA COM DOUBLE A MEDIA DO ALUNO
	public static double notas() {
		//var locais
		double nota1=0, nota2=0;
		double media=0;
		
		System.out.println("Função NOTAS");
		System.out.println("Digite a 1° Nota: ");
		nota1=e.nextDouble();
		System.out.println("Digite a 2° Nota: ");
		nota2=e.nextDouble();
		media=(nota1+nota2)/2;
		
		return media;
	}
	
	//Procedimento analisa media
	//parâmetro formal
	public static void analise(double media) {
		System.out.println("Função ANALISE");
		System.out.println("Média: "+media);
		if(media>=6) {
			System.out.println(nome+" - Aprovado!");
		}else if (media >=4) {
			System.out.println(nome+" - Exame");
		}else {
			System.out.println(nome+" - DP... :(");
		}
	}
}
