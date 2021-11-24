package metodosEstaticos;

import java.util.Scanner;

import util.Calculo;

public class Main {

	public static void main(String[] args) {
		System.out.print("Informe o Raio da circunferência: ");
		
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		double c = Calculo.circunferencia(raio);
		
		
		double v = Calculo.volume(raio);
		
		System.out.printf("\nCircunferência: %.2f",c);
		System.out.printf(" Volume: %.2f",v);
		System.out.printf(" Valor de PI: %.2f",Calculo.PI);
	}

}
