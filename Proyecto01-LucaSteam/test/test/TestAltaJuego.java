package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

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

	@BeforeClass
	public static void inicioTest() {
		System.out.println("Inicio Test Unitarios Usuarios");
		}
	@Before
	public void cargaDatosPruebas() {
		servicesUsuario = new ServiciosUsuario();
		servicesUsuario.crearUsuariosPruebas();
		System.out.println("Listado antes de iniciar test");
		servicesUsuario.listarUsuarios();
	}
	@AfterClass
	public static void finTest() {
		System.out.println("Fin Test Unitarios Usuarios");
		}
	
	@After
	public void verResultadoPrueba() {
		System.out.println("Listado tras test");
		servicesUsuario.listarUsuarios();
		System.out.println("-----------------");
		System.out.println("-----------------");
	}
	
}
