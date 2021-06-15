package utilities;

import java.util.Scanner;

/**
 * @ClassName Teclado
 *
 * @author María Castro, Patricia García, Usoa Larrarte,
 * Jennifer Pérez y Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */

public class Teclado {
	
	
	/**
	 * Método estático de lectura de datos del teclado
	 * @return captura del String leído
	 * @throws Exception
	 */
	public static String tecladoString() throws Exception {
		return new Scanner(System.in).next();
	}
	
	
	/**
	 * Método estático de lectura de datos del teclado
	 * @param mensaje
	 * @return captura del String leído
	 * @throws Exception
	 */
	public static String tecladoString(String mensaje) throws Exception {
		System.out.println(mensaje);
		return tecladoString();
	}
	
	/**
	 * Método estático de lectura de datos del teclado
	 * 
	 * @return captura del int leído
	 * @throws Exception
	 */
	public static int tecladoInt() throws Exception{
		return new Scanner(System.in).nextInt();
	}
	
	/**
	 * Método estático de lectura de datos del teclado
	 * @param mensaje
	 * @return captura del int leído
	 * @throws Exception
	 */
	public static int tecladoInt(String mensaje) throws Exception {
		System.out.println(mensaje);
		return tecladoInt();
	}
	
	/**
	 * Método estático de lectura de datos del teclado
	 * 
	 * @return captura del double leído
	 * @throws Exception
	 */
	public static double tecladoDouble() throws Exception {
		return new Scanner(System.in).nextDouble();
	}
	
	/**
	 * Método estático de lectura de datos del teclado
	 * @param mensaje
	 * @return captura del double leído
	 * @throws Exception
	 */
	public static double tecladoDouble(String mensaje) throws Exception {
		System.out.println(mensaje);
		return tecladoDouble();
	}

	/**
	 * Método estático de lectura de datos del teclado
	 * 
	 * @return captura del String leído (captura línea entera)
	 * @throws Exception
	 */
	public static String tecladoLinea() throws Exception {
		return new Scanner(System.in).nextLine();
	}
	
	/**
	 * Método estático de lectura de datos del teclado
	 * @param mensaje
	 * @return captura del String leído (captura línea entera)
	 * @throws Exception
	 */
	public static String tecladoLinea(String mensaje) throws Exception {
		System.out.println(mensaje);
		return tecladoLinea();
	}

}
