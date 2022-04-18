package it.engineering.web.zadatak.dao;

import java.util.List;

import it.engineering.web.zadatak.entities.City;

public interface CityDAO {
	List<City> getAll();
	City findById(Long zipCode);
	void editCity(Long zipCode, String newName);
	void deleteCity(Long zipCode);
}
