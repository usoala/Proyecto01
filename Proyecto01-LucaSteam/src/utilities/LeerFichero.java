
package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.HashMap;
//import java.util.HashSet;
import java.util.LinkedHashMap;
//import java.util.Map.Entry;
import dao.CatalogoJuegos;
//import exception.JuegoException;
//import model.Editor;
import model.Genero;
import model.Juego;
import model.Plataforma;
import model.Editor;


/**
 * @ClassName LeerFichero
 *
 * @author Jennifer P�rez
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class LeerFichero {

	/**
	 * Lee el fichero de entrada (formato .csv) que contiene la coleccion de juegos
	 * y guarda cada juego completo (rango, nombre, plataforma, ano, genero, editor
	 * y ventas Europa) como un elemento en el mapa
	 */
	private static final String RUTAFICHERO = "CSVDatosSelecPorComas.csv";

	public static LinkedHashMap<Integer, Juego> leerDatosFichero() {
		LinkedHashMap<Integer, Juego> mapaJuego = new LinkedHashMap<>();

		File archivo = new File(RUTAFICHERO);
		FileReader fr = null;
		try {
			fr = new FileReader(archivo);

			BufferedReader br = new BufferedReader(fr);

			String linea;
			while ((linea = br.readLine()) != null) {
				String[] JuegoString = linea.split(";");// convierte cada l�nea en array separado por comas

				Juego AltaJuego = arrayToJuegos(JuegoString);
				Integer id = Integer.valueOf(JuegoString[0].replace(" ", ""));
				mapaJuego.put(id, AltaJuego);
				//br.close();
			}
			br.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepci�n.
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
	 * Guarda en un array las tuplas de cada juego. Rango en la posici�n 0, nombre
	 * en la 1, plataforma en la 2, ano en la 3, genero en la 4, editor en la 5 y
	 * ventas de Europa en la 6.
	 * 
	 * @param juegoString array tipo String: incluye los datos completos de un juego
	 * @return altaJuego
	 */
	//TOCADOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
	public static Juego arrayToJuegos(String[] juegoString) {
		// Integer rango = Integer.valueOf(juegoString[0].replace(" ", ""));
		String nombre = String.valueOf(juegoString[1].replace(" ", ""));
		
		//PROPUESTA1: Editor pasarlo a String, pq es el m�s problem�tico y con plataforma y g�nero:
		String plat = String.valueOf(juegoString[2].replace(" ", "_"));
		Plataforma plataforma=null;
		for(Plataforma p: Plataforma.values()) {
			if(plat.equalsIgnoreCase("2600")) {
				plataforma = Plataforma._2600;
			}else if(plat.equalsIgnoreCase("3DS")) {
				plataforma = Plataforma._3DS;
			}else if(p.toString().equalsIgnoreCase(plat)) {
				plataforma = p;
			}
		}
		/*
		//PROPUESTA1.1:
		Plataforma plataforma = null;
		try {
			plataforma = Plataforma.valueOf(juegoString[2].replace(" ", "").toUpperCase());
		}catch (Exception e) {
			if(Plataforma.valueOf(juegoString[2].replace(" ", "_")).toString().equalsIgnoreCase("2600")){
				plataforma = Plataforma._2600;
			}else if (Plataforma.valueOf(juegoString[2].replace(" ", "_")).toString().equalsIgnoreCase("3DS")) {
				plataforma = Plataforma._3DS;
			}
		}*/
		
		Integer fecha = Integer.valueOf(juegoString[3].replace(" ", ""));
		
		//PROPUESTA2:
		String gen = String.valueOf(juegoString[4].replace(" ", ""));
		Genero genero=null;
		for(Genero g: Genero.values()) {
			if(gen.equalsIgnoreCase("Role-Playing")) {
				genero = Genero.ROLEPLAYING;
			}else if(g.toString().equalsIgnoreCase(gen)) {
				genero = g;
			}
		}
		/*
		//PROPUESTA2.2:
		Genero genero = null;
		try {
			genero = Genero.valueOf(juegoString[4].replace(" ", "").toUpperCase());
		}catch (Exception e){
			if(Genero.valueOf(juegoString[4].replace(" ", "")).toString().equalsIgnoreCase("Role-Playing")){
				genero = Genero.ROLE_PLAYING;
			}
		}*/
		
		/*
		//PROPUESTA3:
		String edit = String.valueOf(juegoString[5].replace(" ", "_"));
		Editor editor=null;
		for(Editor e: Editor.values()) {
			if(edit.equalsIgnoreCase("505 Games")) {
				editor = Editor._505GAMES;
			}else if(edit.equalsIgnoreCase("989 Studios")) {
				editor = Editor._989STUDIOS;
			}else if(edit.equalsIgnoreCase("N/A")) {
				editor = Editor.NA;
			}else if(e.toString().equalsIgnoreCase(edit)) {
				editor = e;
			}
		}*/
		/*
		//PROPUESTA3.1:
		Editor editor = null;
		try {
			editor = Editor.valueOf(juegoString[5].replace(" ", "").toUpperCase());
		}catch (Exception e) {
			if(Editor.valueOf(juegoString[5].replace(" ", "")).toString().equalsIgnoreCase("505_GAMES")){
				editor = Editor._505GAMES;
			}else if (Editor.valueOf(juegoString[5].replace(" ", "")).toString().equalsIgnoreCase("989_STUDIOS")) {
				editor = Editor._989STUDIOS;
			}
		}*/
		
		//PROPUESTO3.2
		Editor editor = Editor.valueOf(juegoString[5].replace(" ", ""));
		Double ventas = Double.valueOf(juegoString[6].replace(" ", ""));

		Juego altaJuego = new Juego(nombre, fecha, editor, genero, plataforma, ventas);
		// Juego altaJuego = new Juego (rango, nombre, plataforma, ano, genero, editor,
		// ventas);

		return altaJuego;
	}

	
	/**
	 * Imprime por consola la tupla de cada juego separado por comas
	 * 
	 * @param juego
	 * @return
	 */
	/*
	private static String juegoToLine(Juego juego) {

		return juego.getNombre() + juego.getFecha() + "," + juego.getEditor() + "," + juego.getGenero() + ","
				+ juego.getPlataforma() + "," + juego.getVentas();
		// return juego.getRango() + "," + juego.getNombre() + juego.getPlataforma() +
		// "," + juego.getAno() + "," + juego.getGenero() + "," + juego.getEditor() +
		// "," + juego.getVentas();

	}*/

	/**
	 * Guarda en un fichero la colecci�n de los juegos
	 * 
	 * @param catalogo
	 * @throws LucaSteam
	 */
	/*
	public static void guardarDatosJuego(CatalogoJuegos catalogo) throws JuegoException {

//			File fichero = new File(RUTAFICHERO);
//			if (fichero.delete()) {
//				System.out.println("Fichero eliminado");
//			}

		FileWriter fichero = null;
		// PrintWriter pw = null;
		try {
			fichero = new FileWriter(RUTAFICHERO);
			// pw = new PrintWriter(fichero);

			/*
			 * for (Entry<String, Juego> entry : catalogo.getMapaJuegos().entrySet()) {
			 * pw.println(juegoToLine(entry.getValue()));
			 * 
			 * }
			 */ // Hay que crear el getMapaJuegos()

		/*} catch (Exception e) {
			throw new JuegoException("Error al guardarlo en archivo");
		} finally {
			try {
				// Aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}*/

}
