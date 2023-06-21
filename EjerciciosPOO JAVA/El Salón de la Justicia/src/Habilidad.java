
public class Habilidad extends Asistente {

	public Habilidad(String nombre, float sueldoHumilde) {
		super(nombre, sueldoHumilde);

	}
	
	public float salario() {
		return getSueldoHumilde() * 1.2f;
	}
}
