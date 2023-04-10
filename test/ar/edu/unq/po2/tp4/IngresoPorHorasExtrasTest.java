package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoPorHorasExtrasTest {
	IngresoPorHorasExtras ingresoPorHorasExtras;
	
	@BeforeEach
	public void setUp() {
		ingresoPorHorasExtras = new IngresoPorHorasExtras("abril", "pago por fin de semana", 1000d, 48);			
	}
	
	@Test
	void testGetMontoConImpuesto() {
		assertEquals(ingresoPorHorasExtras.getMontoConImpuesto(), new Double(0));
	}

}
