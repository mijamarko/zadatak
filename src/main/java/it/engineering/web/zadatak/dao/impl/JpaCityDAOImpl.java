package it.engineering.web.zadatak.dao.impl;

import java.util.List;

import it.engineering.web.zadatak.dao.CityDAO;
import it.engineering.web.zadatak.entities.City;
import jakarta.persistence.EntityManager;

public class JpaCityDAOImpl implements CityDAO {

	private EntityManager em;

	public JpaCityDAOImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<City> getAll() {
		return em.createQuery("SELECT c FROM City c", City.class).getResultList();
	}

	@Override
	public City findById(Long zipCode) {
		return em.createQuery("SELECT c FROM City c WHERE c.zipCode ='" + zipCode +"'", City.class).getSingleResult();
	}

	@Override
	public void editCity(Long zipCode, String newName) {
		em.createQuery("UPDATE CITY c SET c.name = '" + newName + "' WHERE c.zip_code = '" + zipCode + "'");
	}

	@Override
	public void deleteCity(Long zipCode) {
		em.createQuery("DELETE FROM CITY c WHERE c.zip_code = '" + zipCode + "'");
	}
	
	

}
