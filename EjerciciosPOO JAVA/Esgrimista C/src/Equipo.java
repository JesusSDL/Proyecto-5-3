public class Equipo {

	private String nombreEquipo;
	private int añosAntigüedad;
	private int victoriasSeguidas;
	private Esgrimista esgrima;

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String NombreEquipo) {
		this.nombreEquipo = NombreEquipo;
	}

	public int getAñosAntigüedad() {
		return añosAntigüedad;
	}

	public void setAñosAntigüedad(int AñosAntigüedad) {
		this.añosAntigüedad = AñosAntigüedad;
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

	public Equipo(String nombreEquipo, int añosAntigüedad, int victoriasSeguidas, Esgrimista esgrima) {
		this.nombreEquipo = nombreEquipo;
		this.añosAntigüedad = añosAntigüedad;
		this.victoriasSeguidas = victoriasSeguidas;
		this.esgrima = esgrima;

	}

	public boolean esEquipoFavorito() {
		return getEsgrima().esCandidatoOro();
	}

}
