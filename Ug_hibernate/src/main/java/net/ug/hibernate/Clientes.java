package net.ug.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Clientes {
	@Id
	@Column(name = "id_cliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(name = "nombres")
    private String nombres;
    private String apellidos;
    @Column(name = "fecha_nac")
    private String fechaNacimiento;
    private String telefono;
    private String direccion;
    private char esActivo;
    
    public Clientes () {
    }

	public Clientes(long id, String nombres, String apellidos, String fechaNacimiento, String telefono, String direccion,
			char esActivo) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.direccion = direccion;
		this.esActivo = esActivo;
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


	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public char getEsActivo() {
		return esActivo;
	}

	public void setEsActivo(char esActivo) {
		this.esActivo = esActivo;
	}
    
	public void imprimir() {
		System.out.println(nombres);

	}
    
}


