package entidades;

import java.util.Date;

public class HoraContrato {
	private Date data;
	private float valorPorHora;
	private Integer horas;
	
	public float valorTotal() {
		
		return valorPorHora*horas;
	}
	
	public HoraContrato(Date data, float valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public float getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(float valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
}
