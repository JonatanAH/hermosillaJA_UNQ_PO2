package ar.edu.unq.po2.tp4;

public class IngresoPercibido {

	private String mesDePercepcion;
	private String elConcepto;
	private double montoPercibido;

	public IngresoPercibido(String mesDePercepcion, String elConcepto, double montoPercibido) {
		this.mesDePercepcion = mesDePercepcion;
		this.elConcepto = elConcepto;
		this.montoPercibido = montoPercibido;
	}

	public Double getMontoPercibido() {
		return this.montoPercibido;
	}

	public double getMontoConImpuesto() {
		return this.getMontoPercibido();
	}
	
}
