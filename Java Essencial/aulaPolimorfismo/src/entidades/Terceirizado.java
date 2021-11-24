package entidades;

public class Terceirizado extends Empregado {

	public Terceirizado() {

	}

	public Terceirizado(String nome, Integer horaDeTrabalho, Double valorHora) {
		super(nome, horaDeTrabalho, valorHora);

	}

	public void custoadd() {
		this.setValorHora(this.getValorHora() - 50.00);
	}

	@Override
	public final Double pagamento() {
		Double salario = 1.10 * super.pagamento();

		return salario;
	}

	@Override
	public String toString() {
		return "Terceirizado: [pagamento=" + pagamento() + ", Nome=" + getNome() + ", HoraDeTrabalho="
				+ getHoraDeTrabalho() + ", ValorHora=" + getValorHora() + "]";
	}
	
}
