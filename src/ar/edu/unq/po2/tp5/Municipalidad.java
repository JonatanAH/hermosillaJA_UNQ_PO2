package ar.edu.unq.po2.tp5;

public class Municipalidad implements Agencia {

	@Override
	public void registrarPago(Factura factura) {
		System.out.println("Se Pago la factura de Municipalidad con valor de " + factura.getPrecio());
	}

}
