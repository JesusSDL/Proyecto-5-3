import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaballeroTest {

	@Test
	void esPrecozVerdadero() {
		Caballero c = new Caballero();
		c.setEdadCuandoSeConvirtio(11);
		assertEquals(true, c.esPrecoz());
	}

	@Test
	void esPrecozFalso() {
		Caballero c = new Caballero();
		c.setEdadCuandoSeConvirtio(13);
		assertEquals(false, c.esPrecoz());
	}

	@Test
	void esDeOroVerdadero() {
		Constelacion cs = new Constelacion("Tauro", 1000000000, true);
		Caballero c = new Caballero("Jesis",7,10,cs);
		assertEquals(true, c.esDeOro());
	}
	@Test
	void esDeOroFalso() {
		Constelacion cs = new Constelacion("Tauro", 1000000000, false);
		Caballero c = new Caballero("Jesis",7,10,cs);
		assertEquals(false, c.esDeOro());
	}
	@Test
	void esPoderosoVerdadero() {
		Constelacion cs = new Constelacion("Tauro", 1000000000, true);
		Caballero c = new Caballero("Jesis",7,10,cs);
		assertEquals(true, c.esDeOro());
	}
	@Test
	void esPoderosoFalso() {
		Constelacion cs = new Constelacion("Tauro", 1000000000, false);
		Caballero c = new Caballero("Jesis",7,10,cs);
		assertEquals(false, c.esDeOro());
	}
}
