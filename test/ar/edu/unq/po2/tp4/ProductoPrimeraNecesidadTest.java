package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad harina;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10);
		harina = new ProductoPrimeraNecesidad("Harina", 8d, false, 25);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
		assertEquals(new Double(6), harina.getPrecio());
	}
}
