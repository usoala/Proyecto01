package model;

import java.io.Serializable;
import utilities.Teclado;

/**
 * @ClassName Juego
 *
 * @author Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class Juego implements Serializable {
	private String nombre;
	private Integer fecha;
	private String editor;
	private Genero genero;
	private Plataforma plataforma;
	private Double ventas;

	/**
	 * Constructor de la clase Juego
	 *
	 */
	public Juego() {
		super();
	}

	/**
	 * Constructor de la clase Juego
	 *
	 * @param nombre
	 * @param fecha
	 * @param editor
	 * @param genero
	 * @param plataforma
	 * @param ventas
	 */
	public Juego(String nombre, Integer fecha, String editor, Genero genero, Plataforma plataforma, Double ventas) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.editor = editor;
		this.genero = genero;
		this.plataforma = plataforma;
		this.ventas = ventas;
	}

	/**
	 * Método getter del atributo nombre
	 *
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método setter del atributo nombre
	 *
	 * @param nombre to set nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método getter del atributo fecha
	 *
	 * @return fecha
	 */
	public Integer getFecha() {
		return fecha;
	}

	/**
	 * Método setter del atributo fecha
	 *
	 * @param fecha to set fecha
	 */
	public void setFecha(Integer fecha) {
		this.fecha = fecha;
	}

	/**
	 * Método getter del atributo editor
	 *
	 * @return editor
	 */
	public String getEditor() {
		return editor;
	}

	/**
	 * Método setter del atributo editor
	 *
	 * @param editor to set editor
	 */
	public void setEditor(String editor) {
		this.editor = editor;
	}

	/**
	 * Método getter del atributo genero
	 *
	 * @return genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Método setter del atributo genero
	 *
	 * @param genero to set genero
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * Método getter del atributo plataforma
	 *
	 * @return plataforma
	 */
	public Plataforma getPlataforma() {
		return plataforma;
	}

	/**
	 * Método setter del atributo plataforma
	 *
	 * @param plataforma to set plataforma
	 */
	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	/**
	 * Método getter del atributo ventas
	 *
	 * @return ventas
	 */
	public Double getVentas() {
		return ventas;
	}

	/**
	 * Método setter del atributo ventas
	 *
	 * @param ventas to set ventas
	 */
	public void setVentas(Double ventas) {
		this.ventas = ventas;
	}

	/**
	 * Metodo para crear un nuevo Juego pidiendo los valores por teclado
	 */
	public void crearJuego() {

		try {
			this.nombre = Teclado.tecladoString("Introduce el nombre del Juego");
			this.fecha = Teclado.tecladoInt("Fecha de lanzamiento. Introduce el año ");
			System.out.println("Seleccione el género");
			Genero.mostrarGenero();
			this.genero = Genero.dimeGenero(Teclado.tecladoInt());
			System.out.println("Seleccione la plataforma");
			Plataforma.mostrarPlataforma();
			this.plataforma = Plataforma.dimePlataforma(Teclado.tecladoInt());
			this.editor = Teclado.tecladoLinea("Introduce el editor del juego");
			this.ventas = Teclado.tecladoDouble("Introduce el numero de ventas (use la coma decimal)");

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	/**
	 * Implementación/Sobrescritura del método toString
	 *
	 * @return
	 */
	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", fecha=" + fecha + ", editor=" + editor + ", genero=" + genero
				+ ", plataforma=" + plataforma + ", ventas=" + ventas + "]";
	}

	/**
	 * Implementación/Sobrescritura del método hashCode
	 *
	 * @return
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((editor == null) ? 0 : editor.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((plataforma == null) ? 0 : plataforma.hashCode());
		result = prime * result + ((ventas == null) ? 0 : ventas.hashCode());
		return result;
	}

	/**
	 * Sobrescritura del método equals
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juego other = (Juego) obj;
		if (editor == null) {
			if (other.editor != null)
				return false;
		} else if (!editor.equals(other.editor))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (genero != other.genero)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (plataforma != other.plataforma)
			return false;
		if (ventas == null) {
			if (other.ventas != null)
				return false;
		} else if (!ventas.equals(other.ventas))
			return false;
		return true;
	}

}
