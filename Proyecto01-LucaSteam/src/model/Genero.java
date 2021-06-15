package model;

/**
 * @ClassName Genero
 *
 * @author Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */

public enum Genero {
	
	ACTION("ACTION"),
	ADVENTURE("ADVENTURE"),
	FIGHTING("FIGHTING"),
	MISC("MISC"),
	PLATAFORM("PLATAFORM"),
	PUZZLE("PUZZLE"),
	RACING("RACING"),
	ROLE_PLAYING("ROLE PLAYING"),
	SHOOTER("SHOOTER"),
	SIMULATION("SIMULATION"),
	SPORT("SPORT"),
	STRATEGY("STRATEGY");
	    
	private final String genero;

	/**
	 * Constructor de la clase Genero
	 *	
	 * @param genero
	 */
	private Genero(String genero) {
		this.genero =genero;
	}

	/**
	 * Método getter del atributo genero
	 *
	 * @return genero
	 */
	public String getGenero() {
		return genero;
	}
	
		
	
}
