package persistence.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
	
	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable e) {
			System.out.println("Factory initialization did not succeed.");
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getInstance() {
		return sessionFactory;
	}

}
