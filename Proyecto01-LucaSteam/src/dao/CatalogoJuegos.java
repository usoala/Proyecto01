package dao;

import exception.JuegoException;
import model.Juego;

/**
 * @ClassName CatalogoJuegos
 *
 * @author María Castro, Patricia García, Usoa Larrarte,
 * Jennifer Pérez y Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public interface CatalogoJuegos {
	
	public boolean altaJuego(Integer id, Juego juego) throws JuegoException;
	public void listarJuegos();
	public Integer siguienteId();

}
