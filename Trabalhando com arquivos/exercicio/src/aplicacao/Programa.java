package aplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o caminho do arquivo: ");
		String caminhoRaiz = sc.nextLine();
		System.out.print("Entre com o nome do arquivo: ");
		String nome = sc.nextLine();

		String caminhoCompleto = caminhoRaiz + nome;

		File caminho = new File(caminhoRaiz);
		boolean criouNovaPasta = new File(caminho + "/out").mkdir();
		
		if(criouNovaPasta) {
			System.out.println("Pasta criada com sucesso");
		}else{
			System.out.println("Houve um erro na criação da pasta");
		}
		
		List<String> listaNome = new ArrayList<>();
		List<Double> listaTotal = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminhoCompleto))) {
			String linha = br.readLine();
			
			while (linha != null) {

				String[] elemlinha = linha.split(",");
				String nomeprod = elemlinha[0];
				Double valor = Double.parseDouble(elemlinha[1]);
				Integer qte = Integer.parseInt(elemlinha[2]);
				Double total = valor * qte;
				
				listaNome.add(nomeprod);
				listaTotal.add(total);
				
				//System.out.println(total);
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		List<String> listaLinhas = new ArrayList<>();
		
		for(int i = 0; i < listaNome.size(); i++) {
			
			listaLinhas.add(listaNome.get(i)+","+listaTotal.get(i));
		}
		
		String caminhoGravacao = new String(caminhoRaiz+"/out/summary.csv");
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoGravacao))){
			for (String linha :listaLinhas) {
				bw.write(linha);
				bw.newLine();
			}
		}catch (IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}
	}

}
