public class Constelacion {

	private String nombreConstelacion;
	private int distanciaDelSol;
	private boolean estaEnBandaCeleste;

	public int getDistanciaDelSol() {
		return distanciaDelSol;
	}

	public void setDistanciaDelSol(int DistanciaDelSol) {
		this.distanciaDelSol = DistanciaDelSol;
	}

	public boolean isestaEnBandaCeleste() {
		return estaEnBandaCeleste;
	}

	public void setestaEnBandaCeleste(boolean estaEnBandaCeleste) {
		this.estaEnBandaCeleste = estaEnBandaCeleste;
	}

	public String getNombreConstelacion() {
		return nombreConstelacion;
	}

	public void setNombreConstelacion(String NombreConstelacion) {
		this.nombreConstelacion = NombreConstelacion;
	}

	public Constelacion(String nombreConstelacion, int distanciaDelSol, boolean estaEnBandaCeleste) {
		this.nombreConstelacion = nombreConstelacion;
		this.distanciaDelSol = distanciaDelSol;
		this.estaEnBandaCeleste = estaEnBandaCeleste;
	}



	public boolean estaCercanaAlSol() {
		return getDistanciaDelSol() > 1000000000;

	}

}