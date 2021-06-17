
package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import model.Genero;
import model.Juego;
import model.Plataforma;

/**
 * @ClassName LeerFichero
 *
 * @author Jennifer Pérez
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class LeerFichero {

	/**
	 * Atributo RUTAFICHERO
	 */
	private static final String RUTAFICHERO = "CSVDatosSelecPorComas.csv";

	/**
	 * Implementación método leerDatosFichero()
	 * 
	 * @return
	 */
	public static LinkedHashMap<Integer, Juego> leerDatosFichero() {

		LinkedHashMap<Integer, Juego> mapaJuego = new LinkedHashMap<>();

		File archivo = new File(RUTAFICHERO);
		FileReader fr = null;

		try {
			fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] JuegoString = linea.split(";");// convierte cada línea en array separado por comas
				Juego AltaJuego = arrayToJuegos(JuegoString);
				Integer id = Integer.valueOf(JuegoString[0].replace(" ", ""));
				mapaJuego.put(id, AltaJuego);
			}
			br.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepción.
			try {
				if (null != fr) {
					fr.close();

				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return mapaJuego;
	}

	/**
	 * Guarda en un array las tuplas de cada juego. Rango en la posición 0, nombre
	 * en la 1, plataforma en la 2, ano en la 3, genero en la 4, editor en la 5 y
	 * ventas de Europa en la 6.
	 * 
	 * @param juegoString array tipo String: incluye los datos completos de un juego
	 * @return altaJuego
	 */
	private static Juego arrayToJuegos(String[] juegoString) {
		// Nombre
		String nombre = String.valueOf(juegoString[1].replace(" ", ""));

		// Plataforma
		String plat = String.valueOf(juegoString[2].replace(" ", "_"));
		Plataforma plataforma = null;
		for (Plataforma p : Plataforma.values()) {
			if (plat.equalsIgnoreCase("2600")) {
				plataforma = Plataforma._2600;
			} else if (plat.equalsIgnoreCase("3DS")) {
				plataforma = Plataforma._3DS;
			} else if (p.toString().equalsIgnoreCase(plat)) {
				plataforma = p;
			}
		}

		// Fecha
		Integer fecha = Integer.valueOf(juegoString[3].replace(" ", ""));

		// Genero
		String gen = String.valueOf(juegoString[4].replace(" ", ""));
		Genero genero = null;
		for (Genero g : Genero.values()) {
			if (gen.equalsIgnoreCase("Role-Playing")) {
				genero = Genero.ROLE_PLAYING;
			} else if (g.toString().equalsIgnoreCase(gen)) {
				genero = g;
			}
		}

		// Editor
		String editor = String.valueOf(juegoString[5].replace(" ", ""));

		// Ventas
		Double ventas = Double.valueOf(juegoString[6].replace(" ", ""));

		Juego altaJuego = new Juego(nombre, fecha, editor, genero, plataforma, ventas);

		return altaJuego;
	}

}