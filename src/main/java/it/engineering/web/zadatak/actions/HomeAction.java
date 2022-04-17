package it.engineering.web.zadatak.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.zadatak.constants.WebConstants;

public class HomeAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		return WebConstants.PAGE_HOME;
	}

}
