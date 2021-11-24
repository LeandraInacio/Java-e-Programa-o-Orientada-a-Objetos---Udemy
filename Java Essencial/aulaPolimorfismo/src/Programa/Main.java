package Programa;

import entidades.Empregado;
import entidades.Terceirizado;

public class Main {

	public static void main(String[] args) {
		 
		Empregado e1 = new Empregado("joão", 20, 100.00);
		Terceirizado e2 = new Terceirizado("Lucas", 20, 100.00);
		
		e2.custoadd();
		double x = e1.pagamento();
		double y = e2.pagamento();
		
		System.out.println(e1+"\n");
		System.out.println(e2+"\n");

	}

}
