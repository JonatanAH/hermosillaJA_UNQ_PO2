package ar.edu.unq.po2.tp5;

public class Telefonica implements Agencia {

	@Override
	public void registrarPago(Factura factura) {
		System.out.println("Se Pago la factura de Telefonica con valor de " + factura.getPrecio());
	}

}
