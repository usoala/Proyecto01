package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @ClassName JuegoException
 *
 * @author María Castro, Patricia García, Usoa Larrarte,
 * Jennifer Pérez y Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class JuegoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private Level level;
	
	// 1: ERROR
	// 2: WARNING
	// 3: INFO

	/**
	 * Constructor de la clase JuegoException
	 *
	 */
	public JuegoException() {
	}
	
	/**
	 * Constructor de la clase JuegoException
	 *
	 * @param message
	 */
	public JuegoException(String message) {
		super(message);
	}

	/**
	 * Constructor de la clase JuegoException
	 *
	 * @param cause
	 */
	public JuegoException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructor de la clase JuegoException
	 *
	 * @param message
	 * @param cause
	 */
	public JuegoException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * Constructor de la clase JuegoException
	 *
	 * @param message
	 * @param tipo
	 */
	public JuegoException(String message, int tipo) {
		super(message);
		setLevel(tipo);
	}	

	/**
	 * Asigna nivel de importancia del error (SEVERE, WARNING, INFO)
	 *   
	 * @param tipo       
	 */
	public void setLevel(int tipo) {

		switch (tipo) {
		case 1:
			level = Level.SEVERE;
			break;
		case 2:
			level = Level.WARNING;
			break;
		case 3:
			level = Level.INFO;
			break;
		default:
			level = Level.INFO;
			break;
		}
	}

	/**
	 * Sobrescritura del método toString
	 *
	 * @return super.getMessage()
	 */
	@Override
	public String toString() {
		Logger.getLogger(JuegoException.class.getName()).log(level, null, super.getMessage());
		return super.getMessage();
		
	}	

}
