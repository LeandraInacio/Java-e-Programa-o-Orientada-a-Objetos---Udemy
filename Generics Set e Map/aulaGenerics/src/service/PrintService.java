package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	private List<T> list = new ArrayList<>();

	public void addValue(T valor) {
		list.add(valor);
	}

	public void first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista está vazia!");
		} else {
			System.out.println("\n Primeiro valor: " + list.get(0));
		}
	}
	public void print() {
		System.out.println("Lista: ");
		for( int i = 0; i<list.size(); i++) {
			System.out.print(" "+ list.get(i));
		}
		this.first();
	}

}
