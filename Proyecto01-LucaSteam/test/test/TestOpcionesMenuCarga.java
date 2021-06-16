package test;

import static org.junit.Assert.assertFalse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import control.LucaSteam;


public class TestOpcionesMenuCarga {
	
	static Logger logger = LogManager.getLogger(TestOpcionesMenuCarga.class);

	static LucaSteam lucaSteam;
	
	@BeforeAll
	static void inicioTest() {
		logger.info("Inicio Test Unitarios OpcionesMenuCarga");
	}

	@BeforeEach
	void crearCatalogoServicios() {
		logger.info("Crear nuevo LucaSteam");
		lucaSteam = new LucaSteam();
	}

	@AfterAll
	static void finTest() {
		logger.info("Fin Test Unitarios OpcionesMenuCarga");
	}
	
	@Test
	void testOpcionCargaCatalogo() {
		logger.info("ejecutando testOpcionCargaCatalogo()");
		Integer opcion = 1;
		boolean booleanDevuelto = lucaSteam.opcionesMenuCarga(opcion);
		assertFalse(booleanDevuelto);
	}
}
