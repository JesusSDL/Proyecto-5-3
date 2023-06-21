
public class Asistente {

	private String nombre;
	private float sueldoHumilde;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre = Nombre;
	}

	public float getSueldoHumilde() {
		return sueldoHumilde;
	}

	public void setSueldoHumilde(float SueldoHumilde) {
		sueldoHumilde = SueldoHumilde;
	}

	public Asistente(String nombre, float sueldoHumilde) {
		super();
		this.nombre = nombre;
		this.sueldoHumilde = sueldoHumilde;
	}

	public float salario() {
		return getSueldoHumilde();
	}

	public boolean estaCotizado() {
		return getSueldoHumilde() > 60000;
	}

}
