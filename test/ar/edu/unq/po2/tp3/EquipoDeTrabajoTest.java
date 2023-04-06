package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {
	Persona personaUno;
	Persona personaDos;
	Persona personaTres;
	Persona personaCuatro;
	Persona personaCinco;
	EquipoDeTrabajo equipoDeTrabajo;
	
	@BeforeEach
	public void setUp() {
		personaUno = new Persona("juan", LocalDate.of(2000, 6, 4));
		personaDos = new Persona("juanjo", LocalDate.of(1999, 6, 4));
		personaTres = new Persona("jose", LocalDate.of(1990, 6, 4));
		personaCuatro = new Persona("julian", LocalDate.of(1989, 6, 4));
		personaCinco = new Persona("julieta", LocalDate.of(1979, 6, 4));
		equipoDeTrabajo = new EquipoDeTrabajo("Unity");
		equipoDeTrabajo.addPersona(personaUno);
		equipoDeTrabajo.addPersona(personaDos);
		equipoDeTrabajo.addPersona(personaTres);
		equipoDeTrabajo.addPersona(personaCuatro);
		equipoDeTrabajo.addPersona(personaCinco);
	}

	@Test
	void testDigaSuNombre() {
		assertEquals(equipoDeTrabajo.getNombre(), "Unity");
	}
	
	@Test
	void testCualEsElPromedioDeEdad() {
		assertEquals(equipoDeTrabajo.promedioDeEdad(), 30);
		System.out.println(equipoDeTrabajo.promedioDeEdad());
	}

}
