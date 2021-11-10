package entidades;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	// Construtor -----------------
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	//-----------------------------
	public double totalDeValorEstoque() {
		return preco*quantidade;
	}
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;		
	}
	public void removProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String  toString() {
		return nome +", $ "+ preco+", "+ quantidade+" unidades, Valor total $ "
				+totalDeValorEstoque();
	}
}