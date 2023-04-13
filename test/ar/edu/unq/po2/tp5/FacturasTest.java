package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturasTest {
	Servicio facturaUno;
	Impuesto facturaDos;
	Telefonica telefonica;
	Municipalidad municipalidad;
	
	@BeforeEach
	public void setUp() {
		facturaUno = new Servicio(telefonica, 10d, 20);
		facturaDos = new Impuesto(municipalidad, 100d);
	}
	
	@Test
	void testGetPrecio() {
		assertEquals(facturaUno.getPrecio(), new Double(200));
		assertEquals(facturaDos.getPrecio(), new Double(100));
	}

}
