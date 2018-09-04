package registro;

import java.util.ArrayList;
import java.util.Collection;

public class Registro {
		
		private Collection<String> eventos = new ArrayList<String>();
		private Boolean pulpo;
		
		
		
		public Registro(Collection<String> eventos, Boolean pulpo) {
			super();
			this.eventos = eventos;
			this.pulpo = pulpo;
		}

		public Collection<String> getEventos() {
			return eventos;
		}

		public void setEventos(Collection<String> eventos) {
			this.eventos = eventos;
		}

		public Boolean getPulpo() {
			return pulpo;
		}

		public void setPulpo(Boolean pulpo) {
			this.pulpo = pulpo;
		}
		
		//Averigua si el evento que especificamos está en la lista de los eventos que han ocurrido ese día.
		public boolean contieneEvento(String evento, Collection<String> eventos) {
			return eventos.contains(evento);
		}
		//muestra por consola un registro, es decir, qué hizo Mariano ese día y si se ha convertido en pulpo.
		public void mostrarRegistro() {
			System.out.println(this.toString());
		}

		@Override
		public String toString() {
			return "Test Registro" + "/r"
					+ "eventos = " + eventos + "/r"
					+ "pulpo = " + pulpo;
			
		}
}

