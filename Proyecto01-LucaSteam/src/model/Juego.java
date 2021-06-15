package model;

import java.time.LocalDate;

public class Juego {
	private String nombre;
	private LocalDate fecha;
	private Editor editor;
	private Genero genero;
	private Plataforma plataforma;
	private Double ventas;
	
	
	public Juego() {
		super();
	}


	public Juego(String nombre, LocalDate fecha, Editor editor, Genero genero, Plataforma plataforma, Double ventas) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.editor = editor;
		this.genero = genero;
		this.plataforma = plataforma;
		this.ventas = ventas;
	}



	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", fecha=" + fecha + ", ventas=" + ventas + "]";
	}
	
	  
	

}
