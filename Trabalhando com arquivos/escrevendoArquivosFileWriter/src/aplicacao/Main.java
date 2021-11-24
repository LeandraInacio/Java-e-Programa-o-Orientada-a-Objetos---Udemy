package aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		String[] linhas = new String[] {" Teste 1", "Teste 2", "Teste 3"};
		
		String caminho = "/home/jrdutra/Documents/arquivos/texto2.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))){ // para adicionar mais texto no fim do arquivo: (caminho,true)
			for (String linha :linhas) {
				bw.write(linha);
				bw.newLine();
			}
		}catch (IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}
	}

}
