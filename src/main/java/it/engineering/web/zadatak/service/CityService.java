package it.engineering.web.zadatak.service;

import java.util.List;

import it.engineering.web.zadatak.dto.CityDTO;

public interface CityService {
	List<CityDTO> getAll();
	CityDTO findById(Long zipCode);
}
