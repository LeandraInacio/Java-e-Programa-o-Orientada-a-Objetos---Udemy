package funcoesMatematicas;

public class Funcoes {

	public static void main(String[] args) {
		float x= 3.0f;
		float y = 4.0f;
		float z = -5.0f;
		double A,B,C;
		
		A= Math.sqrt(x);
		B= Math.sqrt(y);
		C= Math.sqrt(z);
		
		System.out.println("RESULTADOS RAIZ QUADRADA ----------------");
		System.out.println("Raiz quadrada de "+x+ "= "+A);
		System.out.println("Raiz quadrada de "+y+ "= "+B);
		System.out.println("Raiz quadrada de "+z+ "= "+C);
		
		A= Math.pow(x, y);
		B= Math.pow(x, 2.0);
		C= Math.pow(5.0, 2.0);
		
		System.out.println("RESULTADOS POTENCIA----------------------");
		System.out.println(x+ " elevado à "+y+ " = "+A);
		System.out.println(x+ " elevado à 2 = "+B);
		System.out.println("5 elevado à 2 = "+C);
		
		A= Math.abs(z);
		
		System.out.println("RESULTADOS VALOR ABSOLUTO----------------");
		System.out.println("Valor absoluto de "+z+" é = "+A);
	}

}
