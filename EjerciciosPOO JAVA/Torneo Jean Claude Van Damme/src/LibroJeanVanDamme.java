import java.util.ArrayList;

public class LibroJeanVanDamme {
	private ArrayList<Luchador> Luchadores = new ArrayList<Luchador>();

	public ArrayList<Luchador> getLuchador() {
		return Luchadores;
	}

	public void setLuchador(ArrayList<Luchador> luchadores) {
		Luchadores = luchadores;
	}

	public void setAl(ArrayList<Luchador> Luchadores) {
		this.Luchadores = Luchadores;
	}

	public void agregar(Luchador ps) {
		this.Luchadores.add(ps);
	}

	public ArrayList<Luchador> losChuckNorris() {
		ArrayList<Luchador> ps = new ArrayList<Luchador>();
		for (Luchador luchador : Luchadores) {
			if (luchador.esChuckNorris()) {
				ps.add(luchador);
			}
		}
		return ps;
	}

	public boolean hayJiuJitsu() {
		for (Luchador luchador : Luchadores) {
			if (luchador.isHaceJiuJitsu()) {
				return true;
			}
		}
		return false;
	}
	public int cantidadDeJiuJitsus() {
		int a=0;
		for (Luchador luchador : Luchadores) {
			if (luchador.isHaceJiuJitsu()) {
				a++;
			}
		}
		return a;
		
	}
}
