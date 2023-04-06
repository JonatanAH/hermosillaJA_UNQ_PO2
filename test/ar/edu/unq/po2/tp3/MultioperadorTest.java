package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTest {
	Multioperador multiuso;
	List<Integer> listaNumeros;
	
	@BeforeEach
	public void setUp() {
		multiuso = new Multioperador();
		listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(4);
	}
	
	@Test
	void testProbandoOperaciones() {
		assertEquals(multiuso.sumarTodo(listaNumeros), 9);
		assertEquals(multiuso.restarTodo(listaNumeros), -9);
		assertEquals(multiuso.multiplicarTodo(listaNumeros), 24);
	}

}
