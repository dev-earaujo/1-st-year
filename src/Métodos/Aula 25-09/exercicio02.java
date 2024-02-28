package FIAP;

import java.util.Scanner;

public class exercicio02 {

	static Scanner e = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	double cargaQtd=0;
		
	
	System.out.println("Digite o peso da carga em tonelada:");
	cargaQtd=e.nextDouble();
	
	//chamada do código
	double precoSemImposto = precoQuilo(cargaQtd);
	
	//chamada do preço com imposto
	double PrecoTotal = precoImposto(precoSemImposto);
	

  System.out.println("O Preço total será [R$"+ (precoTotal) + "]");
	


	}//Main END
	
	//Função
	
	public static double precoQuilo(double cargaQtd) {
		
		int codigoCaminhao=0;
		double precoSemImposto=0 ;
		
		cargaQtd = cargaQtd*1000;
		
		System.out.println("Digite o código do caminhão: ");
		codigoCaminhao=e.nextInt();
		
		while (codigoCaminhao < 1 || codigoCaminhao > 30) {
			System.out.println("Código Inválido - Tente novamente!");
			codigoCaminhao=e.nextInt();
		}
		
		if (codigoCaminhao > 0 && codigoCaminhao <11) {
			precoSemImposto = cargaQtd*120;
		}else if (codigoCaminhao >= 11 && codigoCaminhao <21) {
			precoSemImposto = cargaQtd*200;
		} else if (codigoCaminhao >= 21 && codigoCaminhao <31) {
			precoSemImposto = cargaQtd*280;
		}
		
		return precoSemImposto;
	}
	
	public static double precoImposto(double precoSemImposto) {
		
		int codigoEstado=0;
		double precoTotal=0;
		
		System.out.println("Digite o código de estado: ");
		codigoEstado=e.nextInt();
		
		while (codigoEstado != 1 && codigoEstado != 2 && codigoEstado != 3 && codigoEstado != 4) {
			System.out.println("Código de estado inválido - Digite novamente.");
			codigoEstado=e.nextInt();
		}
		
		switch (codigoEstado) {
		case 1:
			precoTotal = precoSemImposto * 1.25;
			break;
		case 2:
			precoTotal = precoSemImposto * 1.20;
			break;
		case 3:
			precoTotal = precoSemImposto * 1.15;
		case 4:
			break;
		}
		
		
		return precoTotal;
	}
	
	
}
