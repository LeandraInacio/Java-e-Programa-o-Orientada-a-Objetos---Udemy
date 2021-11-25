package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.services.ServicoAluguel;
import model.services.TaxaBrasil;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

		System.out.println("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.println("Data de início: (dd/MM/yyyy HH:ss)");
		Date inicio = sdf.parse(sc.nextLine());
		System.out.println("Data de entrega: (dd/MM/yyyy HH:ss)");
		Date entrega = sdf.parse(sc.nextLine());

		AluguelCarro cr = new AluguelCarro(inicio, entrega, new Veiculo(modelo));

		System.out.println("Qual valor por hora: ");
		double precoHora = sc.nextDouble();
		System.out.println("Qual valor por dia: ");
		double precoDia = sc.nextDouble();
		
		ServicoAluguel servicoAluguel = new ServicoAluguel(precoDia, precoHora, new TaxaBrasil());
		
		servicoAluguel.processoPagamento(cr);
		
		System.out.println("ALUGUEL: ");
		System.out.println("Pagamento básico: "+ cr.getPagamento().getPagamentoBasico());
		System.out.println("taxa: "+ cr.getPagamento().getTaxa());
		System.out.println("Pagamento total: "+ cr.getPagamento().getValorTotal());

		sc.close();
	}

}
