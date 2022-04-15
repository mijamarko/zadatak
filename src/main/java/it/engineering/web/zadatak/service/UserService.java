package it.engineering.web.zadatak.service;

import it.engineering.web.zadatak.dto.UserDTO;

public interface UserService {
	
	UserDTO login(String username, String password);

}
