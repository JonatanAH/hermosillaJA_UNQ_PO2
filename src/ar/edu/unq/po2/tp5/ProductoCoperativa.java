package ar.edu.unq.po2.tp5;

public class ProductoCoperativa extends Producto {

	ProductoCoperativa(String nombre, double precio, int stock) {
		super(nombre, precio, stock);
	}

	@Override
	protected double getPrecio() {
		return super.getPrecio() - (super.getPrecio() * 10) / 100;
	}

}
