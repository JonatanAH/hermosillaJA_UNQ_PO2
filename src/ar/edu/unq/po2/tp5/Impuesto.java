package ar.edu.unq.po2.tp5;

public class Impuesto implements Factura {

	private double tasaServicio;
	private Agencia agencia;

	public Impuesto(Agencia agencia, double tasaServicio) {
		this.agencia = agencia;
		this.tasaServicio = tasaServicio;
	}

	@Override
	public double getPrecio() {
		return this.tasaServicio;
	}
	
	public Agencia getAgencia() {
		return this.agencia;
	}

}
