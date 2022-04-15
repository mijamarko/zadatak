package it.engineering.web.zadatak.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import it.engineering.web.zadatak.dao.CityDAO;
import it.engineering.web.zadatak.dao.impl.JpaCityDAOImpl;
import it.engineering.web.zadatak.entities.City;
import it.engineering.web.zadatak.service.CityService;

public class CityServiceImpl implements CityService {
	private EntityManager em;
	private CityDAO cityDao;

	private CityServiceImpl() {
		em = Persistence.createEntityManagerFactory("zadatak").createEntityManager();
		cityDao = new JpaCityDAOImpl(em);
	}

	@Override
	public List<City> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
