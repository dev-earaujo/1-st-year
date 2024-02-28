import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("#0.00");
		
		//variaveis
		int idade=0, cont=0, qtdId50=0, qtdAlt=0;
		double altura=0, peso=0, somaAlt=0, pesoMenor=0, porc;
		String nome;
		
		//variável de controle
		//for(int i=0;i<20;i++){
		while(cont<3){
			
			System.out.print("Digite o nome: ");
			nome=entrada.next();
			System.out.print("Digite a idade: ");
			idade=entrada.nextInt();
			System.out.print("Digite o peso: ");
			peso=entrada.nextDouble();
			System.out.print("Digite a altura: ");
			altura=entrada.nextDouble();
			
			cont++;
			//A)
			if(idade>50){
				qtdId50++;
			}
			//B)
			if(idade>10 && idade<20){
				somaAlt+=altura;
				qtdAlt++;
			}
			//C)
			if(peso<40){
				pesoMenor++;
			}
			
		}//fecha repetição
		//SAIDAS
		System.out.println("Qtd de pessoas com idade superior a 50 anos: " + qtdId50);
		
		if(qtdAlt==0){
			System.out.println("Médias das alturas: 0");
		}else{
			System.out.println("Média das alturas: " + numFormatado.format(somaAlt/qtdAlt));
		}
		
		porc=(pesoMenor/3)*100;
		System.out.println("Porcentagem de pessoas com peso menor que 40: " + porc + "%");
		
		
		
		
		
	}//static

}//class
