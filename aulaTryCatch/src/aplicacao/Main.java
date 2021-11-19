package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println(" Insira a lista: ");
			String[] vetor = sc.nextLine().split(" ");
			System.out.println("Qual posição você quer acessar? ");
			int x = sc.nextInt();
			System.out.println(vetor[x]);
		} catch (ArrayIndexOutOfBoundsException teste) {
			System.out.println("Posição de indice inválida");
		}
		catch (InputMismatchException teste) {
			System.out.println("Erro no input ");
		}
		System.out.println("Fim do programa");

		sc.close();
	}

}
