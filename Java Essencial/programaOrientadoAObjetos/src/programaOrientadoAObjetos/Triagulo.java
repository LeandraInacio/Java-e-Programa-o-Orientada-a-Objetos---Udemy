package programaOrientadoAObjetos;

public class Triagulo {
	public float a;
	public float b;
	public float c;

	public void area() {
		float valor = 0;
		float p = (a + b + c) / 2;
		
		valor = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		System.out.printf(" O valor da ára do triângulo é : %.3f", valor);
	}
}
