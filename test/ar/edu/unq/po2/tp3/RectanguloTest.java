package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTest {
	Rectangulo rectangulo;
	Rectangulo rectanguloDos;
	
	@BeforeEach
	public void setUp() {
		rectangulo = new Rectangulo(10,10,40,50);
		rectanguloDos = new Rectangulo(10,10,50,40);
	}
	
	@Test
	void testObtenerAreaDelRectangulo() {
		assertEquals(rectangulo.getArea(), 2000);
	}
	
	@Test
	void testObtenerPerimetroDelRectangulo() {
		assertEquals(rectangulo.getPerimetro(), 180);
	}
	
	@Test
	void testObtenerEjeDelRectangulo() {
		assertEquals(rectangulo.getEje(), "Vertical");
		assertEquals(rectanguloDos.getEje(), "Horizontal");
	}
}
