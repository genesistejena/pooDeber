package net.ug.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoLibros {
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
	
	protected void crear(Libros libro) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(libro);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Libros read(long cod_lib)  {
		Session s =  sessionFactory.openSession();
		Libros libro = s.get(Libros.class, cod_lib);
		s.close();
		return libro;
	}
	
	
	protected void update(Libros libro) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(libro);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int cod_lib) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Libros libro= new Libros();
		libro.setId(cod_lib);
		s.delete(libro);
		s.getTransaction().commit();
		s.close();
	}

}
