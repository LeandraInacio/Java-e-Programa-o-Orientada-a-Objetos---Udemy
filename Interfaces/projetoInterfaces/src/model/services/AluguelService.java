package model.services;

import model.entities.AluguelCarro;
import model.entities.Pagamento;

public class AluguelService {

	private Double precoPorDia;
	private Double precoPorHora;

	private TaxaBrasil taxaServico;

	public AluguelService(Double precoPorDia, Double precoPorHora, TaxaBrasil taxaServico) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaServico = taxaServico;
		//PASSO 4: os valores digitados pelo usuário são atribuídos aos atributos da classe
		//proximo passo, classe Main
	}

	public void processoPagamento(AluguelCarro aluguel) {// Passo 6: é feito o cálculo do pagamento básico do aluguel para o objeto cr
		long t1 = aluguel.getInicio().getTime();
		long t2 = aluguel.getFim().getTime();
		double hora = (double) (t2 - t1) / 1000 / 60 / 60;

		double pagamentoBasico;
		if (hora <= 12.0) {
			pagamentoBasico = Math.ceil(hora) * precoPorHora;
		} else {
			pagamentoBasico = Math.ceil(hora / 24) * precoPorDia;
		}
		//Passo 7: é passado como parâmetro para a classe que calcula a taxa, o valor do pagamento básico.
		//proximo passo classe de taxa 
		double taxa = taxaServico.tax(pagamentoBasico);
		
		
		Pagamento pagamento = new Pagamento();
		
		//PASSO 9: será setado na classe pagamento no método setPagamentoBasico o valor sem as taxas 
		pagamento.setPagamentoBasico(pagamentoBasico);
		//PASSO 10: é setado na classe pagamento no método setTaxa o valor da taxa
		pagamento.setTaxa(taxa);
		
		//PASSO 10: como os valores de pagamento foram setados em pagamento, é necessário indicar para a classe 
		//AluguelCarro quais os valores deverão ser setados e desta forma indicando o objeto pagamento. 
		//proximo passo, classe Main
		aluguel.setPagamento(pagamento);
		
	}
}
