package control;


import gui.Menu;
import gui.MenuCargaCatalogo;
import service.ServiciosJuego;
import service.ServiciosJuegoImpl;
import utilities.Teclado;

/**
 * @ClassName LucaSteam
 *
 * @author María Castro, Patricia García, Usoa Larrarte,
 * Jennifer Pérez y Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class LucaSteam {
	
	/**
	 * Maria. 
	 * Instancio servicios para poder usarla. IMPORTAR
	 * Atributo servicios
	 */
	private ServiciosJuego servicios = new ServiciosJuegoImpl();
	
	/**
	 * Maria.
	 * Método para inicializar el arranque del menú
	 * Muestra menú siempre que la booleana sea true. Esta se actualiza en el método seleccionOpciones()
	 *//*
	public void startLucaSteam() {
		//Menú inicial de carga de Catálogo
		boolean continuaMenu1 = true;
		do {
			MenuCargaCatalogo.mostrarMenuCargaCatalogo();
			continuaMenu1 = this.opcionesMenuCarga();
		} while(continuaMenu1);
	
		
		//Menú principal
		boolean continuaMenu2 = true;
		do {
			Menu.mostrarMenu();
			continuaMenu2 = this.seleccionOpciones();
		} while(continuaMenu2);
		System.out.println(" **FIN DE LA SESIÓN** ");
	}*/
	/*
	public boolean opcionesMenuCarga() {
		boolean sigueMenu1 = true;
		try {
			switch(Teclado.tecladoInt()) {
				case 1:
					//CARGA DESDE BBDD
					servicios.deSerializarCatalogo();
					sigueMenu1 = false;
					break;
				case 2:
					//CARGA DESDE FICHERO
					servicios.leerFichero();
					sigueMenu1 = false;
					break;
				case 3:
					//CATÁLOGO VACÍO
					sigueMenu1 = false;
					break;
			}
		}catch (Exception e) {
            System.out.println("error: " + e.toString());
        }
        return sigueMenu;
    }*/
	
	/**
	 * Maria.
	 * Método para mostrar las dos opciones de menu
	 * @return sigueMenu
	 */
	/*
	public boolean seleccionOpciones() {
		boolean sigueMenu = true;
		try {
			switch(Teclado.tecladoInt()) {
				case 1:
					//ALTA DE UN JUEGO
					servicios.altaJuego();
					break;
				case 2:
					//LISTAR JUEGOS
					servicios.listarJuegos();
					break;
			}
		}catch (Exception e) {
            System.out.println("error: " + e.toString());
        }
        return sigueMenu;
    }*/

}

