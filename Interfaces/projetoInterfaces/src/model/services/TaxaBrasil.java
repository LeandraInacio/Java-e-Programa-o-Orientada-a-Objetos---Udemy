package model.services;

public class TaxaBrasil {

	public double tax(double montante) {// Passo 8: é calculado o valor do pagamento básico + taxa e retonado como double
		//próximo passo, classe aluguelServices
		if(montante<=100.0) {
			return montante*0.2;
		}else {
			return montante*0.15;
		}
	}
}
