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


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public Editor getEditor() {
		return editor;
	}


	public void setEditor(Editor editor) {
		this.editor = editor;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public Plataforma getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}


	public Double getVentas() {
		return ventas;
	}


	public void setVentas(Double ventas) {
		this.ventas = ventas;
	}


	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", fecha=" + fecha + ", ventas=" + ventas + "]";
	}
	
	  
	

}
