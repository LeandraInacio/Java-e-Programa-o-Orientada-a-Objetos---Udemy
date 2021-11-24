package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		String path = "/home/jrdutra/Documents/arquivos/texto1.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String linha = br.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		}catch (IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}

	}

}
