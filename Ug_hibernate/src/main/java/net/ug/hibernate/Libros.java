package net.ug.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libros")
public class Libros {
	@Id
	@Column(name = "cod_lib")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(name = "titulo")
    private String titulo;
	private String descripcion;
	private int edicion;
	private String observaciones;
    private int biblioteca;
    
	public Libros() {
	}
	

	public Libros(long id, String titulo, String descripcion, int edicion, String observaciones, int biblioteca) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.edicion = edicion;
		this.observaciones = observaciones;
		this.biblioteca = biblioteca;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getEdicion() {
		return edicion;
	}


	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public int getBiblioteca() {
		return biblioteca;
	}


	public void setBiblioteca(int biblioteca) {
		this.biblioteca = biblioteca;
	}


	public void imprimir() {
		System.out.println(titulo);
	}

}
