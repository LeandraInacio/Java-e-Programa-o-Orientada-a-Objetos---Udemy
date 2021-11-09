package aplicacao;

import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Produto p1 = new Produto();
		System.out.println("Entre com os dados do produto: ");
		System.out.print("nome: ");
		p1.nome = sc.nextLine();
		
		System.out.print("Estoque: ");
		p1.quantidade = sc.nextInt();
		
		System.out.print("Preço: ");
		p1.preco = sc.nextDouble();
		
		System.out.println(p1.toString());
		
		System.out.print("\n Entre com a quantidade que será adicionada no estoque: ");
		int add = sc.nextInt();
		p1.addProduto(add);
		System.out.println(p1.toString());
		
		System.out.print("\n Entre com a quantidade que será retirada do estoque: ");
		int remover = sc.nextInt();
		p1.removProduto(remover);
		System.out.println(p1.toString());
		
		sc.close();
	}

}
