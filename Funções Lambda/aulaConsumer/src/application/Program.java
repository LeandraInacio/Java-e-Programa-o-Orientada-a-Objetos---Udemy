package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Produto;
import util.ProdutoUpdate;

public class Program {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();

		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mause", 50.00));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("HD case", 80.90));

		// INTERFACE CONSUMER
		lista.forEach(new ProdutoUpdate());
		
		lista.forEach(System.out :: println);
		
		System.out.println("-----------------------");
		
		// MÉTODO ESTÁTICO
		lista.forEach(Produto :: staticProductConsumer);
		
		lista.forEach(System.out :: println);
		
		System.out.println("-----------------------");
		
		// MÉTODO NÃO ESTÁTICO
		lista.forEach(Produto :: nonStaticProductConsumer);
		
		lista.forEach(System.out :: println);
		
		System.out.println("-----------------------");
		
		// LAMBDA DECLARADA
		Consumer<Produto> cons = p -> p.setPrice(p.getPrice()*1.1);
		
		lista.forEach(cons);
		
		lista.forEach(System.out :: println);
		
		System.out.println("-----------------------");
		
		// LAMBDA INLINE
		
		lista.forEach(p -> p.setPrice(p.getPrice()*1.1));
		
		lista.forEach(System.out :: println);
	}

}
