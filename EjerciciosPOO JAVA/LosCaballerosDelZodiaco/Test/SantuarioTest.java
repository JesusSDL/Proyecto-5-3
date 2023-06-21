import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class SantuarioTest {

	@Test
	void posibleHades() {
		//nombreConstelacion, distanciaDelSol, estaEnBandaCeleste)
		Constelacion c = new Constelacion("Tauro", 1000000000, true);
		// Nombre, edadCuandoSeConvirtio, nivelMaldadEncubierta, Constelacion
		Caballero esPosibleHades = new Caballero("Pipo", 11, 1, c);
		Santuario s = new Santuario();
		s.agregar(esPosibleHades);
		assertEquals(esPosibleHades, s.posibleHades());
	}

	@Test
	void estaConstelacionCercanaAlSol() {
		//nombreConstelacion, distanciaDelSol, estaEnBandaCeleste)
		Constelacion c = new Constelacion("Tauro", 1000000000, true);
		// Nombre, edadCuandoSeConvirtio, nivelMaldadEncubierta, Constelacion
		Caballero estaEnConstelaconCercanaAlSol = new Caballero("Pipita",11,1,c);
		Santuario s = new Santuario();
		s.agregar(estaEnConstelaconCercanaAlSol);
		ArrayList<Caballero> resultadoEsperado = new ArrayList<Caballero>();
		resultadoEsperado.add(estaEnConstelaconCercanaAlSol);
		assertEquals(resultadoEsperado, s.constelacionCercanaAlSol());
	}
	
	@Test
	void porcentajeCaballerosPrecoces() {
		//nombreConstelacion, distanciaDelSol, estaEnBandaCeleste)
		Constelacion c = new Constelacion("Tauro", 1000000000, true);
		// Nombre, edadCuandoSeConvirtio, nivelMaldadEncubierta, Constelacion
		Caballero esCaballeroPrecoz = new Caballero("Jesús",7,70,c);
		Caballero esCaballeroPrecoz2 = new Caballero("Daniel",11,75,c);
		Caballero noEsCaballeroPrecoz = new Caballero("Cristo",50,80,c);
		Caballero noEsCaballeroPrecoz2 = new Caballero("Cristo",60,80, c);
		Santuario s = new Santuario();
		s.agregar(esCaballeroPrecoz);
		s.agregar(esCaballeroPrecoz2);
		s.agregar(noEsCaballeroPrecoz);
		s.agregar(noEsCaballeroPrecoz2);
		
		assertEquals(50, s.porcentajeCaballerosPrecoces());
	}
	@Test
	void caballeroMasPoderoso() {
		//nombreConstelacion, distanciaDelSol, estaEnBandaCeleste)
		Constelacion c = new Constelacion("Tauro", 1000000000, true);
		// Nombre, edadCuandoSeConvirtio, nivelMaldadEncubierta, Constelacion
		Caballero esCaballeroPoderoso = new Caballero("Jesús",7,70,c);
		Caballero esCaballeroPoderoso2= new Caballero("Daniel",11,75,c);
		
		Santuario s = new Santuario();
		s.agregar(esCaballeroPoderoso);
		s.agregar(esCaballeroPoderoso2);
		
		ArrayList<Caballero> resultadoEsperado = new ArrayList<Caballero>();
		resultadoEsperado.add(esCaballeroPoderoso);
		resultadoEsperado.add(esCaballeroPoderoso2);
		
		assertEquals(resultadoEsperado,s.caballerosMasPoderosos());
	}
}
