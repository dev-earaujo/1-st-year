import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int matriz[][] = new int[4][5];

		for (int i = 0; i < 4; i++) {
			System.out.print("Digite o código do " + (i + 1) + "º cliente: ");
			matriz[i][0] = e.nextInt();

			System.out.print("Digite a quantidade de milhagem: ");
			matriz[i][1] = e.nextInt();

			System.out.print("Digite a categoria: ");
			matriz[i][2] = e.nextInt();

			while (matriz[i][2] != 1 && matriz[i][2] != 2 && matriz[i][2] != 3) {
				System.out.println("Apresente uma categoria válida (1, 2 ou 3): ");
				matriz[i][2] = e.nextInt();
			}

			if (matriz[i][2] == 1) {
				matriz[i][3] = 10000;
			} else if (matriz[i][2] == 2) {
				matriz[i][3] = 5000;
			} else {
				matriz[i][3] = 0;
			}
			
			matriz[i][4]= matriz[i][1]+matriz[i][3];
			
		}
		
		for (int r=0; r<4;r++) {
			System.out.println("Código: "+matriz[r][0]+"\t"+"Milhagem: "+matriz[r][1]+"\t"+
		"Categoria: "+matriz[r][2]+"\t"+"Bônus: "+matriz[r][3]+"\t"+"Milha Atual: "+matriz[r][4]+"\t");
		}
		e.close();
	}

}
