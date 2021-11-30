package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;
import model.service.ProdutoService;

public class Main {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<>();

		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mause", 50.00));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("HD case", 80.90));

		ProdutoService ps = new ProdutoService();

		double soma = ps.filteredSum(lista, p -> p.getNome().charAt(0) == 'T');

		System.out.println("Soma: " + soma);

	}

}
