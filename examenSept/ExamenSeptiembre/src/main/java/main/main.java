package main;

import java.util.List;

import diario.Diario;
import registro.Registro;

public class main {
	
	private void casosResgistro() {
		List<String> eventos = null;
		Registro registro = new registro(eventos, false);

		System.out.println(registro.getEventos().size());
		
	}
	
	
		
}
