package ar.edu.unq.po2.tp4;

import java.util.List;
import java.util.ArrayList;

public class Trabajador {

	private List<IngresoPercibido> ingresosAnuales = new ArrayList<IngresoPercibido>();

	public void addIngreso(IngresoPercibido ingresoPercibido) {
		this.ingresosAnuales.add(ingresoPercibido);
	}

	public double getTotalPercibido() {
		double total = 0;
		for(IngresoPercibido ingresoPercibido: this.ingresosAnuales) {
			total += ingresoPercibido.getMontoPercibido();
		}
		return total;
	}

	public double getMontoImponible() {
		double total = 0;
		for(IngresoPercibido ingresoPercibido: this.ingresosAnuales) {
			total += ingresoPercibido.getMontoConImpuesto();
		}
		return total;
	}

	public Double getImpuestosAPagar() {
		return (this.getMontoImponible() * 2) / 100;
	}

}
