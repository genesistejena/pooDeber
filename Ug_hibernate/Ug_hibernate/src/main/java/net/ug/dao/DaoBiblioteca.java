package net.ug.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import net.ug.hibernate.Biblioteca;

public class DaoBiblioteca {
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
	
	public void crear(Biblioteca biblioteca) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(biblioteca);
		s.getTransaction().commit();
		s.close();
	}
	
	public Biblioteca read(long id_bibli) {
		Session s =  sessionFactory.openSession();
		Biblioteca biblioteca = s.get(Biblioteca.class, id_bibli);
		s.close();
		return biblioteca;
	}
	
	public void update(Biblioteca biblioteca) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(biblioteca);
		s.getTransaction().commit();
		s.close();
	}
	
	
	public void delete(int id_bibli) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.setId(id_bibli);
		s.delete(biblioteca);
		s.getTransaction().commit();
		s.close();
	}

}

