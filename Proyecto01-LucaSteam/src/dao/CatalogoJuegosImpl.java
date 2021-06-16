package dao;

import java.io.File;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


import model.Juego;
import exception.JuegoException;

/**
 * @ClassName CatalogoJuegosImpl
 * Implementación de la Interface CatalogoJuegos
 * 
 * @author María Castro, Patricia García, Usoa Larrarte,
 * Jennifer Pérez y Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class CatalogoJuegosImpl implements CatalogoJuegos {
	
	/**
	 * Atributo catalogo
	 * 
	 */
	private Map<Integer, Juego> catalogo;
	
	/**
	 * Constructor de la clase CatalogoJuegos
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
	 * Implementación del método altaJuego
	 * 
	 * Da de alta un juego si su ID no está repetido en el catálogo
	 * Si el ID existe en el catalogo, lanza una excepción
	 *
	 * @param id
	 * @param juego
	 * @return boolean
	 * @throws JuegoException
	 */
	public boolean altaJuego(Integer id, Juego juego) throws JuegoException {
		if (catalogo.containsKey(id)) {
			throw new JuegoException("No se puede dar de alta el juego. El ID está repetido. ", 2);
		} else {
			catalogo.put(id, juego);
			return true;
		}
	}
	
	/**
	 * Implementación del método listarJuegos
	 * Lista los juegos del catalogo
	 *
	 */
	public void listarJuegos() {
		Integer key;
		Iterator<Integer> juegos = catalogo.keySet().iterator();
		System.out.println(" Listado de juegos en Catálogo ");
		while (juegos.hasNext()) {
			key = juegos.next();
			System.out.println("(" + key + "): " + catalogo.get(key));
		}
	}
	
	/**
	 * Implementación del método siguienteId
	 * 
	 * Busca el último ID existente en el catálogo y devuelve el entero siguiente
	 *
	 * @return maxID+1
	 */
	public Integer siguienteId() {
		Integer maxId;
		if(catalogo.size()==0) {
			maxId=0;
		} else {
			maxId = catalogo.entrySet().stream()
					.max((a,b) -> Integer.compare(a.getKey(), b.getKey()))
					.map(e-> e.getKey())
					.get();
		}
		return maxId+1;
	}

	
	public void serializarCatalogoJuegosImpl(String fichero) {
		// TODO Auto-generated method stub
		
	}

	
	public void deSerializarCatalogoJuegosImpl(String fichero) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	


	

	

}
