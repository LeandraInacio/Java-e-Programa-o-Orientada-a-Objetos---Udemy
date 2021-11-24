package programaOrientadoAObjetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Triagulo x= new Triagulo();
		Triagulo y= new Triagulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os valores de X: ");
		x.a= sc.nextFloat();
		x.b=sc.nextFloat();
		x.c= sc.nextFloat();
		
		x.area();
		
		System.out.println("\n Entre com os valores de Y: ");
		y.a = sc.nextFloat();
		y.b = sc.nextFloat();
		y.c = sc.nextFloat();
		
		y.area();
	
		
	}

}
