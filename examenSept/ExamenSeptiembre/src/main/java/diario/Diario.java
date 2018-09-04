package diario;

import java.util.ArrayList;
import java.util.List;

public class Diario {
	
	private List<String> eventos = new ArrayList<String>();
	private Boolean pulpo;
	
	
	public Diario(List<String> eventos, Boolean pulpo) {
		super();
		this.eventos = eventos;
		this.pulpo = pulpo;
	}

	public List<String> getEventos() {
		return eventos;
	}

	public void setEventos(List<String> eventos) {
		this.eventos = eventos;
	}

	public Boolean getPulpo() {
		return pulpo;
	}

	public void setPulpo(Boolean pulpo) {
		this.pulpo = pulpo;
	}
	
	//Averigua si el evento que especificamos está en la lista de los eventos que han ocurrido ese día.
	public boolean contieneEvento(String evento, List<String> eventos) {
		for (int i = 0; i <= eventos.size();) {
			if (evento == eventos.get(i)) {
				return true;
			}
		return false;
		}
		
		return true;
	}
	//muestra por consola un registro, es decir, qué hizo Mariano ese día y si se ha convertido en pulpo.
	public void mostrarRegistro() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Diario [eventos=" + eventos + "]";
	}
}
