package model;

/**
 * @ClassName Plataforma
 *
 * @author Patricia García
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public enum Plataforma {
	
	_2600("2600"),
	_3DS("3DS"),
	DC("DC"),
	DS("DS"),
	GB("GB"),
	GBA("GBA"),
	GC("GC"),
	GEN("GEN"),
	N64("N64"),
	NES("NES"),
	PC("PC"),
	PS("PS"),
	PS2("PS2"),
	PS3("PS3"),
	PS4("PS4"),
	PSP("PSP"),
	PSV("PSV"),
	SAT("SAT"),
	SNES("SNES"),
	WII("Wii"),
	WIIU("WiiU"),
	X360("X360"),
	XB("XB"),
	XONE("XOne");
	
	private final String plataforma;

	/**
	 * Constructor de la clase Plataforma
	 *
	 * @param plataforma
	 */
	private Plataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	/**
	 * Método getter del atributo plataforma
	 *
	 * @return plataforma
	 */
	public String getPlataforma() {
		return plataforma;
	}

}
