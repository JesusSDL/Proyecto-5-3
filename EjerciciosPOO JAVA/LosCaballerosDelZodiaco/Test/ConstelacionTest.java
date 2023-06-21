import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstelacionTest {

	@Test
	void estaCercanaAlSol() {
		Constelacion c = new Constelacion("Sagitario", 1000000001, true);
		assertEquals(true, c.estaCercanaAlSol());
	}

	@Test
	void estaCercanaAlSolFalso() {
		Constelacion c = new Constelacion("Cancaer",1000, false);
		assertEquals(false, c.estaCercanaAlSol());
	}
}
