package aulaMatrizes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Indique a dimenção da matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println("Indique a posição " + i + " x " + j);
				mat[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println(mat[i][j]);
			}
		}

		System.out.println("Diagonal Principal");

		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}

		int soma = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					soma++;
				}
			}
		}
		
		System.out.println("\n Números negativos: "+ soma);
		sc.close();

	}

}
