package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
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

public class TestListarJuegosSigloXX {

	static Logger logger = LogManager.getLogger(TestAltaJuego.class);

	static CatalogoJuegos catalogo;
	static ServiciosJuego servicios;
	Juego juego = new Juego("Prueba", 2020, Editor.ACTIVISION, Genero.ADVENTURE, Plataforma.DS, 1.01);
	Juego juego1 = new Juego("Prueba1", 1990, Editor.ATARI, Genero.PUZZLE, Plataforma.GB, 2.10);

	@BeforeAll
	static void inicioTest() {
		logger.info("Inicio Test Unitarios Juegos Siglo XX");
	}

	@BeforeEach
	void crearCatalogoServicios() {
		logger.info("Crear nuevo catalogo y servicios");
		catalogo = new CatalogoJuegosImpl();
		servicios = new ServiciosJuegoImpl();
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

}
