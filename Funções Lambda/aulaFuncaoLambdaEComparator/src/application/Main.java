package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Pedro");
		lista.add("Lucas");
		lista.add("ana");

		System.out.println("Sem ordenação: ");

		for (String i : lista) {
			System.out.print(" " + i);
		}

		System.out.println("\nCom ordenação: ");

		Comparator<String> comp = (p1,p2) -> p1.toUpperCase().compareTo(p2.toUpperCase());
				
		lista.sort(comp);

		for (String i : lista) {
			System.out.print(" " + i);
		}

	}

}
