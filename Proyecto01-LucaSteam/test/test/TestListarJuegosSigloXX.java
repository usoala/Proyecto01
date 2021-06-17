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
 * @ClassName TestListarJuegosSigloXX
 *
 * @author Patricia García
 *
 * @date 17 jun. 2021
 * 
 * @version 1.0
 */
public class TestListarJuegosSigloXX {

	static Logger logger = LogManager.getLogger(TestAltaJuego.class);

	static CatalogoJuegos catalogo;
	Juego juego = new Juego("Juego Siglo XX", 1995, "ACTIVISION", Genero.ADVENTURE, Plataforma.GB, 1.05);

	final PrintStream standarOut = System.out;
	final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeAll
	static void inicioTest() {
		logger.info("Inicio Test Unitarios Listar Juegos del Siglo XX");
	}

	@BeforeEach
	void crearCatalogoServicios() {
		logger.info("Crear nuevo catalogo y servicios. Iniciar StreamCaptor");
		catalogo = new CatalogoJuegosImpl();
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterAll
	static void finTest() {
		logger.info("Fin Test Unitarios Listar Juegos del Siglo XX");
	}

	@Test
	void listarJuegoSigloXX() {
		logger.info("Ejecutando listarJuegosSigloXX()");
		try {
			catalogo.altaJuego(1, juego);
		} catch (JuegoException e1) {
			logger.error(e1.getMessage());
		}
		try {
			catalogo.listarJuegosSigloXX();
		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		}
		assertTrue(outputStreamCaptor.toString().trim().contains("Juego Siglo XX"));
	}

	@Test
	void listarJuegoNoSigloXX() {
		logger.info("ejecutando listarJuegoNoSigloXX()");
		try {
			juego.setFecha(2020);
			catalogo.altaJuego(1, juego);
		} catch (JuegoException e1) {
			logger.error(e1.getMessage());
		}
		assertThrows(JuegoException.class, () -> {
			catalogo.listarJuegosSigloXX();
		});
	}

	@Test
	void listarConCatalogoVacio() {
		logger.info("ejecutando listarCatalogoVacio()");
		assertThrows(JuegoException.class, () -> {
			catalogo.listarJuegosSigloXX();
		});
	}

}
