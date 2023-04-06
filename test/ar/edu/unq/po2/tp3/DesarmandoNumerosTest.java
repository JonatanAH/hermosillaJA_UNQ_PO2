package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesarmandoNumerosTest {
	DesarmandoNumeros seleccionador;
	List<Integer> arregloDeEnteros;
	
	@BeforeEach
	public void setUp() {
		seleccionador = new DesarmandoNumeros();
		arregloDeEnteros = new ArrayList<Integer>();
		arregloDeEnteros.add(1);
		arregloDeEnteros.add(12);
		arregloDeEnteros.add(123);
		arregloDeEnteros.add(1234);
		arregloDeEnteros.add(12345);
		arregloDeEnteros.add(123456);
		arregloDeEnteros.add(1234567);
		arregloDeEnteros.add(2222);		
	}

	@Test
	void testDescubrirCualEsElMasPar() {
		assertEquals(seleccionador.maxPar(arregloDeEnteros), 2222);
	}

}
