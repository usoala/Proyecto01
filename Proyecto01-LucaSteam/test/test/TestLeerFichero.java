package test;

import utilities.LeerFichero;
import model.Juego;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import model.Plataforma;
import model.Genero;

/**
 * @ClassName TestLeerFichero
 *
 * @author Jennifer Pérez
 *
 * @date 16 jun. 2021
 * 
 * @version 1.0
 * 
 * 
 */

public class TestLeerFichero {
	static Logger logger = LogManager.getLogger(TestLeerFichero.class);

	/**
	 * Prueba unitaria testArrayOk para el método arrayToJuegos. Compruebo que el
	 * objeto creado es igual al objeto esperado.
	 *
	 */

	@Test
	public void testArrayOk() {
		logger.info("ejecutando testArrayOk()");
		Juego altaJuegoValorEsperado = new Juego("Wii Sports", 1998, "Wii", Genero.ACTION, Plataforma.PS4, 0.0);
		String[] prueba = new String[] { "1", "Wii Sports", "PS4", "1998", "Action", "Wii", "0.0" };
		Juego altaJuego = LeerFichero.arrayToJuegos(prueba);
		assertEquals(altaJuego, altaJuegoValorEsperado);
	}
}
