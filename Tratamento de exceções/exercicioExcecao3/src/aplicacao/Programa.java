package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date hoje = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Número do quarto: ");
			int numero = sc.nextInt();
			System.out.print("checkIn: ");
			Date entrada = sdf.parse(sc.next());
			System.out.print("checkOut: ");
			Date saida = sdf.parse(sc.next());
	
			Reserva reserva1 = new Reserva(numero, entrada, saida);
			System.out.println("Reserva: " + reserva1);
	
			System.out.println("\n Entre com a modificação das Datas: ");
			System.out.print("checkIn: ");
			entrada = sdf.parse(sc.next());
			System.out.print("checkOut: ");
			saida = sdf.parse(sc.next());
	
			reserva1.updateData(entrada, saida);
			System.out.println("Reserva: "+ reserva1);
			
		}catch(ParseException e){
			System.out.println("Formato Inválido");
		}catch (IllegalArgumentException e) {
			System.out.println("Erro na reserva: "+ e.getMessage());
		}
		sc.close();
	}

}
