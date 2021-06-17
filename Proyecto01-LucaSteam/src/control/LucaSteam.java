package control;

import gui.Menu;
import gui.MenuCargaCatalogo;
import service.ServiciosJuego;
import service.ServiciosJuegoImpl;
import utilities.Teclado;

/**
 * @ClassName LucaSteam
 *
 * @author María Castro
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class LucaSteam {
	
	/**
	 * Instancia servicios
	 */
	private ServiciosJuego servicios = new ServiciosJuegoImpl();
	
	/**
	 * Método para inicializar el arranque de los menús
	 * Primero el de inicializar catálogo, después menú principal
	 */
	public void startLucaSteam() {
		//Menú inicializar Catálogo
		Integer opcion = 0;
		boolean continuaMenu1 = true;
		do {
			MenuCargaCatalogo.mostrarMenuCargaCatalogo();
			boolean opcionBool = true;
			do {
				try {
					opcion = Teclado.tecladoInt();
					if((opcion==1)||(opcion==2)||(opcion==3)) {
						opcionBool = false;
					}else {					
						throw new Exception();						
					}
				}catch (Exception e) {
		            System.out.println("error: " + e.toString());
		        }
			}while(opcionBool);
			continuaMenu1 = this.opcionesMenuCarga(opcion);
		} while(continuaMenu1);
	
		//Menú principal
		boolean continuaMenu2 = true;
		do {
			Menu.mostrarMenu();
			continuaMenu2 = this.opcionesMenuPrincipal();
		} while(continuaMenu2);
		System.out.println(" **FIN DE LA SESION** ");
	}
	
	/**
	 * Método que devuelve un booleano en función del valor que el usuario introduce por teclado para
	 * Menú de Inicializar Catálogo
	 * @return boolean sigueMenu1
	 */
	public boolean opcionesMenuCarga(Integer opcion) {
		boolean sigueMenu1 = true;
		switch(opcion) {
			case 1:
				//CARGA DESDE BBDD
				servicios.deSerializarCatalogoJuegosImpl();
				System.out.println("El catálogo ha sido inicializado desde base de datos");
				sigueMenu1 = false;
				break;
			case 2:
				//CARGA DESDE FICHERO
				servicios.leerDatosFichero();
				System.out.println("El catálogo ha sido inicializado desde fichero");
				sigueMenu1 = false;
				break;
			case 3:
				//CATÁLOGO VACÍO
				System.out.println("El catálogo ha sido inicializado vacío");
				sigueMenu1 = false;
				break;
		}
        return sigueMenu1;
    }
	
	/**
	 * Método que devuelve un booleano en función del valor que el usuario introduce por teclado para
	 * Menú principal
	 * @return sigueMenu
	 */
	public boolean opcionesMenuPrincipal() {
		boolean sigueMenu2 = true;
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
				case 3:
					//LISTAR JUEGOS GÉNERO PLATAFORMA
					servicios.listarJuegosGeneroPlataforma();
					break;
				case 4:
					//LISTAR JUEGOS SIGLO XX
					servicios.listarJuegosSigloXX();
					break;
				case 0:
					sigueMenu2 = salir();
					break;
			}
		}catch (Exception e) {
            System.out.println("error: " + e.toString());
        }
        return sigueMenu2;
    }
	
	/**
	 * Método que devuelve un booleano en función del String introducido por teclado para salir del menú
	 * Permite la opción de guardar
	 * @return boolean
	 * @throws Exception
	 */
	public boolean salir() throws Exception {
        String salir = Teclado.tecladoString(" ¿Está seguro?(S/N)");
        if(salir.toUpperCase().charAt(0) == 'S') {
        	String guardar = Teclado.tecladoString(" ¿Desea guardar antes de salir?(S/N)");
        	if(guardar.toUpperCase().charAt(0) == 'S') {
        		try {
        			servicios.serializarCatalogoJuegosImpl();
        			System.out.println("Los cambios han sido guardados");
        		}catch (Exception e){
        			e.printStackTrace();
        			System.out.println("Error: " + e.getMessage());
        		}
        	}
        }
        return(salir.toUpperCase().charAt(0) != 'S');
    }

}

