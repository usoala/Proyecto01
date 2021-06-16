package service;
import java.util.LinkedHashMap;

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
	public LinkedHashMap<Integer, Juego> leerDatosFichero();
	public void serializarCatalogoJuegosImpl();
    public void deSerializarCatalogoJuegosImpl();
    public void listarJuegosSigloXX() throws JuegoException;
    public void listarJuegosGeneroPlataforma() throws JuegoException;
    
}