package Vetores;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner e = new Scanner(System.in);
			
			double temp[] = new double [7];
			
			String semana[] = new String[] {"Segunda", "Terça", "Quarta", "Quinta", 
					"Sexta", "Sábado", "Domingo"};
			
			int cont=0, menorDia=0;
			double maiorTemp=0, menorTemp=0;
			String maiorDia = null;
			//Carregar Vetores
			
			while (cont<7) {
				
				System.out.println("Digite a temperatura na "+semana[cont]+":");
				temp[cont] = e.nextDouble();
				
				
				//Maior temperatura
				if(temp[cont]>maiorTemp) {
					maiorTemp=temp[cont];
					maiorDia=semana[cont];
				}
				
				
				//Menor temperatura
				if(cont==0) {
					menorTemp=temp[cont];
					menorDia=cont;
				}else {
					if(temp[cont]<menorTemp) {
						menorTemp=temp[cont];
						menorDia=cont;
					}
				}
				
				cont++;
			}
			//Saída
			System.out.println("Maior temperatura: " +maiorTemp +" °C, sendo o dia " +maiorDia);
			System.out.println("Menor temperatura: " +menorTemp +" °C, sendo o dia " +semana[menorDia]);
			
			
	}

}
