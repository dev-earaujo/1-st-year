import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int[][] m = new int[2][2];
		int[][] r = new int[2][2];
		int maiorElemento = 0, maiorLinha=0, maiorColuna=0;

		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {

				System.out.println("Informe o número M[" + l + "," + c + "]: ");
				m[l][c] = e.nextInt();

//			maior elemento da matriz
				if (m[l][c] > maiorElemento) {
					maiorElemento = m[l][c];
					maiorLinha=l;
					maiorColuna=c;
				}
			}
		}
		System.out.println("Maior Elemento: "+maiorElemento+" --Linha: "+maiorLinha+" --Coluna: "+maiorColuna);

//			multiplicar o maior elemento pela matriz
		
		for(int l=0;l<2;l++) {
			for(int c=0;c<2;c++) {
				r[l][c]=m[l][c]*maiorElemento;
				System.out.println("Resultado - R["+l+","+c+"]: "+r[l][c]);
			}
		}
	}

}
