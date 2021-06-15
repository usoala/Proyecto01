package model;

/**
 * @ClassName Editor
 *
 * @author María Castro
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public enum Editor {
	
	_505GAMES("505 Games"), _989STUDIOS("989 Studios"), ACCLAIM_ENTERTAINMENT("Acclaim Entertainment"), 
	ACTIVISION("Activision"), ARENA_ENTERTAINMENT("Arena Entertainment"), 
	ASCII_ENTERTAINMENT("ASCII Entertainment"), ATARI("Atari"), BETHESDA_SOFTWORKS("Bethesda Softworks"),
	CAPCOM("Capcom"), CODEMASTERS("Codemasters"), DEEP_SILVER("Deep Silver"), 
	DISNEY_INTERACTIVE_STUDIOS("Disney Interactive Studios"), EIDOS_INTERACTIVE("Eidos Interactive"),
	ELECTRONIC_ARTS("Electronic Arts"), ENIX_CORPORATION("Enix Corporation"),
	FOX_INTERACTIVE("Fox Interactive"), GT_INTERACTIVE("GT Interactive"), 
	HASBRO_INTERACTIVE("Hasbro Interactive"), IMAGIC("Imagic"), INFOGRAMES("Infogrames"), JVC("JVC"),
	KONAMI_DIGITAL_ENTERTAINMENT("Konami Digital Entertainment"), LEVEL_5("Level 5"),
	LUCASARTS("LucasArts"), MAJESCO_ENTERTAINMENT("Majesco Entertainment"), MAXIS("Maxis"),
	MICROSOFT_GAME_STUDIOS("Microsoft Game Studios"), MIDWAY_GAMES("Midway Games"), 
	MINDSCAPE("Mindscape"), MTV_GAMES("MTV Games"), NAMCO_BANDAI_GAMES("Namco Bandai Games"), 
	NCSOFT("NCSoft"), NINTENDO("Nintendo"), PALCOM("Palcom"), PARKER_BROS("Parker Bros."), 
	RED_ORB("Red Orb"), REDOCTANE("RedOctane"), SEGA ("Sega"), 
	SONY_COMPUTER_ENTERTAINMENT("Sony Computer Entertainment"), 
	SONY_COMPUTER_ENTERTAINMENT_EUROPE("Sony Computer Entertainment Europe"), SQUARE("Square"), 
	SQUARE_ENIX("Square Enix"), SQUARESOFT("SquareSoft"), TAKE_TWO_INTERACTIVE("Take-Two Interactive"),
	TECMO_KOEI("Tecmo Koei"), THQ("THQ"), UBISOFT("Ubisoft"), UEP_SYSTEMS("UEP Systems"),
	UNIVERSAL_INTERACTIVE("Universal Interactive"), UNKNOWN("Unknown"),
	VALVE_SOFTWARE("Valve Software"), VIRGIN_INTERACTIVE("Virgin Interactive"), 
	VIVENDI_GAMES("Vivendi Games"),
	WARNER_BROS_INTERACTIVE_ENTERTAINMENT("Warner Bros. Interactive Entertainment"),NA("N/A");
	
	private final String editor;
	
	/**
	 * Constructor de la clase Editor
	 *
	 * @param editor
	 */
	private Editor(String editor) {
		this.editor = editor;
	}

	/**
	 * Método getter del atributo editor
	 *
	 * @return editor
	 */
	public String getEditor() {
		return editor;
	}
	
}
