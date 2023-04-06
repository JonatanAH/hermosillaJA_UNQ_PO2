package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	Persona persona;
	Persona personaDos;
	
	@BeforeEach
	public void setUp() {
		persona = new Persona("juan", LocalDate.of(2000, 10, 10));
		personaDos = new Persona("jose", LocalDate.of(1989, 10, 10));
	}
	
	@Test
	void testGetNombre() {
		assertEquals(persona.getNombre(), "juan");
	}
	
	@Test
	void testGetFechaDeNacimiento() {
		assertEquals(persona.getFechaDeNacimiento().getYear(), 2000);
		assertEquals(persona.getFechaDeNacimiento().getMonthValue(), 10);
		assertEquals(persona.getFechaDeNacimiento().getDayOfMonth(), 10);
	}

	@Test
	void testGetEdad() {
		assertEquals(persona.getEdad(), 22);
	}
	
	@Test
	void testCualEsLaPersonaMayor() {
		assertEquals(persona.esMayorQue(personaDos), false);
		assertEquals(personaDos.esMayorQue(persona), true);
	}
}
