package net.ug.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "libros_autores")
public class LibrosAutores {
	@Id
	@Column(name = "cod")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(name = "libro")
    private int libro;
    private int autor;
    
    public LibrosAutores() {
    	
    }

	public LibrosAutores(long id, int libro, int autor) {
		super();
		this.id = id;
		this.libro = libro;
		this.autor = autor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getLibro() {
		return libro;
	}

	public void setLibro(int libro) {
		this.libro = libro;
	}

	public int getAutor() {
		return autor;
	}

	public void setAutor(int autor) {
		this.autor = autor;
	}
    

}
