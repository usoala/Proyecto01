package test;

import static org.junit.Assert.assertThrows;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import dao.CatalogoJuegos;
import dao.CatalogoJuegosImpl;
import exception.JuegoException;
import model.Genero;
import model.Juego;
import model.Plataforma;

/**
 * @ClassName TestLeerFichero
 *
 * @author Sara Silvo
 *
 * @date 17 jun. 2021
 *
 * @version 1.0
 */

class TestAnnosPares {

	static Logger logger = LogManager.getLogger(TestAnnosPares.class);

	static CatalogoJuegos catalogo;

	Juego juego = new Juego("Juego prueba publicado año par", 2020, "Wii", Genero.ADVENTURE, Plataforma.PSP, 1.05);

	final PrintStream standarOut = System.out;
	final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeAll
	static void inicioTest() {
		logger.info("Inicio Test Unitarios Listar Juegos publicados en años pares");
	}

	@BeforeEach
	void crearCatalogoServicios() {
		logger.info("Crear nuevo catalogo y servicios. Iniciar StreamCaptor");
		catalogo = new CatalogoJuegosImpl();
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterAll
	static void finalTest() {
		logger.info("Fin Test Unitarios Listar Juegos publicados en años pares");
	}

	@Test
	void listarJuegosAnosPares() {
		logger.info("ejecutando listarJuegosAnnosPares()");
		try {
			juego.setFecha(2020);
			catalogo.altaJuego(1, juego);
		} catch (JuegoException e1) {
			logger.error(e1.getMessage());
		}
		assertThrows(JuegoException.class, () -> {
			catalogo.listarJuegosAnnosPares();
		});
	}

	@Test
	void listarConCatalogoVacio() {
		logger.info("ejecutando listarCatalogoVacio()");
		assertThrows(JuegoException.class, () -> {
			catalogo.listarJuegosAnnosPares();
		});
	}

}
