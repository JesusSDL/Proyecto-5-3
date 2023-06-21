public class Luchador {
	private String nombre;
	private boolean haceJiuJitsu;
	private int EnergiaLuchador;
	final static int constanteJCVD = 50;
	private double fuerzaLuchador;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isHaceJiuJitsu() {
		return haceJiuJitsu;
	}

	public void setHaceJiuJitsu(boolean haceJiuJitsu) {
		this.haceJiuJitsu = haceJiuJitsu;
	}

	public double getFuerzaLuchador() {
		return fuerzaLuchador;
	}

	public void setFuerzaLuchador(double fuerzaLuchador) {
		this.fuerzaLuchador = fuerzaLuchador;
	}

	public int getEnergiaLuchador() {
		return EnergiaLuchador;
	}

	public void setEnergiaLuchador(int energiaLuchador) {
		EnergiaLuchador = energiaLuchador;
	}

	public Luchador(String nombre, boolean haceJiuJitsu, int energiaLuchador, double fuerzaLuchador) {
		this.nombre = nombre;
		this.haceJiuJitsu = haceJiuJitsu;
		EnergiaLuchador = energiaLuchador;
		this.fuerzaLuchador = fuerzaLuchador;
	}

	public Luchador() {
		// TODO Auto-generated constructor stub
	}

	public void entrenar(double HorasEntrenar) {
		setFuerzaLuchador(getFuerzaLuchador() + (0.5*HorasEntrenar));
	}

	public void mimir() {
		setEnergiaLuchador(getEnergiaLuchador() + 20);
	}

	public boolean esChuckNorris() {
		return getFuerzaLuchador() * constanteJCVD > 700 && getEnergiaLuchador() > 15;
	}

	public boolean esInsecto() {
		return getFuerzaLuchador() < 500;
	}
}