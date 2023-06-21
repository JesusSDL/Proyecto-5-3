import java.util.ArrayList;

public class Santuario {
	private String nombre;
	private ArrayList<Caballero> Santuario = new ArrayList<>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Caballero> getSantuario() {
		return Santuario;
	}

	public void setSantuario(ArrayList<Caballero> santuario) {
		Santuario = santuario;
	}

	public void agregar(Caballero ps) {
		this.Santuario.add(ps);
	}

	public Caballero posibleHades() {
		Caballero tieneMenosMaldad = this.Santuario.get(0);
		for (Caballero caballeros : Santuario) {
			if (caballeros.getNivelMaldadEncubierta() > tieneMenosMaldad.getNivelMaldadEncubierta()) {
				tieneMenosMaldad = caballeros;
			}
		}
		return tieneMenosMaldad;
	}

	public ArrayList<Caballero> constelacionCercanaAlSol() {
		ArrayList<Caballero> cs = new ArrayList<Caballero>();
		for (Caballero Caballeros : Santuario) {
			if (Caballeros.esDeOro()) {
				cs.add(Caballeros);
			}
		}
		return cs;
	}

	public int porcentajeCaballerosPrecoces() {
		int caballerosPrecoces = 0;
		for (Caballero caballeros : Santuario) {
			if (caballeros.esPrecoz()) {
				caballerosPrecoces++;
			}
		}
		return (caballerosPrecoces * 100) / Santuario.size();
	}

	public ArrayList<Caballero> caballerosMasPoderosos() {
		ArrayList<Caballero> cs = new ArrayList<Caballero>();
		for (Caballero caballeros : Santuario) {
			if (caballeros.esPoderoso()) {
				cs.add(caballeros);
			}
		}
		return cs;
	}
}