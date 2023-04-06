package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplosTest {
	Multiplos multiplicador;

	@BeforeEach
	public void setUp() {
		multiplicador = new Multiplos();
	}
	
	@Test
	void testViendoQueTanCercanoEstaDeMil() {
		assertEquals(multiplicador.masCercanoaMil(4, 8), 1000);
		assertEquals(multiplicador.masCercanoaMil(7, 8), -1);
		assertEquals(multiplicador.masCercanoaMil(8, 4), 1000);
		assertEquals(multiplicador.masCercanoaMil(8, 7), -1);
		assertEquals(multiplicador.masCercanoaMil(4, 4), 1000);
		assertEquals(multiplicador.masCercanoaMil(3, 9), 999);		
	}
}
