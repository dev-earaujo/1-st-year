import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		
		int num=0, numMaior=0, numMenor=0;
		
		for(int i=0;i<5;i++){
			System.out.println("Digite um n�mero: ");
			num=entrada.nextInt();
			
			if(i==0){
				numMaior=num;
				numMenor=num;		
			}
			
			if(num>numMaior){
				numMaior=num;
			}
			if(num<numMenor){
				numMenor=num;
			}
				
		}
		System.out.println("N�mero maior: "+numMaior);
		System.out.println("N�mero menor: "+numMenor);
		
		
		
		
		
		
	}

}
