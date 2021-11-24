package aplicacao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("/home/jrdutra/Documents/arquivos/texto1.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: "+ e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
