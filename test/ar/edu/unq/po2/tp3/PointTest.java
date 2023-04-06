package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {
	Punto punto;	
	Punto puntoCero;
	
	@BeforeEach
	public void setUp() {
		punto = new Punto(10, 5);
		puntoCero = new Punto();
	}
	
	@Test
	void testMoverElPunto() {
		punto.setXY(12, 20);
		puntoCero.setXY(15, 40);
		assertEquals(punto.getX(), 12); assertEquals(punto.getY(), 20);
		assertEquals(puntoCero.getX(), 15); assertEquals(puntoCero.getY(), 40);
	}
	
	@Test
	void testCrearNuevoPunto() {
		puntoCero.setXY(10, 20);
		Punto nuevoPunto = punto.sumarPuntos(puntoCero);
		assertEquals(nuevoPunto.getX(), 20); assertEquals(nuevoPunto.getY(), 25);
	}
}
