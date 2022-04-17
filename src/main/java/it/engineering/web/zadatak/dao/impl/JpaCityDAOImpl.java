package it.engineering.web.zadatak.dao.impl;

import it.engineering.web.zadatak.dao.CityDAO;
import jakarta.persistence.EntityManager;

public class JpaCityDAOImpl implements CityDAO {

	private EntityManager em;

	public JpaCityDAOImpl(EntityManager em) {
		this.em = em;
	}

}
