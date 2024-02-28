import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		String meses[] = new String[] { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov",
				"Dez" };
		double temps[] = new double[12];
		double maiorMes = 0, menorMes = 0;
		int indMaior=0, indMenor=0; 
		String mesMaior=""; 
		String mesMenor="";

		for (int i=0; i < 12; i++) {
			System.out.println("Informe a temperatura do mês de " + meses[i] + ":");
			temps[i] = e.nextDouble();
			
			// maior e menor
			if (i == 0) {
				menorMes = temps[i];
				mesMenor = meses[i];
			}
			if (temps[i] > maiorMes) {
				maiorMes = temps[i];
				mesMaior = meses[i];
				indMaior = i;
			}
			if (temps[i] < menorMes) {
				menorMes = temps[i];
				mesMenor = meses[i];
				indMenor = i;
			}

		} // for
		//Exibir
		System.out.println("Maior temperatura "+maiorMes+"°C no mês de "+ meses[indMaior]);
		System.out.println("Menor temperatura "+menorMes+"°C no mês de "+meses[indMenor]);
		

	}

}
