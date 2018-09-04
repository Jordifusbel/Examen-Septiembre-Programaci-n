package diario;

import java.util.ArrayList;

import registro.Registro;

public class Diario {

	private ArrayList<Registro> registros;

	
	public Diario(ArrayList<Registro> registros) {
		super();
		this.registros = registros;
	}

	public ArrayList<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(ArrayList<Registro> registros) {
		this.registros = registros;
	}
	
	public void incluirRegistro(Registro registro) {
		registros.add(registro);
	}
	
	public void mostrarDiario() {
		System.out.println(this.registros);
	}

	@Override
	public String toString() {
		return "Diario [registros=" + registros + "]";
	}
	
}
