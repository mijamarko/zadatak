package it.engineering.web.zadatak.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.zadatak.constants.WebConstants;
import it.engineering.web.zadatak.dto.CityDTO;
import it.engineering.web.zadatak.service.CityService;
import it.engineering.web.zadatak.service.impl.CityServiceImpl;

public class CityAction implements Action {
	
	CityService cityService;
	
	public CityAction() {
		cityService = new CityServiceImpl();
	}

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		if(req.getParameter("zipCode") == null) {
			List<CityDTO> cities = cityService.getAll();
			req.getSession().setAttribute("cities", cities);
			return WebConstants.PAGE_VIEW_CITIES;
		} else {
			CityDTO city = cityExists(req);
			if(city != null) {
				req.getSession().setAttribute("city", city);
				return WebConstants.PAGE_VIEW_CITY;
			} else {
				return null;
			}
		}
		
	}
	
	private CityDTO cityExists(HttpServletRequest req) {
		CityDTO city = cityService.findById(Long.parseLong(req.getParameter("zipCode")));
		if(city == null) {
			return null;
		} else return city;
	}

}
