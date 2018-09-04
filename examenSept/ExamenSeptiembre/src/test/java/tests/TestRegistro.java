package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import diario.Diario;

public class TestRegistro {

	@Test
	public void test1() {

		List<String> eventos = null;
		
		Diario Diario = new Diario(eventos, false);
		
		assertTrue(Diario.getEventos().size() == 5);
		System.out.println();
		assertFalse(Diario.getPulpo());
		assertTrue(Diario.contieneEvento("hamburguesa", eventos));
		assertFalse(Diario.contieneEvento("pizza", eventos));
		
	}

}
