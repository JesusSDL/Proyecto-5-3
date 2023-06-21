import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LuchadorTest {

	@Test
	void entrenar() {
		Luchador LT = new Luchador();
		LT.setFuerzaLuchador(5);
		LT.entrenar(6);
		assertEquals(8, LT.getFuerzaLuchador());
	}

	@Test
	void mimir() {
		Luchador LT = new Luchador();
		LT.setEnergiaLuchador(5);
		LT.mimir();
		assertEquals(25, LT.getEnergiaLuchador());
	}

	@Test
	void esChuckNorrisVerdadero() {
		Luchador LT = new Luchador();
		LT.setFuerzaLuchador(15);
		LT.setEnergiaLuchador(16);
		LT.esChuckNorris();
		assertEquals(true, LT.esChuckNorris());
	}

	@Test
	void esChuckNorrisFalsoEnergiaInsuficiente() {
		Luchador LT = new Luchador();
		LT.setFuerzaLuchador(15);
		LT.setEnergiaLuchador(13);
		LT.esChuckNorris();
		assertEquals(false, LT.esChuckNorris());
	}

	@Test
	void esChuckNorrisFalsoFuerzaInsuficiente() {
		Luchador LT = new Luchador();
		LT.setFuerzaLuchador(10);
		LT.setEnergiaLuchador(16);
		LT.esChuckNorris();
		assertEquals(false, LT.esChuckNorris());
	}

	@Test
	void esChuckNorrisTodoFalso() {
		Luchador LT = new Luchador();
		LT.setFuerzaLuchador(10);
		LT.setEnergiaLuchador(13);
		LT.esChuckNorris();
		assertEquals(false, LT.esChuckNorris());
	}

	@Test
	void esInsectoVerdadero() {
		Luchador LT = new Luchador();
		LT.setFuerzaLuchador(300);
		assertEquals(true, LT.esInsecto());
	}

	@Test
	void esInsectoFalso() {
		Luchador LT = new Luchador();
		LT.setFuerzaLuchador(500);
		assertEquals(false, LT.esInsecto());
	}
}
