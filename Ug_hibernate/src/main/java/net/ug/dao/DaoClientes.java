package net.ug.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import net.ug.hibernate.Clientes;

public class DaoClientes {
	protected SessionFactory sessionFactory;
	
	public void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()  //lee los settings del archivo hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}
	
	public void crear(Clientes cliente) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(cliente);
		s.getTransaction().commit();
		s.close();
	}
	
	public Clientes read(long id_cliente) {
		Session s =  sessionFactory.openSession();
		Clientes cliente = s.get(Clientes.class, id_cliente);
		s.close();
		return cliente;
	}
	
	public void update(Clientes cliente) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(cliente);
		s.getTransaction().commit();
		s.close();
	}
	
	
	public void delete(int id_cliente) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Clientes cliente = new Clientes();
		cliente.setId(id_cliente);
		s.delete(cliente);
		s.getTransaction().commit();
		s.close();
	}

}


