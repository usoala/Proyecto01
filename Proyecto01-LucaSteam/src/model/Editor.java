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

	_505GAMES(1), _989STUDIOS(2), ACCLAIM_ENTERTAINMENT(3), ACTIVISION(4), ARENA_ENTERTAINMENT(5),
	ASCII_ENTERTAINMENT(6), ATARI(7), BETHESDA_SOFTWORKS(8), CAPCOM(9), CODEMASTERS(10), DEEP_SILVER(11),
	DISNEY_INTERACTIVE_STUDIOS(12), EIDOS_INTERACTIVE(13), ELECTRONIC_ARTS(14), ENIX_CORPORATION(15),
	FOX_INTERACTIVE(16), GT_INTERACTIVE(17), HASBRO_INTERACTIVE(18), IMAGIC(19), INFOGRAMES(20), JVC(21),
	KONAMI_DIGITAL_ENTERTAINMENT(22), LEVEL_5(23), LUCASARTS(24), MAJESCO_ENTERTAINMENT(25), MAXIS(26),
	MICROSOFT_GAME_STUDIOS(27), MIDWAY_GAMES(28), MINDSCAPE(29), MTV_GAMES(30), NAMCO_BANDAI_GAMES(31), NCSOFT(32),
	NINTENDO(33), PALCOM(34), PARKER_BROS(35), RED_ORB(36), REDOCTANE(37), SEGA(38), SONY_COMPUTER_ENTERTAINMENT(39),
	SONY_COMPUTER_ENTERTAINMENT_EUROPE(40), SQUARE(41), SQUARE_ENIX(42), SQUARESOFT(43), TAKE_TWO_INTERACTIVE(44),
	TECMO_KOEI(45), THQ(46), UBISOFT(47), UEP_SYSTEMS(48), UNIVERSAL_INTERACTIVE(49), UNKNOWN(50), VALVE_SOFTWARE(51),
	VIRGIN_INTERACTIVE(52), VIVENDI_GAMES(53), WARNER_BROS_INTERACTIVE_ENTERTAINMENT(54), NA(55);

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
