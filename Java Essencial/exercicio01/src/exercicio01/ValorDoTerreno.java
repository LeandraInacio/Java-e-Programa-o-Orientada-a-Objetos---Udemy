package exercicio01;

import java.util.Scanner;

public class ValorDoTerreno {

	public static void main(String[] args) {
		//Fazer um programa para ler as medidas da largura e comprimento de um terreno
		//retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
		//com duas casas decimais. Em seguida, o programa irá retornar a área do terreno
		// e o preço. 
		System.out.print("Digite o valor do primeiro lado do terreno: ");
		Scanner leitor = new Scanner(System.in);
		float ladoA = leitor.nextFloat();
		
		System.out.print("Digite o valor do segundo lado do terreno: ");
		float ladoB = leitor.nextFloat();
		
		System.out.print("Digite o valor do metro quadrado: ");
		float valor = leitor.nextFloat();
		 
		float area = ladoA*ladoB;
		
		float valorTerreno = area*valor;
		
		System.out.println("O área do terreno é: "+ area);
		System.out.println("O valor do terreno completo é : "+ valorTerreno);

	}

}
