package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoPercibidoTest {
	IngresoPercibido ingresoPercibido;
	
	@BeforeEach
	public void setUp() {
		ingresoPercibido = new IngresoPercibido("octubre", "pago del mes", 500d);
	}
	
	@Test
	void testGetMontoPercibido() {
		assertEquals(ingresoPercibido.getMontoPercibido(), new Double(500));
	}
	
	@Test
	void testGetMontoConImpuesto() {
		assertEquals(ingresoPercibido.getMontoConImpuesto(), new Double(500));
	}

}
