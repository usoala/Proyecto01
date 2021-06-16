package service;

import java.util.LinkedHashMap;

import dao.CatalogoJuegos;
import dao.CatalogoJuegosImpl;
import exception.JuegoException;
import model.Juego;
import utilities.LeerFichero;

/**
 * @ClassName ServiciosJuego Implementación de la Interface ServiciosJuego
 *
 * @author María Castro, Patricia García, Usoa Larrarte, Jennifer Pérez y Sara
 *         Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class ServiciosJuegoImpl implements ServiciosJuego {

	private CatalogoJuegos catalogo = new CatalogoJuegosImpl();

	/**
	 * Método getter del atributo catalogo
	 *
	 * @return catalogo
	 */
	public CatalogoJuegos getCatalogo() {
		return catalogo;
	}

	/**
	 * Método setter del atributo catalogo
	 *
	 * @param catalogo to set catalogo
	 */
	public void setCatalogo(CatalogoJuegos catalogo) {
		this.catalogo = catalogo;
	}

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

	/**
	 * Implementación del método leerDatosFichero
	 * @return
	 */
	public LinkedHashMap<Integer, Juego> leerDatosFichero() {
		return LeerFichero.leerDatosFichero();
	}
	/**
	 * Implementación del método serializarCatalogoJuegosImpl
	 *
	 */
	public void serializarCatalogoJuegosImpl() {
		catalogo.serializarCatalogoJuegosImpl("CSVDatosSelecPorComas.csv");

	}

	/**
	 * Implementación del método deSerializarCatalogoJuegosImpl
	 *
	 */
	public void deSerializarCatalogoJuegosImpl() {
		catalogo.deSerializarCatalogoJuegosImpl("CSVDatosSelecPorComas.csv");

	}

}
