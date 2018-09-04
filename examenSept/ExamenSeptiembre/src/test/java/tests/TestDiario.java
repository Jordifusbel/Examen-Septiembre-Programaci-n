package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import diario.Diario;
import registro.Registro;

public class TestDiario {

	
	@Test
	public void test1() {
		
		
		Registro registro1 = new Registro(null, false);
		Registro registro2 = new Registro(null, false);
		Registro registro3 = new Registro(null, true);
		
		ArrayList<Registro> Registros = null;
		
		Diario diary = new Diario(Registros);

		diary.getRegistros().add(registro1);
		diary.getRegistros().add(registro2);
		diary.getRegistros().add(registro3);
		
		System.out.println(diary.toString());
		assertTrue(diary.getRegistros().size()==3);
	}

}
