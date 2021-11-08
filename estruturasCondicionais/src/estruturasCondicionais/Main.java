package estruturasCondicionais;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a nota 1 do aluno: ");
		float nota1 = leitor.nextFloat();
		
		System.out.println("Informe a nota 2 do aluno: ");
		float nota2 = leitor.nextFloat();
		
		float notaFinal = (nota1 +nota2)/2;
		
		if(notaFinal>=60.0f) {
			System.out.println("Parabéns, você foi aprovado! sua média foi: "+notaFinal);
		}else if(notaFinal<60.0f && notaFinal>=50.0f) {
			System.out.println("Você precisa de prova de recuperação. Sua média foi: "+notaFinal);
		}else {
			System.out.println("Você foi reprovado. Sua média foi: "+notaFinal);
		}
	}

}
