package Vetores;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);
		
		String gabarito[]= new String [] {"A", "A", "A", "A", "A", "A", "A", "A"};
		String prova [] = new String[8];
		int numAluno = 0, totAprovado=0;
		double nota=0, percAprovados=0;
		
	
		
		//Rep Alunos
		
		for(int aluno=0;aluno<10;aluno++) {
			
			System.out.println("Digite o número do "+(aluno+1)+"° aluno");
			numAluno=e.nextInt();
			
		
			//Rep Questoes Prova
			for(int q=0; q<8; q++) {
				
				System.out.println("Digite a resposta da questão "+(q+1)+": ");
				prova[q]=e.next();
				
				if(gabarito[q].equalsIgnoreCase(prova[q])) {
					nota++;
				}
				
			}//for quest.
			
			System.out.println("A nota do aluno "+numAluno+" foi: "+nota);
			
			if(nota>=6) {
				totAprovado++;
			}
			
			
			nota=0;
		}//for alunos
		
		System.out.println("Total de aprovados: "+totAprovado);
		percAprovados = (totAprovado/10)*100;
		System.out.println("Percentual de aprovados: "+percAprovados);
		
		
		
	}

}
