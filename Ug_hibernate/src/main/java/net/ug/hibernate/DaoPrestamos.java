package net.ug.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoPrestamos {
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
	
	protected void crear(Prestamos prestamo) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(prestamo);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Prestamos read(long cod_pres) {
		Session s =  sessionFactory.openSession();
		Prestamos prestamo = s.get(Prestamos.class, cod_pres);
		s.close();
		return prestamo;
	}
	
	protected void update(Prestamos prestamo) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(prestamo);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int cod) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Prestamos prestamo= new Prestamos();
		prestamo.setId(cod);
		s.delete(prestamo);
		s.getTransaction().commit();
		s.close();
	}

}