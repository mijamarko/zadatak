package it.engineering.web.zadatak.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApplicationController {
	
	public String processRequest(HttpServletRequest req, HttpServletResponse res) {
		String method = req.getMethod();
		String path = req.getPathInfo();
		
		return null;
		
	}

}
