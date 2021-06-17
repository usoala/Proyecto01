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
 * @ClassName TestListarJuegosGeneroPlataforma
 *
 * @author Usoa Larrarte
 *
 * @date 16 jun. 2021
 * 
 * @version 1.0
 */
public class TestListarJuegosGeneroPlataforma {

	static Logger logger = LogManager.getLogger(TestListarJuegosGeneroPlataforma.class);

	static CatalogoJuegos catalogo;
	Juego juego = new Juego("Juego Genero Plataform", 2020, "505GAMES", Genero.PLATFORM, Plataforma._2600, 0.01);

	final PrintStream standardOut = System.out;
	final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeAll
	static void inicioTest() {
		logger.info("Inicio Test Unitarios ListarJuegosGeneroPlataforma");
	}

	@BeforeEach
	void crearCatalogoServicios() {
		logger.info("Crear nuevo catalogo e iniciar StreamCaptor");
		catalogo = new CatalogoJuegosImpl();
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterAll
	static void finTest() {
		logger.info("Fin Test Unitarios ListarJuegosGeneroPlataforma");
	}

	@Test
	void listarConJuegoGeneroPlataforma() {
		logger.info("ejecutando listarConJuegoGeneroPlataforma()");
		try {
			catalogo.altaJuego(1, juego);
		} catch (JuegoException e1) {
			logger.error(e1.getMessage());
		}
		try {
			catalogo.listarJuegosGeneroPlataforma();
		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		}
		assertTrue(outputStreamCaptor.toString().trim().contains("Juego Genero Plataform"));
	}

	@Test
	void listarConJuegoNoGeneroPlataforma() {
		logger.info("ejecutando listarConJuegoNoGeneroPlataforma()");
		try {
			juego.setGenero(Genero.ACTION);
			catalogo.altaJuego(1, juego);

		} catch (JuegoException e1) {
			logger.error(e1.getMessage());
		}
		assertThrows(JuegoException.class, () -> {
			catalogo.listarJuegosGeneroPlataforma();
		});
	}

	@Test
	void listarConCatalogoVacio() {
		logger.info("ejecutando listarConCatalogoVacio()");
		assertThrows(JuegoException.class, () -> {
			catalogo.listarJuegosGeneroPlataforma();
		});
	}
}
