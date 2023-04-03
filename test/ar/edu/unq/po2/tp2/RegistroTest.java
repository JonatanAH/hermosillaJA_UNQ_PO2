package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegistroTest {
	Registro nuevoRegistro;
	
	@BeforeEach
	public void setUp() {
		nuevoRegistro = new Registro("Jose","Berazategui", 100, 685, "No entiendo que quiere el cliente");
	}
	
	@Test
	void testCreacionDeObjeto() {
		assertNotNull(nuevoRegistro);
	}

}
