package service;

import dao.CatalogoJuegos;
import dao.CatalogoJuegosImpl;
import exception.JuegoException;
import model.Juego;

/**
 * @ClassName ServiciosJuego
 * Implementación de la Interface ServiciosJuego
 *
 * @author María Castro, Patricia García, Usoa Larrarte,
 * Jennifer Pérez y Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class ServiciosJuegoImpl implements ServiciosJuego {
	
	private CatalogoJuegos catalogo = new CatalogoJuegosImpl();
	

	/**
	 * Implementación del método altaJuego
	 *
	 * @return 
	 * @throws JuegoException
	 */
	public boolean altaJuego() throws JuegoException {
		Juego juego = new Juego();
		juego.crearJuego();
		return this.altaJuego(juego);
	}
	
	/**
	 * Sobrescritura del método altaJuego
	 *
	 * @param juego
	 * @return 
	 * @throws JuegoException
	 */
	public boolean altaJuego(Juego juego) throws JuegoException {
		return catalogo.altaJuego(catalogo.siguienteId(), juego);
	}
	
	/**
	 * Implementación del método listarJuegos
	 *
	 */
	public void listarJuegos() {
		catalogo.listarJuegos();
	}

}
