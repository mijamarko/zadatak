package it.engineering.web.zadatak.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.zadatak.constants.WebConstants;
import it.engineering.web.zadatak.service.UserService;
import it.engineering.web.zadatak.service.impl.UserServiceImpl;

public class LoginAction implements Action {
	
	private UserService userService;
	
	public LoginAction() {
		userService = new UserServiceImpl();
	}

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		if (req.getMethod() == "GET") {
			return WebConstants.PAGE_LOGIN;
		} else {
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			
			return userService.login(username, password);
		}
		
	}

}
