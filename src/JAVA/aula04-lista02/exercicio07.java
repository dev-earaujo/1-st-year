package lista2;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner(System.in);
		
		int i, numMatricula=0, matricula=0, frequencia=0, qtdA=0, qtdR=0, qtdF=0;
		double nota1=0, nota2=0, nota3=0, medNota=0, notaFinal=0;
		String aprovado, reprovado;
		
		
		
		
		for (i=1;i<4;i++) {
			System.out.println("Informe o número da matricula: ");
			numMatricula=e.nextInt();
			
			System.out.print("Informe a 1° nota: ");
			nota1=e.nextDouble();
			
			System.out.print("Informe a 2° nota: ");
			nota2=e.nextDouble();
			
			System.out.print("Informe a 3° nota: ");
			nota3=e.nextDouble();
			
			System.out.print("Informe o número de aulas frequentadas: ");
			frequencia=e.nextInt();
			
			medNota = nota1+nota2+nota3/3;
		
		
		
		if (medNota>=6 && frequencia >= 40) {
			System.out.println(i+"° Aluno Aprovado!");
			qtdA++;
		}else {
			System.out.println(i+"° Aluno Reprovado.");
			qtdR++;
		}
		
		if (medNota >=6 && frequencia <40) {
			System.out.println("Reprovado por falta");
			qtdF++;
		}
		
		}
		notaFinal += medNota;
		matricula += numMatricula;
		
		System.out.println(i+"° Aluno: "+matricula+" Nota Final: "+notaFinal);
		System.out.println("Total de alunos aprovados: "+qtdA);
		System.out.println("Total de alunos reprovados: "+qtdR);
		System.out.println("Total de alunos reprovados por falta: "+qtdF);
		

		

	}

}
