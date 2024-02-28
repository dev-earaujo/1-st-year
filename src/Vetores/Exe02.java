package Vetores;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		String name[] = new String[10];
		String rightName = null;

		for (int cont=0; cont < 10; cont++) {

			System.out.print("Digite o " + (cont + 1) + " nome:");
			name[cont] = e.next();

		}

		System.out.print("Digite o nome para procurar no vetor: ");
		rightName = e.next();
		
	 for (int cont=0; cont < 10; cont++) {
			
			
			
			if (name[cont].equalsIgnoreCase(rightName)) {
				System.out.println("Achei!" + (cont+1)+ " - posição");
			} else {
				System.out.println("Não Achei");

			}

		}
	}
}
