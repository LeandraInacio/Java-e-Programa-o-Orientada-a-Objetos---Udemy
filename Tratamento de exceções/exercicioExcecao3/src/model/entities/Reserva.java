package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private int numeroDoQuarto;
	private Date checkin;
	private Date checkout;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva(int numeroDoQuarto, Date checkin, Date checkout) {

		this.numeroDoQuarto = numeroDoQuarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public int getNumeroDoQuarto() {
		return numeroDoQuarto;
	}

	public void setNumeroDoQuarto(int numeroDoQuarto) {
		this.numeroDoQuarto = numeroDoQuarto;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public long duracao() {
		long diferenca = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}

	public void updateData(Date checkIn, Date checkOut) throws IllegalArgumentException {
		Date hoje = new Date();
		if (checkIn.before(hoje) || checkOut.before(hoje)) {
			throw new IllegalArgumentException("As datas necessitam ser datas futuras");
		} else if (!checkOut.after(checkIn)) {
			throw new IllegalArgumentException("Sua data de entrada está posterior à saída");
		}
		this.checkin = checkIn;
		this.checkout = checkOut;
	}

	@Override
	public String toString() {
		return "numeroDoQuarto=" + numeroDoQuarto + ", checkin=" + sdf.format(checkin) + ", checkout="
				+ sdf.format(checkout) + ", " + duracao() + " noites";
	}

}
