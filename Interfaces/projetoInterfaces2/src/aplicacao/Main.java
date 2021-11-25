package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Pagamento;
import model.entities.Veiculo;
import model.services.AluguelService;
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
		//PASSO 1: estou instanciando o objeto carro que irá atribuir ao atributos da classe os valores digitados
		// proximo passo é na classe AluguelCarro. 
		System.out.println("Qual valor por hora: ");
		double precoHora = sc.nextDouble();
		System.out.println("Qual valor por dia: ");
		double precoDia = sc.nextDouble();
		
		AluguelService servicoAluguel = new AluguelService(precoDia, precoHora, new TaxaBrasil());
		//PASSO 3: a classe AluguelServices irá receber os valores digitados pelo usuário
		// próximo passo, AluguelServices
		
		servicoAluguel.processoPagamento(cr);// PASSO 5: é chamado o método de cálculo de pagamento, mas é necessário passar
		// indicar o objeto carro que terá o pagamento calculado
		//próximo passo: classe AluguelService
		
		System.out.println("ALUGUEL: ");
		
		
		Pagamento pagamento = cr.getPagamento();
		Double pagamentoBasico = pagamento.getPagamentoBasico();
		
		System.out.println("Pagamento básico: "+ pagamentoBasico);//Poderia ser pagamento.getPagamentobasico
		
		System.out.println("taxa: "+ cr.getPagamento().getTaxa());//Poderia ser pagamento.getTaxa
		
		System.out.println("Pagamento total: "+ cr.getPagamento().getValorTotal()); //poderia ser pagamento.getValorTotal

		sc.close();
	}

}
