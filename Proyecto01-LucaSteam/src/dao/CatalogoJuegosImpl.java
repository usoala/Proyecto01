package dao;

import java.util.HashMap;
import java.util.Map;
import model.Juego;
import exception.JuegoException;

/**
 * @ClassName CatalogoJuegosImpl
 *
 * @author María Castro, Patricia García, Usoa Larrarte,
 * Jennifer Pérez y Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class CatalogoJuegosImpl implements CatalogoJuegos {
	
	//Código, Juego
	/**
	 * Atributo catalogo
	 * 
	 */
	private Map<Integer, Juego> catalogo;
	
	/**
	 * Constructor de la clase CatalogoJuegosImpl
	 *
	 */
	public CatalogoJuegosImpl() {
		catalogo = new HashMap<>();
	}

	/**
	 * Método getter del atributo catalogo
	 *
	 * @return catalogo
	 */
	public Map<Integer, Juego> getCatalogo() {
		return catalogo;
	}

	/**
	 * Método setter del atributo catalogo
	 *
	 * @param catalogo to set catalogo 
	 */
	public void setCatalogo(Map<Integer, Juego> catalogo) {
		this.catalogo = catalogo;
	}
	
	/**
	 * Implementación/Sobrescritura del método altaJuego
	 *
	 * @param id
	 * @param juego
	 * @return
	 * @throws JuegoException
	 */
	public boolean altaJuego(Integer id, Juego juego) throws JuegoException {
		if (catalogo.containsKey(juego)) {
			throw new JuegoException("No se puede dar de alta el juego. El ID está repetido. ");
		} else {
			catalogo.put(id, juego);
			return true;
		}
	}
	
	/**
	 * Implementación/Sobrescritura del método siguienteId
	 *
	 * @return
	 */
	public Integer siguienteId() {
		Integer maxId = catalogo.entrySet().stream()
		.max((a,b) -> Integer.compare(a.getKey(), b.getKey()))
		.map(e-> e.getKey())
		.get();
		return maxId+1;
	}



}
