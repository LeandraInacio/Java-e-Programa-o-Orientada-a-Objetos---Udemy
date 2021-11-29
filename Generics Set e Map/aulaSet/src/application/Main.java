package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.EntradaLog;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o caminho do arquivo: ");
		String caminho = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			Set<EntradaLog> conjunto = new HashSet<>();

			String linha = br.readLine();
			while (linha != null) {

				String[] vetor = linha.split(" ");
				String nome = vetor[0];
				Date momento = Date.from(Instant.parse(vetor[1]));

				conjunto.add(new EntradaLog(nome, momento));

				linha = br.readLine();
			}
			
			System.out.println("Total de usuários: "+ conjunto.size());

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();
	}

}
