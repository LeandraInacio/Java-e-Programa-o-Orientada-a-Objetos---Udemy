package model.service;

import java.util.List;
import java.util.function.Predicate;

import entities.Produto;

public class ProdutoService {

	public double filteredSum(List<Produto> lista, Predicate<Produto> criterio) {
		double sum = 0.0;
		for(Produto p : lista) {
			if (criterio.test(p)) {
				sum += p.getPreco();
			}
		}
		return sum;
	}
}
