package ar.edu.unq.po2.tp5;

public abstract class Producto {
	String nombre;	
	double precio;
	int stock;
		
	Producto(String nombre, double precio, int Stock){
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	protected double getPrecio() {
		return this.precio;
	}

	public void reducirStock() {
		this.stock -= 1;
		
	}
	
}
