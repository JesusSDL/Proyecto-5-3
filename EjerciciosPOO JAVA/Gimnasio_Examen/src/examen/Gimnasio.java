package examen;
import java.util.ArrayList;

public class Gimnasio {

	private String nombre;

	private ArrayList<Persona> personas = new ArrayList<>();

	public void inscribir(Persona p) {
		this.personas.add(p);
	}

	public int losPacifistas() {
	int resultado=0;
	for (Persona p: personas ) {
		if (p.esPacifista()){
		resultado++;
		}
	}
	return resultado;
	}

	public ArrayList<Persona> aLasPatadas() {
		ArrayList<Persona> solucion = new ArrayList<Persona>();
		for (Persona p : personas) {
			if (p.estaSacado() && p.debeCuotas()) {
				solucion.add(p);
			}
		}
		return solucion;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> p) {
		this.personas= p;
	}
}