package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends IngresoPercibido {

	private int horasExtras;

	public IngresoPorHorasExtras(String mesDePercepcion, String elConcepto, double montoPercibido, int horasExtras) {
		super(mesDePercepcion, elConcepto, montoPercibido);
		this.horasExtras = horasExtras;
	}

	@Override
	public double getMontoConImpuesto() {
		return 0;
	}
	
}
