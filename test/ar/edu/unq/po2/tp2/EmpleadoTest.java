package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	Empleado empleadoPC;
	Empleado empleadoPS;
	Empleado empleadoT;
	Empleado empleadoTMenor;
	Empleado empleadoC;
	
	@BeforeEach
	public void setUp() {
		// El formato de fecha que se usa es "dd/MM/yyyy" ejemplo "28/01/1989".
		empleadoPS = new EmpleadoPermanente("Julieta", "Quilmes", new Soltere(), "27/03/1970", 110, 0, 2);
		empleadoPC = new EmpleadoPermanente("Jose", "Ezpeleta", new Casade(), "27/03/1987", 100, 2, 5);
		empleadoT = new EmpleadoTemporal("Juan", "Berazategui", new Soltere(), "27/03/1971", 120, "10/11/2023", 10);
		empleadoTMenor = new EmpleadoTemporal("Juancito", "Berazategui", new Soltere(), "27/03/2000", 120, "10/11/2023", 10);
		empleadoC = new EmpleadoContratado("Luz", "Bernal", new Casade(), "27/03/1980", 130, 151515, "Paga con cuenta virtual por transferencia");
	}
	
	@Test
	void testCreacionDeObjeto() {
		assertNotNull(empleadoPS);
		assertNotNull(empleadoPC);
		assertNotNull(empleadoT);
		assertNotNull(empleadoTMenor);
		assertNotNull(empleadoC);
	}
	
	@Test
	void testObtenerNombreYDireccion() {
		assertEquals(empleadoPS.getNombre(), "Julieta");assertEquals(empleadoPS.getDireccion(), "Quilmes");
		assertEquals(empleadoPC.getNombre(), "Jose");assertEquals(empleadoPC.getDireccion(), "Ezpeleta");
		assertEquals(empleadoT.getNombre(), "Juan");assertEquals(empleadoT.getDireccion(), "Berazategui");
		assertEquals(empleadoTMenor.getNombre(), "Juancito");assertEquals(empleadoTMenor.getDireccion(), "Berazategui");
		assertEquals(empleadoC.getNombre(), "Luz");assertEquals(empleadoC.getDireccion(), "Bernal");
	}
	
	@Test
	public void testCalcularSueldoBruto() {
		assertEquals(empleadoPS.calcularSueldoBruto(), 210);
		assertEquals(empleadoPC.calcularSueldoBruto(), 750);
		assertEquals(empleadoT.calcularSueldoBruto(), 520);
		assertEquals(empleadoTMenor.calcularSueldoBruto(), 520);
		assertEquals(empleadoC.calcularSueldoBruto(), 130);
	}
	
	@Test
	public void testCalcularMiEdad() {
		assertEquals(empleadoPS.calcularMiEdad(), 53);
		assertEquals(empleadoPC.calcularMiEdad(), 36);
		assertEquals(empleadoT.calcularMiEdad(), 52);
		assertEquals(empleadoTMenor.calcularMiEdad(), 23);
		assertEquals(empleadoC.calcularMiEdad(), 43);
	}
	
	@Test
	public void testCalcularRetenciones() {
		assertEquals(empleadoPS.calcularRetenciones(), 27.5);
		assertEquals(empleadoPC.calcularRetenciones(), 65);
		assertEquals(empleadoT.calcularRetenciones(), 99);
		assertEquals(empleadoTMenor.calcularRetenciones(), 74);
		assertEquals(empleadoC.calcularRetenciones(), 50);
	}
	

	@Test
	public void testCalcularElSueldoNeto() {
		assertEquals(empleadoPS.calcularSueldoNeto(), 182.5);
		assertEquals(empleadoPC.calcularSueldoNeto(), 685);
		assertEquals(empleadoT.calcularSueldoNeto(), 421);
		assertEquals(empleadoTMenor.calcularSueldoNeto(), 446);
		assertEquals(empleadoC.calcularSueldoNeto(), 80);		
	}

}
