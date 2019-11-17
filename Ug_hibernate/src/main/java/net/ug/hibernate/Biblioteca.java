package net.ug.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "biblioteca")
public class Biblioteca {
	@Id
	@Column(name = "id_bibli")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(name = "nombre")
    private String nombre;
    private String ruc;
    
    
	public Biblioteca() {
	}
	
	public Biblioteca(long id, String nombre, String ruc) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ruc = ruc;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public void imprimir() {
		System.out.println(nombre);

	}
	
}
