package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Color;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Forma> lista = new ArrayList<>();

		System.out.print("Entre com a quantidade de formas a serem dclaradas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Digite os dados da figura #" + i + "\n");
			System.out.print(" Retângulo ou Circulo? r/c ");
			char forma = sc.next().charAt(0);
			System.out.print("\n Cor: ");
			Color cor = Color.valueOf(sc.next());

			if (forma == 'r') {
				System.out.print("Largura: ");
				Double l = sc.nextDouble();
				System.out.print("\n Altura: ");
				Double a = sc.nextDouble();
				lista.add(new Retangulo(cor, l, a));

			} else {
				System.out.print("Qual o raio do círculo: ");
				Double r = sc.nextDouble();
				lista.add(new Circulo(cor, r));
			}

		}
		
		System.out.println("\n Area das Formas: ");
		for (Forma f :lista) {
			System.out.println(String.format("%.2f", f.area()));
		}
		
		sc.close();
	}

}
