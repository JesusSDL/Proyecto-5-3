public class Caballero {
	private String nombre;
	private int edadCuandoSeConvirtio;
	private int nivelMaldadEncubierta;
	private Constelacion c;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre = Nombre;
	}

	public int getEdadCuandoSeConvirtio() {
		return edadCuandoSeConvirtio;
	}

	public void setEdadCuandoSeConvirtio(int EdadCuandoSeConvirtio) {
		this.edadCuandoSeConvirtio = EdadCuandoSeConvirtio;
	}

	public int getNivelMaldadEncubierta() {
		return nivelMaldadEncubierta;
	}

	public void setNivelMaldadEncubierta(int NivelMaldadEncubierta) {
		this.nivelMaldadEncubierta = NivelMaldadEncubierta;
	}

	public int getDistanciaDelSol() {
		return c.getDistanciaDelSol();
	}

	public void setDistanciaDelSol(int DistanciaDelSol) {
		c.setDistanciaDelSol(DistanciaDelSol);
	}

	public Constelacion getC() {
		return c;
	}

	public void setC(Constelacion c) {
		this.c = c;
	}

	public Caballero(String nombre, int edadCuandoSeConvirtio, int nivelMaldadEncubierta, Constelacion c) {
		this.nombre = nombre;
		this.edadCuandoSeConvirtio = edadCuandoSeConvirtio;
		this.nivelMaldadEncubierta = nivelMaldadEncubierta;
		this.c = c;
	}

	public Caballero() {

	}

	public boolean esPrecoz() {
		return getEdadCuandoSeConvirtio() < 12;
	}

	public boolean esDeOro() {
		return c.isestaEnBandaCeleste();

	}

	public boolean esPoderoso() {
		return esPrecoz() && esDeOro();
	}
}