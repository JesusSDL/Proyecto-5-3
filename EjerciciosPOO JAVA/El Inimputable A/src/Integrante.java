public class Integrante {
	private String nombre;
	private int actosDeInimputabilidad;
	private Kit kits;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre = Nombre;
	}	

	public int getActosDeInimputabilidad() {
		return actosDeInimputabilidad;
	}

	public void setActosDeInimputabilidad(int ActosDeInimputabilidad) {
		this.actosDeInimputabilidad = ActosDeInimputabilidad;
	}

	public Kit getKits() {
		return kits;
	}

	public void setKits(Kit Kits) {
		this.kits = Kits;
	}

	public Integrante(String nombre, int actosDeInimputabilidad, Kit kits) {
		this.nombre = nombre;
		this.actosDeInimputabilidad = actosDeInimputabilidad;
		this.kits = kits;
	}

	public boolean esInimputable() {
		return kits.esKitProfesional();
	}

	public boolean esSerial() {
		return esInimputable() && getActosDeInimputabilidad() > 5;
	}
}
