package ar.edu.unq.po2.tp5;

public class Servicio implements Factura{

	private Agencia agencia;
	private double precioPorUnidad;
	private int unidades;

	public Servicio(Agencia agencia, double precioPorUnidad, int unidades) {
		this.agencia = agencia;
		this.precioPorUnidad = precioPorUnidad;
		this.unidades = unidades;
	}

	@Override
	public double getPrecio() {
		return this.precioPorUnidad * this.unidades;
	}
	
	public Agencia getAgencia() {
		return this.agencia;
	}
}
