import java.util.Scanner;

public class exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		String[] atletas = new String[5];
		int[] idade = new int[5];
		int i = 0, j = 0;

		for (int cont = 0; cont < 5; cont++) {

			System.out.print("Digite o nome [" + cont + "]:");
			atletas[cont] = e.next();

			System.out.print("Digite a idade[" + cont + "]:");
			idade[cont] = e.nextInt();
		}

		// exibir vetor
		System.out.println("");
		System.out.println("Exibir Vetor");
		while (i < 5) {
			System.out.println(atletas[i]);
			i++;
		}

		// exibir apenas os nomes de atletas com idade superior a 21
		System.out.println("");
		System.out.println("Exixbindo atletlas com idade superior a 21 anos");
		while (j < 5) {

			if (idade[j] > 21) {
				System.out.println(atletas[j]);
			}
			j++;
		}
	}

}
