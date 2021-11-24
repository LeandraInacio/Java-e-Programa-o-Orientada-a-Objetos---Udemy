package entidades;

public class Empregado {

	private String nome;
	private Integer horaDeTrabalho;
	private Double valorHora;

	public Empregado() {

	}

	public Empregado(String nome, Integer horaDeTrabalho, Double valorHora) {
		this.nome = nome;
		this.horaDeTrabalho = horaDeTrabalho;
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoraDeTrabalho() {
		return horaDeTrabalho;
	}

	public void setHoraDeTrabalho(Integer horaDeTrabalho) {
		this.horaDeTrabalho = horaDeTrabalho;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Double pagamento() {
		Double salario = this.getValorHora()*this.getHoraDeTrabalho();

		return salario;
	}

	@Override
	public String toString() {
		return "Empregado:  [nome=" + nome + ", horaDeTrabalho=" + horaDeTrabalho + ", valorHora=" + valorHora + 
				"Salario: "+this.pagamento()+"]";
	}
	
}
