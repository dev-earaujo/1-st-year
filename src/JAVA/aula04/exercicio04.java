import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int idade=0, qtd=0;
		double altura=0, peso=0;
		char olhos, cabelo;
		
		for(int i=0;i<3;i++)
		
		System.out.print("Digite sua idade: ");
		idade=entrada.nextInt();
		System.out.print("Digite sua altura: ");
		altura=entrada.nextDouble();
		System.out.println("Digite seu peso: ");
		peso=entrada.nextDouble();
		
		System.out.println("Digite a cor dos seus olhos: ");
		olhos=entrada.next().toUpperCase().charAt(0);
		
		System.out.println("Digite a cor dos olhos: ");
		cabelo=entrada.next().toUpperCase().charAt(0);
		
		if(idade>50 && peso<60){
		qtd++	
		}
		
		
		
	}

}
