package aulaVetores;

import java.util.Scanner;

import entidade.Objeto;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		  // VETOR DE VALORES---------------------------------------------------------------
		
		  System.out.println("Digite o número de entradas: "); int n = sc.nextInt();
		 
		  double[] vetor = new double[n]; double soma = 0;
		  
		  for (int i =0; i<n; i++) { vetor[i]=sc.nextDouble();
		  
		  soma = soma+vetor[i]; }
		  
		  double media = soma/n;
		  
		  System.out.printf("A média das alturas é: %.2f", media);
		 

// VETOR DE OBJETOS -----------------------------------------------------------------
		System.out.println("Entre com o número de entrada do vetor de objetos: ");

		int x = sc.nextInt();
		Objeto[] vetor1 = new Objeto[x];

		for (int i = 0; i < x; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("\n Valor: ");
			float valor = sc.nextFloat();
			vetor1[i] = new Objeto(nome, valor);
		}
		double somaValores =0;
		for (int i=0; i<x;i++) {
			somaValores+= vetor1[i].getValor();
		}
		System.out.printf("A soma dos valos dos itens é: %.2f", somaValores);
	}

}
