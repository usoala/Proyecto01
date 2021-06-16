package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;

import dao.CatalogoJuegos;
import dao.CatalogoJuegosImpl;
import exception.JuegoException;
import model.Editor;
import model.Genero;
import model.Juego;
import model.Plataforma;
import service.ServiciosJuego;
import service.ServiciosJuegoImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName TestAltaJuego
 *
 * @author Usoa Larrarte
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */

class TestAltaJuego {

	static Logger logger = LogManager.getLogger(TestAltaJuego.class);

	static CatalogoJuegos catalogo;
	static ServiciosJuego servicios;
	Juego juego = new Juego("Prueba", LocalDate.now(), Editor._505GAMES, Genero.ACTION, Plataforma._2600, 0.01);

	@BeforeAll
	static void inicioTest() {
		logger.info("Inicio Test Unitarios AltaJuego");
	}

	@BeforeEach
	void crearCatalogoServicios() {
		logger.info("Crear nuevo catalogo y servicios");
		catalogo = new CatalogoJuegosImpl();
		servicios =  new ServiciosJuegoImpl();
	}

	@AfterAll
	static void finTest() {
		logger.info("Fin Test Unitarios AltaJuego");
	}

	@Test
	void altaCapaDatos() {
		logger.info("ejecutando altaCapaDatos()");
		Integer id = 1;
		try {
			catalogo.altaJuego(id, juego);
		} catch (JuegoException e) {
			logger.error(e.getMessage());
		}
		assertEquals(juego, ((CatalogoJuegosImpl) catalogo).getCatalogo().get(id));
	}
	
	@Test
	void altaCapaServicios() {
		logger.info("ejecutando altaCapaServicios()");
		Integer id = 1;
		try {
			servicios.altaJuego(juego);
		} catch (JuegoException e) {
			logger.error(e.getMessage());
		}
		catalogo = ((ServiciosJuegoImpl) servicios).getCatalogo();
		assertEquals(juego, ((CatalogoJuegosImpl) catalogo).getCatalogo().get(id) );
	}
	
	@Test
	void testSiguienteId() {
		logger.info("ejecutando testSiguienteId()");
		Integer idEsperado = 1;
		Integer siguienteId = catalogo.siguienteId();
		assertEquals(idEsperado, siguienteId);	
	}

}
