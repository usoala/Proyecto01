package dao;

import exception.JuegoException;
import model.Juego;

/**
 * @ClassName CatalogoJuegos
 *
 * @author María Castro, Patricia García, Usoa Larrarte, Jennifer Pérez y Sara
 *         Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public interface CatalogoJuegos {

	public boolean altaJuego(Integer id, Juego juego) throws JuegoException;

	public void listarJuegos() throws JuegoException;

	public Integer siguienteId();

	public void serializarCatalogoJuegosImpl(String fichero);

	public void deSerializarCatalogoJuegosImpl(String fichero);

	public void listarJuegosSigloXX() throws JuegoException;

	public void listarJuegosGeneroPlataforma() throws JuegoException;

	public void leerDatosFichero();

	public void listarJuegosConsolasNintendo() throws JuegoException;

	public void listarJuegosAnnosPares() throws JuegoException;

	public void listarEditores() throws JuegoException;

}
