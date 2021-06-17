package test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

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
 * @ClassName TestListarJuegos
 *
 * @author Usoa Larrarte
 *
 * @date 17 jun. 2021
 * 
 * @version 1.0
 */
public class TestListarJuegos {

	static Logger logger = LogManager.getLogger(TestAltaJuego.class);

	static CatalogoJuegos catalogo;

	final PrintStream standardOut = System.out;
	final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeAll
	static void inicioTest() {
		logger.info("Inicio Test Unitarios ListarJuegos");
	}

	@BeforeEach
	void crearCatalogoServicios() {
		logger.info("Crear nuevo catalogo e iniciar StreamCaptor");
		catalogo = new CatalogoJuegosImpl();
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterAll
	static void finTest() {
		logger.info("Fin Test Unitarios ListarJuegos");
	}

	@Test
	void listarConRegistros() {
		logger.info("ejecutando listarConRegistros()");
		Juego juego = new Juego("Juego Prueba 1", 2019, "DEEP_SILVER", Genero.MISC, Plataforma.PS4, 0.01);
		Juego juego2 = new Juego("Juego Prueba 2", 2020, "505GAMES", Genero.PLATFORM, Plataforma._2600, 0.02);
		try {
			catalogo.altaJuego(1, juego);
			catalogo.altaJuego(2, juego2);
		} catch (JuegoException e1) {
			logger.error(e1.getMessage());
		}
		try {
			catalogo.listarJuegos();
		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		}
		assertTrue(outputStreamCaptor.toString().trim().contains("Juego Prueba 1")
				&& outputStreamCaptor.toString().trim().contains("Juego Prueba 2"));
	}

	@Test
	void listarConCatalogoVacio() {
		logger.info("ejecutando listarConCatalogoVacio()");
		assertThrows(JuegoException.class, () -> {
			catalogo.listarJuegos();
		});
	}

}
