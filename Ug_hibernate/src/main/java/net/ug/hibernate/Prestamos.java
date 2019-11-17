package net.ug.hibernate;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "prestamos")
public class Prestamos {
	@Id
	@Column(name = "cod_pres")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	
	private int cliente;
	@Column(name = "fecha_pres")
	private Date fechaPrestamo;
	
	
	public  Prestamos () {
		
	}

	public Prestamos(long id, int cliente, Date fechaPrestamo) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.fechaPrestamo = fechaPrestamo;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}


}
