package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTest {
	Cuadrado cuadrado;
	
	@BeforeEach
	public void setUp() {
		cuadrado = new Cuadrado(10,10,40);
	}
	
	@Test
	void testObtenerAreaDelRectangulo() {
		assertEquals(cuadrado.getArea(), 1600);
	}
	
	@Test
	void testObtenerPerimetroDelRectangulo() {
		assertEquals(cuadrado.getPerimetro(), 160);
	}
}
