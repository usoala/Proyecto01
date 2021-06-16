package test;
import utilities.LeerFichero;
import model.Editor;
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
	 * @Test                                               
	 */

public class TestLeerFichero {
	static Logger logger = LogManager.getLogger(TestLeerFichero.class);
     @Test  
    public void testArrayOk() {
    	logger.info("ejecutando testSArrayOk()");
    	String [] JuegoString = {"Wii Sports", 2006, Editor.NINTENDO, Genero.SPORT, Plataforma.WII, 29.02};
		Juego altaJuegoValorEsperado = new Juego ();
		Juego altaJuego = LeerFichero.arrayToJuegos(JuegoString);
		assertEquals(altaJuego, altaJuegoValorEsperado);          
    }
}  

