package application;

import java.util.Scanner;

import service.PrintService;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<Integer> psInt = new PrintService<>();

		System.out.print("Entre com a quantidade de valores: ");
		int n = sc.nextInt();
		
		System.out.println("Valores inteiros : ");
		
		for (int i = 0; i < n; i++) {
			System.out.print("Valor " + i + " : ");
			psInt.addValue(sc.nextInt());
		}
		psInt.print();
		
		System.out.println("\n \n Strings  : ");
		
		PrintService<String> psStr = new PrintService<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Nome " + i + " : ");
			psStr.addValue(sc.next());
		}
		psStr.print();
	}

}
