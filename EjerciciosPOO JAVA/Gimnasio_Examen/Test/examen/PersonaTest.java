package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class PersonaTest {

	@Test
	void estaSacadoVerdadero() {
		Persona p = new Persona("Rigoberto");
		p.setEstres(120);
		p.abonaCuota(0);
		p.dejeElChipa(0);
		assertEquals(true, p.estaSacado());
	}

	@Test
	void estaSacadoFalso() {
		Persona p = new Persona("Pedro");
		p.setEstres(1);
		p.abonaCuota(0);
		p.dejeElChipa(0);
		assertEquals(false, p.estaSacado());
	}

	@Test
	void debeCuotasVerdadero() {
		Persona p = new Persona("Juanita");
		p.setDinero(-500);
		p.abonaCuota(0);
		p.dejeElChipa(0);
		assertEquals(true, p.debeCuotas());
	}

	@Test
	void debeCuotasFalso() {
		Persona p = new Persona("Alberta");
		p.setDinero(1400);
		assertEquals(false, p.debeCuotas());
	}
}
