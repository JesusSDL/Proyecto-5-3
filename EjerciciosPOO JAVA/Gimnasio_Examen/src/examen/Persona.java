package examen;
public class Persona {
	
	
	private int dinero;
	private int estres;
	private String nombre;
	private static final int cuotaGym = 1400;

	public Persona (String nombre) {
	this.nombre = nombre;
	}


	public void abonaCuota ( int x ) {
	dinero -= cuotaGym;
	estres +=5;
	}
	
	public void dejeElChipa ( int x ){
	estres += 15;
	dinero += 500;
	}

	public boolean estaSacado(){
	return estres > 100;
	}

	public boolean debeCuotas(){
	return dinero < 0;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getEstres() {
		return estres;
	}

	public void setEstres(int estres) {
		this.estres = estres;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getCuotagym() {
		return cuotaGym;
	}

	public boolean esPacifista() {
	return getEstres() < 0;
	}

	


}