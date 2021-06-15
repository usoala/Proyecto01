package dao;

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
	
	public boolean altaJuego(Integer id, Juego juego);
	
	public Integer siguienteId();

}
