package it.engineering.web.zadatak.dao.impl;

import java.util.List;

import it.engineering.web.zadatak.dao.UserDAO;
import it.engineering.web.zadatak.entities.User;
import jakarta.persistence.EntityManager;

public class JpaUserDAOImpl implements UserDAO {
	
	private EntityManager em;
	
	public JpaUserDAOImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<User> getAll() {
		return em.createQuery("SELECT u FROM User u", User.class).getResultList();
	}



	
	
	

}
