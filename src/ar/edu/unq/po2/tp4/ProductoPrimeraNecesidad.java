package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, double descuento) {
		super(nombre, precio, precioCuidado);
		this.descuento = descuento;
	}
	
	private double getDescuento(){
		double valorDescontado;
		valorDescontado = (this.precio * this.descuento) / 100;
		return valorDescontado;
	}

	@Override
	public double getPrecio() {
		return this.precio - this.getDescuento();
	}

}
