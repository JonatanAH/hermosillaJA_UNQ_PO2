package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.IngresoPercibido;

class CajaTest {
	Caja caja;
	ProductoEmpresaTradicional productoUno;
	ProductoEmpresaTradicional productoDos;
	ProductoEmpresaTradicional productoTres;
	ProductoCoperativa productoCuatro;
	ProductoCoperativa productoCinco;
	Servicio facturaUno;
	Impuesto facturaDos;
	Telefonica telefonica;
	Municipalidad municipalidad;
	
	@BeforeEach
	public void setUp() {
		caja = new Caja();
		productoUno = new ProductoEmpresaTradicional("Huevos", 10d, 10);
		productoDos = new ProductoEmpresaTradicional("Jamon", 11d, 10);
		productoTres = new ProductoEmpresaTradicional("Lentejas", 15d, 10);
		productoCuatro = new ProductoCoperativa("Fideos Municion", 8d, 10);
		productoCinco = new ProductoCoperativa("Arroz", 12d, 10);
		telefonica = new Telefonica();
		municipalidad = new Municipalidad();
		facturaUno = new Servicio(telefonica, 10d, 20);
		facturaDos = new Impuesto(municipalidad, 100d);
		caja.addProducto(productoUno);
		caja.addProducto(productoDos);
		caja.addProducto(productoTres);
		caja.addProducto(productoCuatro);
		caja.addProducto(productoCinco);
		caja.addFactura(facturaUno);
		caja.addFactura(facturaDos);
	}
	
	@Test
	void testCuantoValeTodo() {
		assertEquals(caja.totalValorDeProductos(), new Double(54));
		assertEquals(caja.totalValorDeFacturas(), new Double(300));
	}
}
