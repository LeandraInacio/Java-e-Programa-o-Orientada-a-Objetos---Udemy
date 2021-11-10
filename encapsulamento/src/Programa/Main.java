package Programa;

import java.util.Scanner;

import entidades.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Estoque: ");
		int quantidade = sc.nextInt();
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		Produto p1 = new Produto(nome,preco,quantidade);
		
		System.out.println(p1.getNome());
		
		System.out.println(p1.getQuantidade());
		
		System.out.println(p1.getPreco());
		
		p1.setNome("Computador");
		
		System.out.println("Novo nome do produto é: "+ p1.getNome());
		
		/* 
		*System.out.print("\n Entre com a quantidade que será adicionada no estoque: ");
		int add = sc.nextInt();
		p1.addProduto(add);
		System.out.println(p1.toString());
		
		System.out.print("\n Entre com a quantidade que será retirada do estoque: ");
		int remover = sc.nextInt();
		p1.removProduto(remover);
		System.out.println(p1.toString());
		*/
		
		sc.close();
	}

}
