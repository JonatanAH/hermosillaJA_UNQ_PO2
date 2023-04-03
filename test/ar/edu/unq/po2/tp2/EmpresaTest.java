package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class EmpresaTest {
	private Empresa nuevaEmpresa;
	private Empresa nuevaEmpresaDos;
	
	@BeforeEach
	public void setUp() {
		Empleado empleadoUno = new EmpleadoTemporal("Juan", "Berazategui", new Soltere(), "28/10/1970", 120, "10/11/2023", 10);
		Empleado empleadoDos = new EmpleadoPermanente("Jose", "Ezpeleta", new Casade(), "6/04/1987", 100, 2, 5);
		Empleado empleadoTres = new EmpleadoPermanente("Julieta", "Quilmes", new Viude(), "27/03/1970", 110, 0, 2);
		Empleado empleadoCuatro = new EmpleadoContratado("Luz", "Bernal", new Casade(), "27/03/1980", 130, 151515, "Paga con cuenta virtual por transferencia");
		Empleado empleadoUnoMenor = new EmpleadoTemporal("Juan", "Berazategui", new Soltere(), "28/10/2000", 120, "10/11/2023", 10);
		
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

