package net.ug.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoLibrosAutores {
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
	
	protected void crear(LibrosAutores libroAutor) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(libroAutor);
		s.getTransaction().commit();
		s.close();
	}
	
	protected LibrosAutores read(long cod) {
		Session s =  sessionFactory.openSession();
		LibrosAutores libroAutor = s.get(LibrosAutores.class, cod);
		s.close();
		return libroAutor;
	}
	
	protected void update(LibrosAutores libroAutor) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(libroAutor);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int cod) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		LibrosAutores libroAutor = new LibrosAutores();
		libroAutor.setId(cod);
		s.delete(libroAutor);
		s.getTransaction().commit();
		s.close();
	}

}
