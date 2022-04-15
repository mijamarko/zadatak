package it.engineering.web.zadatak.dao;

import java.util.List;

import it.engineering.web.zadatak.entities.User;

public interface UserDAO {
	List<User> getAll();
}
