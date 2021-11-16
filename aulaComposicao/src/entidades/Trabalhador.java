package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enumeracao.Nivel;

public class Trabalhador {

	private String nomeTrabalhador;
	private Nivel nivel;
	private Double salarioBase;

	// Composição de classes

	private Departamento departamento;
	private List<HoraContrato> contrato = new ArrayList<>();

	// Contrutor

	//public Trabalhador() {

	//}

	public Trabalhador(String nomeTrabalhador, Nivel nivel, Double salarioBase, Departamento departamento) {
		this.nomeTrabalhador = nomeTrabalhador;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	// Get and Set

	public String getNomeTrabalhador() {
		return nomeTrabalhador;
	}

	public void setNomeTrabalhador(String nomeTrabalhador) {
		this.nomeTrabalhador = nomeTrabalhador;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContrato() {
		return contrato;
	}

	/*
	 * public void setContrato(List<HoraContrato> contrato) { this.contrato =
	 * contrato; NÃO É POSSIVEL SETAR UMA LISTA PARA SUBSTITUIR A LISTA DE CONTRATOS
	 * CONSTRUÍDA. }
	 */

	// Métodos

	public void addContrato(HoraContrato contract) {
		contrato.add(contract);
	}

	public void removerContrato(HoraContrato contract) {
		contrato.add(contract);
	}

	public Double salarioMes(int ano, int mes) {
		Double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (HoraContrato c : contrato) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}

}
