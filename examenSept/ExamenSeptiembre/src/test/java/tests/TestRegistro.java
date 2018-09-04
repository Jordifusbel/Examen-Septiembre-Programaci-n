package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import registro.Registro;

public class TestRegistro {

	@Test
	public void test1() {

		Collection<String> eventos = null;
		
		eventos.add("trabajar");
		eventos.add("tocar un árbol");
		eventos.add("correr");
		eventos.add("twitter");
		
		Registro registro = new Registro(eventos, false);
		
		assertTrue(registro.getEventos().size() == 5);
		System.out.println();
		assertFalse(registro.getPulpo());
		assertTrue(registro.contieneEvento("hamburguesa", eventos));
		assertFalse(registro.contieneEvento("pizza", eventos));
		
	}

}
