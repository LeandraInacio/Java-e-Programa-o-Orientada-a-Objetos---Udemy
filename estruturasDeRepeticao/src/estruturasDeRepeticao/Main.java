package estruturasDeRepeticao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
// ESTRUTURA DE REPETIÇÃO WHILE 
		int x = 0;
		int y =4;
		
		while (x<3) {
			y=y+2;
			x++;
			System.out.println(" Valor de X= "+x+" Valor de y= "+y);
		}
		
//ESTRUTURA DE REPETIÇÃO FOR
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n\n Digite o número de iterações: ");
		int n = sc.nextInt();
		int soma =0;
		
		System.out.println("\n");
		
		for(int i=0; i<n;i++) {
			System.out.println(" O valor de i nesta iteração é: "+i);
			soma +=x; 
		}
// ESTRUTURA DE REPETIÇÃO DO-WHILE
		String continuar = "S";
		do {
			System.out.print("\n Digite a temperatura em Celcius: ");
			float celcius = sc.nextFloat();
			
			float tempF = (9*celcius)/(5+32);
			
			System.out.printf("O equivalente em Fahrenheit é: %.2f%n", tempF , "°F");
			
			System.out.print("\n Deseja Continuar? (S ou N)");
			continuar = sc.nextLine();
		
		}while(continuar!="N");
	}

}
