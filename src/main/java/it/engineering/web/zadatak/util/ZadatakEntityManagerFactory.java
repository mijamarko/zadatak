package it.engineering.web.zadatak.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ZadatakEntityManagerFactory {
	
	private static ZadatakEntityManagerFactory instance;
	
	private EntityManagerFactory emf;

	private ZadatakEntityManagerFactory() {
		emf = Persistence.createEntityManagerFactory("zadatak");
	}
	
	public static EntityManagerFactory getInstance() {
		if (instance == null) instance = new ZadatakEntityManagerFactory();
		return instance.getEmf();
	}

	private EntityManagerFactory getEmf() {
		return emf;
	}
	
	public static void closeEmf() {
		if (instance != null) instance.getEmf().close();
	}
	
	

}
