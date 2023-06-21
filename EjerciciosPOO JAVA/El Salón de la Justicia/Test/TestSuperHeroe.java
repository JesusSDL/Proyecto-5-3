import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSuperHeroe {

	@Test
	void salarioSoloAsistentes() {
		Asistente AsistenteNormal = new Asistente("Alfred", 40000);
		Asistente AsistenteNormal2 = new Asistente("Robin", 40000);
		SuperHeroe SH = new SuperHeroe();
		SH.agregar(AsistenteNormal);
		SH.agregar(AsistenteNormal2);
		assertEquals(80000, SH.losSueldosAsistentosos());
	}
	@Test
	void salarioSoloAsistentesHabilidosos() {
		Asistente AsistenteEspecial = new Habilidad("Maradona", 100000);
		Asistente AsistenteEspecial2 = new Habilidad("Agustín", 10000);
		SuperHeroe SH = new SuperHeroe();
		SH.agregar(AsistenteEspecial);
		SH.agregar(AsistenteEspecial2);
		assertEquals(132000, SH.losSueldosAsistentosos());
	}
	@Test
	void salariosAsistentososMixtos() {
		Asistente AsistenteNormal = new Asistente("Alfred",40000);
		Asistente AsistenteEspecial = new Habilidad("Maradona",100000);
		SuperHeroe SH = new SuperHeroe();
		SH.agregar(AsistenteNormal);
		SH.agregar(AsistenteEspecial);
		assertEquals(160000, SH.losSueldosAsistentosos());
	}
}
