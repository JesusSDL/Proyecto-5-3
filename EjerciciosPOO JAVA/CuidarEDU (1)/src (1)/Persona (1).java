public class Persona {
	Local Prubroesencial = new Local();
	private int temperatura;
	private int salidas;
	private int DNI;

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int Temperatura) {
		this.temperatura = Temperatura;
	}

	public int getSalidas() {
		return salidas;
	}

	public void setSalidas(int Salidas) {
		this.salidas = Salidas;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int Dni) {
		DNI = Dni;
	}

	public boolean meAislo() {
		return getTemperatura() > 37;
	}
	public boolean puedoIrAComprarAUnLocalEnTalDia(int dia) {
		
		if (meAislo() == false && Prubroesencial.esLocalEsencial()) {
			return true;
		} else if (meAislo() == false && getDNI() %2==0
				|| meAislo() == false && getDNI() %2 !=0 && dia %2 !=0) {

			return true;
		} else {
			return false;
		}
	}
	/*public boolean puedoIrAComprarAUnLocalEnTalDia(int dia) {
		if (meAislo() == false && Prubroesencial.esLocalEsencial()) {
			return true;
		} else if (meAislo() == false && DNIpar() == diaPar(dia)
				|| meAislo() == false && DNIpar() == false && diaPar(dia) == false) {

			return true;
		} else {
			return false;
		}
	}

	public boolean DNIpar() {
		if (getDNI() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean diaPar(int dia) {
		if (dia % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}*/

	public void salir() {
		setSalidas(getSalidas() + 1);
	}

	public boolean EstoyBuscandoElVirus() {
		return getSalidas() > 10;
	}
}
