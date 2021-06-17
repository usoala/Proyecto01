package test;

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
 * @ClassName TestListarEditores
 *
 * @author María Castro, Patricia García, Usoa Larrarte,
 * Jennifer Pérez y Sara Silvo
 *
 * @date 17 jun. 2021
 * 
 * @version 1.0
 */
public class TestListarEditores {
	
	static Logger logger = LogManager.getLogger(TestListarEditores.class);

	static CatalogoJuegos catalogo;
	Juego juego = new Juego("Juego Editores", 1995, "ACTIVISION", Genero.ADVENTURE, Plataforma.GB, 1.05);

	final PrintStream standarOut = System.out;
	final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@BeforeAll
	static void inicioTest() {
		logger.info("Inicio Test Unitarios Listar Editores");
	}

	@BeforeEach
	void crearCatalogoServicios() {
		logger.info("Crear nuevo catalogo e iniciar StreamCaptor");
		catalogo = new CatalogoJuegosImpl();
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterAll
	static void finTest() {
		logger.info("Fin Test Unitarios Listar Editores");
	}
	
	@Test
	void listarEditores() {
		logger.info("ejecutando listarEditores()");
		try {
			catalogo.altaJuego(1, juego);
		} catch (JuegoException e1) {
			logger.error(e1.getMessage());
		}
		try {
			catalogo.listarEditores();
		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		}
		assertTrue(outputStreamCaptor.toString().trim().contains("Editores"));
	}
}
