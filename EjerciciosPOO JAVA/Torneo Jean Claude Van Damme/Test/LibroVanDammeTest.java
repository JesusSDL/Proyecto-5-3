import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class LibroVanDammeTest {

	@Test
	void losChuckNorris() {
		// nombre, hace jiujitsu energia, fuerza
		Luchador ChuckNorris = new Luchador("Scaloni", false, 16, 50);
		Luchador NoChuckNorris = new Luchador("Pachorra", false, 16, 50);

		LibroJeanVanDamme LJVD = new LibroJeanVanDamme();
		LJVD.agregar(NoChuckNorris);
		LJVD.agregar(ChuckNorris);

		ArrayList<Luchador> resultadoEsperao = new ArrayList<>();
		resultadoEsperao.add(NoChuckNorris);
		resultadoEsperao.add(ChuckNorris);
		assertEquals(resultadoEsperao, LJVD.losChuckNorris());
	}

	@Test
	void hayUnJiuJitsuPorLoMenos() {
		Luchador JiuJitsu = new Luchador("Pedro", true, 10, 10);
		Luchador NoJiuJitsu = new Luchador("Molinoide", false, 10, 10);
		LibroJeanVanDamme LJVD = new LibroJeanVanDamme();
		LJVD.agregar(NoJiuJitsu);
		LJVD.agregar(JiuJitsu);

		ArrayList<Luchador> resultadoEsperao = new ArrayList<>();
		resultadoEsperao.add(NoJiuJitsu);
		resultadoEsperao.add(JiuJitsu);
		assertEquals(true, LJVD.hayJiuJitsu());
	}

	@Test
	void noHayJiuJitsu() {
		Luchador JiuJitsu = new Luchador("Pedro", false, 10, 10);
		Luchador NoJiuJitsu = new Luchador("Molinoide", false, 10, 10);
		LibroJeanVanDamme LJVD = new LibroJeanVanDamme();
		LJVD.agregar(NoJiuJitsu);
		LJVD.agregar(JiuJitsu);

		ArrayList<Luchador> resultadoEsperao = new ArrayList<>();
		resultadoEsperao.add(NoJiuJitsu);
		resultadoEsperao.add(JiuJitsu);
		assertEquals(false, LJVD.hayJiuJitsu());
	}

	@Test
	void cantidadDeJiuJitsuQueHay() {
		Luchador JiuJitsu = new Luchador("Juan", true, 13, 13);
		Luchador JiuJitsu2 = new Luchador("Mama Cora", true, 12, 12);
		LibroJeanVanDamme LJVD = new LibroJeanVanDamme();
		LJVD.agregar(JiuJitsu);
		LJVD.agregar(JiuJitsu2);
		ArrayList<Luchador> resultadoEsperao = new ArrayList<>();
		resultadoEsperao.add(JiuJitsu);
		resultadoEsperao.add(JiuJitsu2);
		// Aclaración: como resultadoEsperao es un arraylist y el método retorna
		// entero. Por eso devolvemos en el assert al tamaño del arraylist
		// resultadoEsperao. Caso contrario deberíamos transformar el método int a
		// un arraylist, y no conviene por obvias razones.
		assertEquals(resultadoEsperao.size(), LJVD.cantidadDeJiuJitsus());
	}
}