package aula04_1704;

import java.util.Scanner;

public class aula04_exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner(System.in);
		
		int num=0, numMaior=0, numMenor=0, i;
		
		
		for(i=0;i<5;i++) {
			System.out.print("Digite um número: ");
			num = e.nextInt();
			
			if(i==0) {
				numMaior=num;
				numMenor=num;
			}
			
			if(num>numMaior) {
				numMaior=num;
			}
			
			if(num<numMenor) {
				numMenor=num;
			}
			
			
		}
		System.out.println("Maior número: "+numMaior);
		System.out.println("Menor número: "+numMenor);

	}

}
