package it.engineering.web.zadatak.service.impl;

import java.util.List;

import it.engineering.web.zadatak.dao.CityDAO;
import it.engineering.web.zadatak.dao.impl.JpaCityDAOImpl;
import it.engineering.web.zadatak.entities.City;
import it.engineering.web.zadatak.service.CityService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

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
