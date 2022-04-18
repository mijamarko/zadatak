package it.engineering.web.zadatak.service.impl;

import java.util.ArrayList;
import java.util.List;

import it.engineering.web.zadatak.dao.CityDAO;
import it.engineering.web.zadatak.dao.impl.JpaCityDAOImpl;
import it.engineering.web.zadatak.dto.CityDTO;
import it.engineering.web.zadatak.entities.City;
import it.engineering.web.zadatak.service.CityService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class CityServiceImpl implements CityService {
	private EntityManager em;
	private CityDAO cityDao;

	public CityServiceImpl() {
		em = Persistence.createEntityManagerFactory("zadatak").createEntityManager();
		cityDao = new JpaCityDAOImpl(em);
	}
	
	private CityDTO convertToDTO(City city) {
		CityDTO cityDTO = new CityDTO();
		cityDTO.setName(city.getName());
		cityDTO.setZipCode(city.getZipCode());
		return cityDTO;
	}

	@Override
	public List<CityDTO> getAll() {
		List<City> cities = cityDao.getAll();
		List<CityDTO> citiesDTO = new ArrayList<CityDTO>();
		CityDTO cityDTO = new CityDTO();
		for (City city : cities) {
			cityDTO = convertToDTO(city);
			citiesDTO.add(cityDTO);
		}
		cityDTO = null;
		return citiesDTO;
	}

	@Override
	public CityDTO findById(Long zipCode) {
		City city = cityDao.findById(zipCode);
		return convertToDTO(city);
	}
	
	

}
