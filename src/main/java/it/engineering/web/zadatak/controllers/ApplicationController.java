package it.engineering.web.zadatak.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.engineering.web.zadatak.actions.Action;
import it.engineering.web.zadatak.actions.ActionFactory;

public class ApplicationController {
	
	public String processRequest(HttpServletRequest req, HttpServletResponse res) {
		Action action = accessControl(req);
		
		return action.execute(req, res);
	}
	
	private Action accessControl(HttpServletRequest req) {
		Action action = ActionFactory.createAction(req.getPathInfo());
		HttpSession session = req.getSession();
		if(session.getAttribute("loggedInUser") == null) {
			action = ActionFactory.createAction("/login");
		}
		
		return action;
	}

}
