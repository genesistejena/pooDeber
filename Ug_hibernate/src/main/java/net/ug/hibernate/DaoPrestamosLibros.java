package net.ug.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoPrestamosLibros {
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
	
	protected void crear(PrestamosLibros prestamoLibro) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(prestamoLibro);
		s.getTransaction().commit();
		s.close();
	}
	
	protected PrestamosLibros read(long codigo) {
		Session s =  sessionFactory.openSession();
		PrestamosLibros prestamoLibro = s.get(PrestamosLibros.class, codigo);
		s.close();
		return prestamoLibro;
	}
	
	protected void update(PrestamosLibros prestamoLibro) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(prestamoLibro);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int codigo) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		PrestamosLibros prestamoLibro = new PrestamosLibros();
		prestamoLibro.setId(codigo);
		s.delete(prestamoLibro);
		s.getTransaction().commit();
		s.close();
	}

}
