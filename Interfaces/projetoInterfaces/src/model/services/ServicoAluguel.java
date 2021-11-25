package model.services;

import model.entities.AluguelCarro;
import model.entities.Pagamento;

public class ServicoAluguel {

	private Double precoPorDia;
	private Double precoPorHora;

	private TaxaBrasil taxaServico;

	public ServicoAluguel(Double precoPorDia, Double precoPorHora, TaxaBrasil taxaServico) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaServico = taxaServico;
	}

	public void processoPagamento(AluguelCarro aluguel) {
		long t1 = aluguel.getInicio().getTime();
		long t2 = aluguel.getFim().getTime();
		double hora = (double) (t2 - t1) / 1000 / 60 / 60;

		double pagamentoBasico;
		if (hora <= 12.0) {
			pagamentoBasico = Math.ceil(hora) * precoPorHora;
		} else {
			pagamentoBasico = Math.ceil(hora / 24) * precoPorDia;
		}
		
		double taxa = taxaServico.tax(pagamentoBasico);
		
		aluguel.setPagamento(new Pagamento(pagamentoBasico,taxa));
	}
}
