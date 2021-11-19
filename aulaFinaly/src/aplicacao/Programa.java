package aplicacao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		File file = new File("/home/jrdutra/Desktop/Leandra/Importantes");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Erro ao abrir o documento: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finaly executado");
		}
	}
}
