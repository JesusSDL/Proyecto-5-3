package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class GimnasioTest {

	@Test
	void estanALasPatadas2() {
		Persona aLasPatadasJuan = new Persona("Juan");
		aLasPatadasJuan.setDinero(-800);
		aLasPatadasJuan.setEstres(230);
		Persona aLasPatadasMalena = new Persona("Malena");
		aLasPatadasMalena.setDinero(-900);
		aLasPatadasMalena.setEstres(210);
		Gimnasio G = new Gimnasio();
		G.inscribir(aLasPatadasJuan);
		G.inscribir(aLasPatadasMalena);

		ArrayList<Persona> resultadoEsperado = new ArrayList<>();
		resultadoEsperado.add(aLasPatadasJuan);
		resultadoEsperado.add(aLasPatadasMalena);

		assertEquals(resultadoEsperado, G.aLasPatadas());
	}

	@Test
	void noEstaALasPatadas() {
		Persona noEstaALasPatadas = new Persona("Pepe");
		noEstaALasPatadas.setDinero(1800);
		noEstaALasPatadas.setEstres(1);
		Gimnasio gym = new Gimnasio();
		gym.inscribir(noEstaALasPatadas);
		ArrayList<Persona> resultadoEsperadoNoEstaALasPatadas = new ArrayList<>();

		assertEquals(resultadoEsperadoNoEstaALasPatadas, gym.aLasPatadas());
	}

	@Test
	void estaALasPatadas() {
		Persona estaAlasPatadas = new Persona("Matias");
		estaAlasPatadas.setDinero(-900);
		estaAlasPatadas.setEstres(140);
		Gimnasio gym = new Gimnasio();
		gym.inscribir(estaAlasPatadas);
		ArrayList<Persona> resultadoEsperadoEstaALasPatadas = new ArrayList<>();
		resultadoEsperadoEstaALasPatadas.add(estaAlasPatadas);
		assertEquals(resultadoEsperadoEstaALasPatadas, gym.aLasPatadas());

	}
}
