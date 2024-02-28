package Vetores;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		String name[] = new String[10];
		String rightName = null;
		int achei=0;

		for (int cont = 0; cont < 10; cont++) {

			System.out.print("Digite o " + (cont + 1) + " nome:");
			name[cont] = e.next();

		}

		System.out.print("Digite o nome para procurar no vetor: ");
		rightName = e.next();

		for (int cont = 0; cont < 10; cont++) {
			if (name[cont].equalsIgnoreCase(rightName)) {
				achei=1;
			}
		}

		if (achei==1) {
			System.out.println("Achei!");
		} else {
			System.out.println("Não Achei");

		}
		e.close();
	}

}
