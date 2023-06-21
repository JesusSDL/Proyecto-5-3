public class Esgrimista {

	private String nombre;
	private int nivelCompetitividad;
	private int edad;
	private int talentoOculto;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre = Nombre;
	}

	public int getNivelCompetitividad() {
		return nivelCompetitividad;
	}

	public void setNivelCompetitividad(int NivelCompetitividad) {
		this.nivelCompetitividad = NivelCompetitividad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int Edad) {
		this.edad = Edad;
	}

	public int getTalentoOculto() {
		return talentoOculto;
	}

	public void setTalentoOculto(int TalentoOculto) {
		this.talentoOculto = TalentoOculto;
	}

	public Esgrimista(String nombre, int nivelCompetitividad, int edad, int talentoOculto) {
		this.nombre = nombre;
		this.nivelCompetitividad = nivelCompetitividad;
		this.edad = edad;
		this.talentoOculto = talentoOculto;
	}

	public boolean esCandidatoOro() {
		return getNivelCompetitividad() > 95 && getTalentoOculto() > 80;
	}

}