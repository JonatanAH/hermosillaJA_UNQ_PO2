package ar.edu.unq.po2.tp4;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> mercaderia = new ArrayList<Producto>();

	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public int getCantidadDeProductos() {
		return this.mercaderia.size();
	}

	public void agregarProducto(Producto producto) {
		this.mercaderia.add(producto);
	}

	public double getPrecioTotal() {
		double total = 0;
		for(Producto producto: this.mercaderia) {
			total += producto.getPrecio();
		}
		return total;
	}

}
