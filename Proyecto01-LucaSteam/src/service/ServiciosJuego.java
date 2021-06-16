package service;
import exception.JuegoException;
import model.Juego;

/**
 * @ClassName ServiciosJuego
 *
 * @author María Castro, Patricia García, Usoa Larrarte,
 * Jennifer Pérez y Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public interface ServiciosJuego {
	
	public boolean altaJuego() throws JuegoException;
	public boolean altaJuego(Juego juego) throws JuegoException;
	public void listarJuegos() throws JuegoException ;
	public void listarJuegosSigloXX() throws JuegoException;

}
