package model;

/**
 * @ClassName Editor
 *
 * @author María Castro, Sara Silvo
 * 
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public enum Editor {

	_505GAMES(1), _989STUDIOS(2), ACCLAIMENTERTAINMENT(3), ACTIVISION(4), ARENAENTERTAINMENT(5),
	ASCIIENTERTAINMENT(6), ATARI(7), BETHESDASOFTWORKS(8), CAPCOM(9), CODEMASTERS(10), DEEPSILVER(11),
	DISNEYINTERACTIVESTUDIOS(12), EIDOSINTERACTIVE(13), ELECTRONICARTS(14), ENIXCORPORATION(15),
	FOXINTERACTIVE(16), GTINTERACTIVE(17), HASBROINTERACTIVE(18), IMAGIC(19), INFOGRAMES(20), JVC(21),
	KONAMIDIGITALENTERTAINMENT(22), LEVEL5(23), LUCASARTS(24), MAJESCOENTERTAINMENT(25), MAXIS(26),
	MICROSOFTGAMESTUDIOS(27), MIDWAYGAMES(28), MINDSCAPE(29), MTVGAMES(30), NAMCOBANDAIGAMES(31), NCSOFT(32),
	NINTENDO(33), PALCOM(34), PARKERBROS(35), REDORB(36), REDOCTANE(37), SEGA(38), SONYCOMPUTERENTERTAINMENT(39),
	SONYCOMPUTERENTERTAINMENTEUROPE(40), SQUARE(41), SQUAREENIX(42), SQUARESOFT(43), TAKETWOINTERACTIVE(44),
	TECMOKOEI(45), THQ(46), UBISOFT(47), UEPSYSTEMS(48), UNIVERSALINTERACTIVE(49), UNKNOWN(50), VALVESOFTWARE(51),
	VIRGININTERACTIVE(52), VIVENDIGAMES(53), WARNERBROSINTERACTIVEENTERTAINMENT(54), NA(55);

	private final int codigo;

	/**
	 * Constructor de la clase Editor
	 *
	 * @param editor
	 */
	private Editor(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Método getter del atributo codigo
	 *
	 * @return codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Atributo Array de values
	 * 
	 * 
	 */
	private static Editor[] values = null;

	/**
	 * Método que devuelve el editor tras recibir el value como parámetro
	 * 
	 * @param val
	 * @return
	 */
	public static Editor dimeEditor(int val) {
		if (Editor.values == null) {
			Editor.values = Editor.values();
		}
		return Editor.values[val - 1];
	}

	/**
	 * Método para mostrar todas los editores por pantalla
	 */
	public static void mostrarEditor() {
		StringBuilder sb;
		for (Editor edit : Editor.values()) {
			sb = new StringBuilder();
			sb.append("(").append(edit.codigo).append(")").append(edit).append("|");
			System.out.println(sb);
		}
	}
}
