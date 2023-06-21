

public class AliciaPaisMaravillas {

	public static void main(String[] args) {

		Personaje Alicia = new Personaje(600, 60, -10);
		Personaje Scaloni = new Personaje(512, 1, -34);
		Libro L1 = new Libro();
		L1.agregar(Alicia);
		L1.agregar(Scaloni);
		/*ArrayList<Personaje> al = new ArrayList<Personaje>();
		al.add(Alicia);
		al.add(Scaloni);
		L1.setAl(al);*/
		
		
		
	/*	if (Alicia.enMaravilla()) {
			System.out.println("Personaje en Maravilla.");
		} else {
			System.out.println("Personaje en mundo.");
		}

		if (Alicia.personalinda()) {
			System.out.println("\nPersonaje Lindo.");
		}*/

		Alicia.embellecer(0);
		Scaloni.embellecer(0);
		/*if (Alicia.personanormal()) {
			System.out.println("\nPersonaje Normal.");
		}*/
		
		System.out.println(L1.cantidadPersonajesFacheros());
		System.out.println(L1.cantidadEnMaravilla());
		System.out.println(L1.hayPersonajeNormal());
	}
}