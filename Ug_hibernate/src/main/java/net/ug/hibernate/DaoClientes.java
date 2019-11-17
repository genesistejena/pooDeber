package net.ug.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoClientes {
	protected SessionFactory sessionFactory;
	
	protected void setup() {
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
	
	protected void crear(Clientes cliente) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(cliente);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Clientes read(long id_cliente) {
		Session s =  sessionFactory.openSession();
		Clientes cliente = s.get(Clientes.class, id_cliente);
		s.close();
		return cliente;
	}
	
	protected void update(Clientes cliente) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(cliente);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int id_cliente) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Clientes cliente = new Clientes();
		cliente.setId(id_cliente);
		s.delete(cliente);
		s.getTransaction().commit();
		s.close();
	}

}


