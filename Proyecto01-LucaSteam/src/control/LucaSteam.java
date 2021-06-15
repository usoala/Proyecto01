package control;

import gui.Menu;
import service.ServiciosJuego;

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
	
	//Maria.Instancio servicios para poder usarla. IMPORTAR
	private ServiciosJuego servicios = new ServiciosJuegoImpl;
	
	/**
	 * Maria.
	 * Método para inicializar el arranque del menú
	 * Muestra menú siempre que la booleana sea true. Esta se actualiza en el método seleccionOpciones()
	 */
	public void startLucaSteam() {
		boolean continuaMenu = true;
		do {
			Menu.mostrarMenu();
			continuaMenu = this.seleccionOpciones();
		} while(continuaMenu);
		System.out.println(" **FIN DE LA SESIÓN** ");
	}
	
	
	/**
	 * Maria.
	 * Método para mostrar las dos opciones de menu
	 * @return sigueMenu
	 */
	public boolean seleccionOpciones() {
		boolean sigueMenu = true;
		try {
			switch() {
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
    }

}

