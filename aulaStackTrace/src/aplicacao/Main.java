package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		metodo1();
		System.out.println("fim do programa!");
	}
	public static void metodo1() {
		System.out.println("INÍCIO MÉTODO 1 ******");
		metodo2();
		System.out.println("FIM MÉTODO 1 ******");
	}

	public static void metodo2() {
		System.out.println("INÍCIO MÉTODO 2 ******");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println(" Insira a lista: ");
			String[] vetor = sc.nextLine().split(" ");
			System.out.println("Qual posição você quer acessar? ");
			int x = sc.nextInt();
			System.out.println(vetor[x]);
		} catch (ArrayIndexOutOfBoundsException teste) {
			System.out.println("Posição de indice inválida");
			teste.printStackTrace(); // comando que imprime o caminho e o motivo da exceção ocorrida
		} catch (InputMismatchException teste) {
			System.out.println("Erro no input ");
		}

		sc.close();
		System.out.println("FIM MÉTODO 2 ******");
	}

}
