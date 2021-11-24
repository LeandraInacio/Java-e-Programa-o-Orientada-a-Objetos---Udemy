package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Date hoje = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Número do quarto: ");
		int numero = sc.nextInt();
		System.out.print("checkIn: ");
		Date entrada = sdf.parse(sc.next());
		System.out.print("checkOut: ");
		Date saida = sdf.parse(sc.next());

		if (!saida.after(entrada)) {
			System.out.println("Erro na reserva: Sua data de entrada está posterior à saída");
		} else {
			Reserva reserva1 = new Reserva(numero, entrada, saida);
			System.out.println("Reserva: " + reserva1);

			System.out.println("\n Entre com a modificação das Datas: ");
			System.out.print("checkIn: ");
			entrada = sdf.parse(sc.next());
			System.out.print("checkOut: ");
			saida = sdf.parse(sc.next());

			String erro = reserva1.updateData(entrada, saida);
			if(erro!= null) {
				System.out.println("Error in reservation: "+ erro);
			}else {
				System.out.println("Reserva: "+ reserva1);
			}
		}
		sc.close();
	}

}
