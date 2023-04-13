package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	ProductoEmpresaTradicional productoUno;
	ProductoCoperativa productoDos;
	
	@BeforeEach
	public void setUp() {
		productoUno = new ProductoEmpresaTradicional("Huevos", 10d, 10);
		productoDos = new ProductoCoperativa("Fideos Municion", 20d, 10);
	}
	
	@Test
	void testGetPrecio() {
		assertEquals(productoUno.getPrecio(), new Double(10));
		assertEquals(productoDos.getPrecio(), new Double(18));
	}

}
