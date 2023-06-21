public class Personaje {

	private int secretos;
	private int locura;
	private int distanciaubicacion;
	static int maxLocura = 100; // máximo inamobible de locura.

	public int getSecretos() {
		return secretos;
	}

	public void setSecretos(int secretosSet) {
		this.secretos = secretosSet;
	}

	public int getLocura() {
		return locura;
	}

	public void setLocura(int locuraSet) {
		this.locura = locuraSet;
	}

	public int getDistanciaubicacion() {
		return distanciaubicacion;
	}

	public void setDistanciaubicacion(int distanciaubicacionSet) {
		this.distanciaubicacion = distanciaubicacionSet;
	}

	public Personaje(int secretos, int locura, int distanciaubicacion) {
		this.secretos = secretos;
		this.locura = locura;
		this.distanciaubicacion = distanciaubicacion;
	}

	public boolean enMaravilla() {
		return getDistanciaubicacion() < 0;
	}

	public boolean personalinda() {
		return getLocura() > 75 && getDistanciaubicacion() < 0;

	}

	public boolean personanormal() {
		return getLocura() < 10 && getSecretos() >= 500;

	}

	public void embellecer(int x) {
		/*
		 int resultado = getLocura() + ValorDado; setLocura(resultado)
		 */
		setSecretos(getSecretos() - 10);
		setLocura(getLocura() + x);
		if (getLocura() > maxLocura) {
			setLocura(maxLocura);
		}

	}
}