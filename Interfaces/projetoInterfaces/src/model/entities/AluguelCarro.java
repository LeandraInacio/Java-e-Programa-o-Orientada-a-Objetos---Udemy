package model.entities;

import java.util.Date;

public class AluguelCarro {

	private Date inicio;
	private Date fim;

	private Veiculo veiculo;
	private Pagamento pagamento;

	public AluguelCarro() {
	}

	public AluguelCarro(Date inicio, Date fim, Veiculo veiculo) {
		// PASSO 2: aqui os valores digitados para o carro são atribuidos aos atributos da classe
		// proximo passo na classe Main
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
}
