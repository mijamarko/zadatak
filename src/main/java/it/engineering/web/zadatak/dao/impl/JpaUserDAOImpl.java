package it.engineering.web.zadatak.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import it.engineering.web.zadatak.dao.UserDAO;
import it.engineering.web.zadatak.entities.User;

public class JpaUserDAOImpl implements UserDAO {
	
	private EntityManager em;
	
	public JpaUserDAOImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<User> getAll() {
		return em.createQuery("SELECT u FROM USER u", User.class).getResultList();
	}



	
	
	

}
