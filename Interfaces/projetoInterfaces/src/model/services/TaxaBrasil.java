package model.services;

public class TaxaBrasil {

	public double tax(double montante) {
		if(montante<=100.0) {
			return montante*0.2;
		}else {
			return montante*0.15;
		}
	}
}
