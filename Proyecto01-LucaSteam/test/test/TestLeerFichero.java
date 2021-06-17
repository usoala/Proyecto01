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
	 * @Test                                               
	 */

public class TestLeerFichero {
	static Logger logger = LogManager.getLogger(TestLeerFichero.class);
     @Test  
    public void testArrayOk() {
    	logger.info("ejecutando testArrayOk()");
    	Juego altaJuegoValorEsperado = new Juego ("WiiSports", 2006, "Wii", Genero.ROLE_PLAYING, Plataforma._2600, 2.0);
		String [] prueba = new String [] {"1", "Wii Sports","2600", "2006", "Role-Playing", "Wii", "2.0"};
    	Juego altaJuego = LeerFichero.arrayToJuegos(prueba);
		assertEquals(altaJuego, altaJuegoValorEsperado);          
    }
}  

