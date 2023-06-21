public class Local {

	private String rubros;

	public String getRubros() {
		return rubros;
	}

	public void setRubros(String Rubros) {
		this.rubros = Rubros;
	}

	public boolean esLocalEsencial() {
		return getRubros() == "farmacia" || getRubros() == "alimentacion";
	}
}
