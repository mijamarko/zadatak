package persistence;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ZadatakEntityManagerFactory {

	private static ZadatakEntityManagerFactory instance;

	private static EntityManagerFactory emf;

	private ZadatakEntityManagerFactory() {
		emf = Persistence.createEntityManagerFactory("zadatak");
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		if (instance == null) {
			instance = new ZadatakEntityManagerFactory();
		}
		return instance.getEmf();
	}

	private EntityManagerFactory getEmf() {
		return emf;
	}

	public static void closeEntityManagerFactory() {
		if (instance != null)
			instance.getEmf().close();
	}

}
