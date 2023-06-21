import java.util.ArrayList;

public class Kit {
	private int graduacionAlcoholica;
	private int sustanciasExtra�as;

	public int getGraduacionAlcoholica() {
		return graduacionAlcoholica;
	}

	public void setGraduacionAlcoholica(int GraduacionAlcoholica) {
		this.graduacionAlcoholica = GraduacionAlcoholica;
	}

	public int getSustanciasExtra�as() {
		return sustanciasExtra�as;
	}

	public void setSustanciasExtra�as(int SustanciasExtra�as) {
		this.sustanciasExtra�as = SustanciasExtra�as;
	}

	public Kit(int graduacionAlcoholica, int sustanciasExtra�as) {
		this.graduacionAlcoholica = graduacionAlcoholica;
		this.sustanciasExtra�as = sustanciasExtra�as;
	}

	public boolean esKitProfesional() {
		return getSustanciasExtra�as() > 150 && getGraduacionAlcoholica() > 80;
	}
}
