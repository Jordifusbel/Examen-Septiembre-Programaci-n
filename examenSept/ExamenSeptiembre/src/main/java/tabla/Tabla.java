package tabla;


import diario.Diario;

public class Tabla {
	private int matrizEventos;
	
	
	
	@Override
	public String toString() {
		return "La tabla para object es = " + matrizEventos + "]";
	}

	public int getMatrizEventos() {
		return matrizEventos;
	}

	public void setMatrizEventos(int matrizEventos) {
		this.matrizEventos = matrizEventos;
	}

	public void tablaPara(String evento, Diario diario) {
		
	}
	
	public void mostrarTabla() {
		System.out.println(this.toString());
	}
		
}
