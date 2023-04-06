package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class EmpresaTest {
	private Empresa nuevaEmpresa;
	private Empresa nuevaEmpresaDos;
	
	@BeforeEach
	public void setUp() {
		Empleado empleadoUno = new EmpleadoTemporal("Juan", "Berazategui", new Soltere(), LocalDate.of(1970, 10, 28), 120, LocalDate.of(2023, 11, 10), 10);
		Empleado empleadoDos = new EmpleadoPermanente("Jose", "Ezpeleta", new Casade(), LocalDate.of(1987, 4, 6), 100, 2, 5);
		Empleado empleadoTres = new EmpleadoPermanente("Julieta", "Quilmes", new Viude(), LocalDate.of(1970, 3, 27), 110, 0, 2);
		Empleado empleadoCuatro = new EmpleadoContratado("Luz", "Bernal", new Casade(), LocalDate.of(1980, 3, 27), 130, 151515, "Paga con cuenta virtual por transferencia");
		Empleado empleadoUnoMenor = new EmpleadoTemporal("Juan", "Berazategui", new Soltere(), LocalDate.of(2000, 10, 28), 120, LocalDate.of(2023, 11, 10), 10);
		
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		listaEmpleados.add(empleadoUno);
		listaEmpleados.add(empleadoDos);
		listaEmpleados.add(empleadoTres);
		listaEmpleados.add(empleadoCuatro);
		
		List<Empleado> listaEmpleadosDos = new ArrayList<Empleado>();
		listaEmpleadosDos.add(empleadoUnoMenor);
		listaEmpleadosDos.add(empleadoDos);
		listaEmpleadosDos.add(empleadoTres);
		listaEmpleadosDos.add(empleadoCuatro);
				
		nuevaEmpresa = new Empresa("PolyStation", 112233, listaEmpleados);
		nuevaEmpresaDos = new Empresa("PolyStationDos", 112234, listaEmpleadosDos);
	}
	
	@Test
	void testCreacionDeObjeto() {
		assertNotNull(nuevaEmpresa);
	}
	
	@Test
	public void testCalcularTotalDeSueldosBrutos() {
		assertEquals(nuevaEmpresa.totalDeSueldosBrutos(), 1610);
		
	}
	
	@Test
	public void testCalcularTotalDeRetenciones() {
		assertEquals(nuevaEmpresa.totalDeRetenciones(), 241.5);
		assertEquals(nuevaEmpresaDos.totalDeRetenciones(), 216.5);
	}
	
	@Test
	public void testCalcularTotalDeSueldosNetos() {
		assertEquals(nuevaEmpresa.totalDeSueldosNetos(), 1368.5);
	}
}

