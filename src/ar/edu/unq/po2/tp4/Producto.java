package ar.edu.unq.po2.tp4;

public class Producto {

	String nombre;
	double precio;
	boolean precioCuidado = false;
	
	public Producto(String nombre, double precio, boolean precioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
	}

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return this.nombre; 
	}

	public double getPrecio() {
		return this.precio;
	}

	public boolean esPrecioCuidado() {
		return this.precioCuidado;
	}

	public void aumentarPrecio(double aumento) {
		this.precio += aumento;
	}

}
