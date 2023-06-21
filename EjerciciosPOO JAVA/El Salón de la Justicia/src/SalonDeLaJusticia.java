import java.util.ArrayList;

public class SalonDeLaJusticia {
	private ArrayList<SuperHeroe> SH = new ArrayList<>();

	public ArrayList<SuperHeroe> getSH() {
		return SH;
	}

	public void setSH(ArrayList<SuperHeroe> sH) {
		SH = sH;
	}

	public SalonDeLaJusticia(ArrayList<SuperHeroe> sH) {
		super();
		SH = sH;
	}
	public void agregar(SuperHeroe ps) {
		this.SH.add(ps);
	}

	public SuperHeroe cotizadoEnAsistentosos() {
		SuperHeroe tieneMasAsistentes = this.SH.get(0);
		for (SuperHeroe superHeroe : SH) {
			if (superHeroe.CantAsistentes() > tieneMasAsistentes.CantAsistentes()) {
				tieneMasAsistentes = superHeroe;
			}
		}
		return tieneMasAsistentes;
	}

	public ArrayList<SuperHeroe> losVictima2PorImpuestos() {
		ArrayList<SuperHeroe> superHeroes = new ArrayList<SuperHeroe>();
		for (SuperHeroe superHeroe : SH) {
			if (superHeroe.victimaDeLosImpuestos()) {
				superHeroes.add(superHeroe);
			}
		}
		return superHeroes;
	}
	
}
