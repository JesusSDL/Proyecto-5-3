import java.util.ArrayList;

public class Grupo {

	private String nombreGrupo;
	ArrayList<Integrante> integrantes = new ArrayList<>();

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public ArrayList<Integrante> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<Integrante> integrantes) {
		this.integrantes = integrantes;
	}

	public void agregar(Integrante ps) {
		this.integrantes.add(ps);
	}

	public ArrayList<Integrante> losInimputables() {
		ArrayList<Integrante> aux = new ArrayList<Integrante>();
		for (Integrante integrante : integrantes) {
			if (integrante.esInimputable()) {
				aux.add(integrante);
			}
		}
		return aux;
	}
 public boolean haySerial(){
		for(hayUnSerial Integrante : integrantes){
		if(hayUnSerial.esSerial()){
			return true;
		}

		}
	return false;
	
	}
}
