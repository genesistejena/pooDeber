package net.ug.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "prestamos_libros")
public class PrestamosLibros {
	@Id
	@Column(name = "codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(name = "libros")
	private int libros;
	private int prestamos;
	
	
	public PrestamosLibros (){
		
	}

	public PrestamosLibros(long id, int libros, int prestamos) {
		super();
		this.id = id;
		this.libros = libros;
		this.prestamos = prestamos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getLibros() {
		return libros;
	}

	public void setLibros(int libros) {
		this.libros = libros;
	}

	public int getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(int prestamos) {
		this.prestamos = prestamos;
	}
	

}
