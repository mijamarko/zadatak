package it.engineering.web.zadatak.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.engineering.web.zadatak.constants.WebConstants;
import it.engineering.web.zadatak.dto.UserDTO;
import it.engineering.web.zadatak.service.UserService;
import it.engineering.web.zadatak.service.impl.UserServiceImpl;

public class LoginAction implements Action {
	
	private UserService userService;
	
	public LoginAction() {
		userService = new UserServiceImpl();
	}

	@SuppressWarnings("unchecked")
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		if (req.getMethod() == "GET") {
			return WebConstants.PAGE_LOGIN;
		} else {
			UserDTO user = login(req);
			if (user != null) {
				HttpSession session = req.getSession(true);
				session.setAttribute("loggedInUser", user);
				ArrayList<UserDTO> users = (ArrayList<UserDTO>) session.getServletContext().getAttribute("loggedInUsers");
				users.add(user);
				return WebConstants.PAGE_INDEX;
			} else {
				req.setAttribute("login_failed", true);
				req.setAttribute("error_message", "No such user. Please try again.");
				return WebConstants.PAGE_LOGIN;
			}
		}
		
	}
	
	private UserDTO login(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		UserDTO user = userService.login(username, password);
		if (user == null) {
			return null;
		} else {
			return user;
		}
		
	}

}
