package it.engineering.web.zadatak.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import it.engineering.web.zadatak.dao.UserDAO;
import it.engineering.web.zadatak.dao.impl.JpaUserDAOImpl;
import it.engineering.web.zadatak.dto.UserDTO;
import it.engineering.web.zadatak.entities.User;
import it.engineering.web.zadatak.service.UserService;

public class UserServiceImpl implements UserService {
	private EntityManager em;
	private UserDAO userDAO;

	public UserServiceImpl() {
		em = Persistence.createEntityManagerFactory("zadatak").createEntityManager();
		userDAO = new JpaUserDAOImpl(em);
	}

	@Override
	public UserDTO login(String username, String password) {
		List<User> users = userDAO.getAll();
		for (User user : users) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				UserDTO userDTO = new UserDTO();
				userDTO.setEmail(user.getEmail());
				userDTO.setUsername(user.getUsername());
				return userDTO;
			}
		}
		return null;
	}
	
	

}
