public class General {

	public static void main(String[] args) {

		Local rubroesencial = new Local();
		Persona ciudadano = new Persona();
		rubroesencial.setRubros("farmacia");

		ciudadano.setDNI(12345678);
		ciudadano.puedoIrAComprarAUnLocalEnTalDia(2);
			
	
	}

}
