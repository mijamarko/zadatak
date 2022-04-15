package it.engineering.web.zadatak.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.zadatak.constants.WebConstants;

public class LogoutAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		req.getSession().invalidate();
		return WebConstants.PAGE_INDEX;
	}

}
