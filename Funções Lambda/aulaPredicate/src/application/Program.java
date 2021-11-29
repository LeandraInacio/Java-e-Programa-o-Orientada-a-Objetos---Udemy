package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Produto;
import util.ProdutoPredicate;

public class Program {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mause", 50.00));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("HD case", 80.90));
		
		//PREDICATE
		lista.removeIf(new ProdutoPredicate());
		
		for (Produto p :lista) {
			System.out.println(p);
		}
		
		System.out.println("----------------------------");
		
		//MÉTODO ABSTRATO
		lista.removeIf(Produto :: staticProductPredicate);
		for (Produto p :lista) {
			System.out.println(p);
		}		
		System.out.println("----------------------------");
		
		//MÉTODO NÃO ABSTRATO
		lista.removeIf(Produto :: nonStaticProductPredicate);
		for (Produto p :lista) {
			System.out.println(p);
		}
		
		System.out.println("----------------------------");
		
		// FUNÇÃO LAMBDA DECLARADA
		Predicate<Produto> pred = p -> p.getPrice() >= 100;
		
		lista.removeIf(pred);
		for (Produto p :lista) {
			System.out.println(p);
		}
		
		System.out.println("----------------------------");
		
		// FUNÇÃO LAMBDA INLINE
		
		lista.removeIf(p -> p.getPrice() >= 100);
		for (Produto p :lista) {
			System.out.println(p);
		}
	}

}
