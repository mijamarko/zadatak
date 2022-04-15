package it.engineering.web.zadatak.dao.impl;

import javax.persistence.EntityManager;

import it.engineering.web.zadatak.dao.CityDAO;

public class JpaCityDAOImpl implements CityDAO {
	
	private EntityManager em;

	public JpaCityDAOImpl(EntityManager em) {
		this.em = em;
	}

}
