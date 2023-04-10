package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

	Trabajador trabajador;
	IngresoPercibido ingresoPercibidoUno;
	IngresoPercibido ingresoPercibidoDos;
	IngresoPorHorasExtras ingresoPorHorasExtras;
	
	@BeforeEach
	public void setUp() {
		trabajador = new Trabajador();
		ingresoPercibidoUno = new IngresoPercibido("octubre", "pago del mes", 500d);
		ingresoPercibidoDos = new IngresoPercibido("marzo", "pago del mes", 600d);
		ingresoPorHorasExtras = new IngresoPorHorasExtras("abril", "pago por fin de semana", 1000d, 48);			
	
		trabajador.addIngreso(ingresoPercibidoUno);
		trabajador.addIngreso(ingresoPercibidoDos);
		trabajador.addIngreso(ingresoPorHorasExtras);
	}
	
	@Test
	void testGetTotalPercibido() {
		assertEquals(trabajador.getTotalPercibido(), new Double(2100));
	}
	
	@Test
	void testGetMontoImponible() {
		assertEquals(trabajador.getMontoImponible(), new Double(1100));
	}
	
	@Test
	void testGetImpuestosAPagar() {
		assertEquals(trabajador.getImpuestosAPagar(), new Double(22));
	}
}
