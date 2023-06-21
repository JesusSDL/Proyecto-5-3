import java.util.ArrayList;

public class Libro {

	private ArrayList<Personaje> al = new ArrayList<Personaje>();

	public ArrayList<Personaje> getAl() {
		return al;
	}

	public void setAl(ArrayList<Personaje> al) {
		this.al = al;
	}

	public void agregar(Personaje ps) {
		this.al.add(ps);
	}

	public boolean hayPersonajeNormal() {
		for (Personaje personaje : al) {
			if (personaje.personanormal()) {
				return true;
			}

		}
		return false;
	}

	public ArrayList<Personaje> losFacheros() {
		ArrayList<Personaje> ps = new ArrayList<Personaje>();
		for (Personaje personaje : al) {
			if(personaje.personalinda()) {
				ps.add(personaje);
			}
		}
		return ps;
	}

	public int cantidadEnMaravilla() {
		int c = 0;

		for (Personaje p : al) {
			if (p.enMaravilla()) {
				c++;
			}
		}
		return c;
	}

	public Personaje elPirado() {
		Personaje elMasPirado = this.al.get(0);
		for (Personaje personaje : al) {
			if (personaje.getLocura() > elMasPirado.getLocura()) {
				elMasPirado = personaje;
			}
		}
		return elMasPirado;
	}

	public int cantidadPersonajesNormales() {
		int a = 0;
		for (Personaje p : al) {
			if (p.personanormal()) {
				a++;
			}
		}
		return a;
	}

	public int cantidadPersonajesFacheros() {
		int b = 0;
		for (Personaje p : al) {
			if (p.personalinda()) {
				b++;
			}
		}
		return b;
	}

}