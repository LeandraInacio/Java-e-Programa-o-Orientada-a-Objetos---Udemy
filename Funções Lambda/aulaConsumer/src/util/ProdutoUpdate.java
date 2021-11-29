package util;

import java.util.function.Consumer;

import entities.Produto;

public class ProdutoUpdate implements Consumer <Produto> {

	@Override
	public void accept(Produto p) {
		
		p.setPrice(p.getPrice()*1.10);
	}



}
