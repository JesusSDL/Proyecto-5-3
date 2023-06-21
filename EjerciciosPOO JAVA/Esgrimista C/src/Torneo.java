import java.util.ArrayList;

public class Torneo {
	private ArrayList<Equipo> losEquipos = new ArrayList<>();

	public ArrayList<Equipo> getLosEquipos() {
		return losEquipos;
	}

	public void setLosEquipos(ArrayList<Equipo> losEquipos) {
		this.losEquipos = losEquipos;
	}

	public Torneo(ArrayList<Equipo> losEquipos) {
		this.losEquipos = losEquipos;
	}

	public Equipo elEquipoConMasXP() {
		Equipo elEquipoMasExperimentado = this.losEquipos.get(0);
		for (Equipo equipo : losEquipos) {
			if (equipo.getAñosAntigüedad() > elEquipoMasExperimentado.getAñosAntigüedad()) {
				elEquipoMasExperimentado = equipo;
			}
		}
		return elEquipoMasExperimentado;
	}

	public ArrayList<Equipo> losEquiposFavs() {
		ArrayList<Equipo> losEquiposFavs = new ArrayList<Equipo>();
		for (Equipo equipo : losEquipos) {
			if (equipo.esEquipoFavorito()) {
				losEquiposFavs.add(equipo);
			}
		}
		return losEquiposFavs;
	}

	public Equipo elPocoCompetitivo() {
		Equipo elPeorEsgrimista = this.losEquipos.get(0);
		for (Equipo equipo : losEquipos) {
			if (equipo.getEsgrima().getNivelCompetitividad() < elPeorEsgrimista.getEsgrima().getNivelCompetitividad()) {
				elPeorEsgrimista = equipo;
			}
		}
		return elPeorEsgrimista;
	}

}
