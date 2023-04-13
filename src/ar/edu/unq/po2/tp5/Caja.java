package ar.edu.unq.po2.tp5;

public class Caja {
	private double precioFinalProducto = 0;
	private double precioFinalFactura = 0;
	
	public void addProducto(Producto producto) {
		precioFinalProducto += producto.getPrecio();
		producto.reducirStock();
	}

	public void addFactura(Factura factura) {
		precioFinalFactura += factura.getPrecio();
		factura.getAgencia().registrarPago(factura);
	}
	
	public Double totalValorDeProductos() {
		return this.precioFinalProducto;
	}

	public Double totalValorDeFacturas() {
		return this.precioFinalFactura;
	}
	
	
}
