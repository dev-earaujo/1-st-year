package FIAP;

import java.util.Scanner;

public class exercicio05 {

	static Scanner e = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A)
		int [] carregaVetor = numeros();
		// B)
		int [] carregaOrdenados = numerosOrdenados(carregaVetor);
		
		for (int i=0;i<5;i++) {
			System.out.println(carregaOrdenados[i]);
		}
		
		
	}//Main END
	
	public static int [] numeros() {
		int [] carregaVetor = new int[5];
		
		for (int i=0;i<5;i++) {
			System.out.println("Digite o "+(i+1)+"° número: ");
			carregaVetor[i]=e.nextInt();
		}
		
		return carregaVetor;
		
	}

	public static int[] numerosOrdenados(int[] carregaVetor) {
		int pivo=0;
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<4;j++) {
				if(carregaVetor[i] < carregaVetor[j]) {
					pivo=carregaVetor[i];
					carregaVetor[i]=carregaVetor[j];
					carregaVetor[j]=pivo;
				}
				
			}
		}
		
		return carregaVetor ;
	}
}
