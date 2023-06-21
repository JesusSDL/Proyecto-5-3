public class Equipo {

	private String nombreEquipo;
	private int a�osAntig�edad;
	private int victoriasSeguidas;
	private Esgrimista esgrima;

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String NombreEquipo) {
		this.nombreEquipo = NombreEquipo;
	}

	public int getA�osAntig�edad() {
		return a�osAntig�edad;
	}

	public void setA�osAntig�edad(int A�osAntig�edad) {
		this.a�osAntig�edad = A�osAntig�edad;
	}

	public int getVictoriasSeguidas() {
		return victoriasSeguidas;
	}

	public void setVictoriasSeguidas(int VictoriasSeguidas) {
		this.victoriasSeguidas = VictoriasSeguidas;
	}

	public Esgrimista getEsgrima() {
		return esgrima;
	}

	public void setEsgrima(Esgrimista Esgrima) {
		this.esgrima = Esgrima;
	}

	public Equipo(String nombreEquipo, int a�osAntig�edad, int victoriasSeguidas, Esgrimista esgrima) {
		this.nombreEquipo = nombreEquipo;
		this.a�osAntig�edad = a�osAntig�edad;
		this.victoriasSeguidas = victoriasSeguidas;
		this.esgrima = esgrima;

	}

	public boolean esEquipoFavorito() {
		return getEsgrima().esCandidatoOro();
	}

}
