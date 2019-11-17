package net.ug.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import net.ug.hibernate.Autores;

public class DaoAutores {
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
	
	public void crear(Autores autor) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(autor);
		s.getTransaction().commit();
		s.close();
	}
	
	public Autores read(long id_aut) {
		Session s =  sessionFactory.openSession();
		Autores autor = s.get(Autores.class, id_aut);
		s.close();
		return autor;
	}
	
	public void update(Autores autor) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(autor);
		s.getTransaction().commit();
		s.close();
	}
	
	
	public void delete(int id_aut) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Autores autor = new Autores();
		autor.setId(id_aut);
		s.delete(autor);
		s.getTransaction().commit();
		s.close();
	}

}
