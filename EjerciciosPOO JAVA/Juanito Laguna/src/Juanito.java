public class Juanito {
 //Hecho x el Panflin más panflin pai
	private int estomago;
	private int alimento;
	final static int maxEstomago = 50;

	public int getEstomago() {
		return estomago;
	}

	public void setEstomago(int Estomago) {
		this.estomago = Estomago;
	}

	public int getAlimento() {
		return alimento;
	}

	public void setAlimento(int Alimento) {
		this.alimento = Alimento;
	}

	public Juanito(int estomago, int alimento) {
		this.estomago = estomago;
		this.alimento = alimento;
	}

	public boolean panzaLlenaCorazonContento() {
		return getAlimento() > (estomago - 10);
	}

	public void crecer(int x) {
		setEstomago(getEstomago() + x);
	}

	public void digerir() {
		setAlimento(0);
	}

	public boolean aprender() {
		return panzaLlenaCorazonContento();
	}
}