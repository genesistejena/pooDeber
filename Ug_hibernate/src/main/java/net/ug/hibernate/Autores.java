package net.ug.hibernate;


import javax.persistence.*;

@Entity
@Table(name = "autores")
public class Autores {
	@Id
	@Column(name = "id_aut")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(name = "nombres")
    private String nombres;
    private String apellidos;
    @Column(name = "fecha_nac")
    private String fechaNacimiento;
	
    
    public Autores() {
    	
    }

	public Autores(long id, String nombres, String apellidos, String fechaNacimiento) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void imprimir() {
		System.out.println(nombres);

	}

    
}
