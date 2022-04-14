package controllers;

import java.util.List;

import entities.Korisnik;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import persistence.ZadatakEntityManagerFactory;

public class KorisnikController {
	
	public void save(Korisnik korisnik) {
		EntityManager em = ZadatakEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		
		Long count = (Long) em.createQuery("select count(k) from Korisnik k where k.username = '" + korisnik.getUsername() +"'").getSingleResult();
		if(count == 0) {
			em.persist(korisnik);
		} else {
			throw new EntityExistsException("Korisnik sa tim podacima vec postoji.");
		}
		em.getTransaction().commit();
		em.close();
	}
	
	public Korisnik get(Long id) {
		EntityManager em = ZadatakEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		Korisnik k = em.find(Korisnik.class, id);
		if(k != null) {
			em.close();
			return k;
		} else {
			throw new EntityNotFoundException("Korisnik sa tim id ne postoji.");
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Korisnik> getAll() {
		EntityManager em = ZadatakEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		List<Korisnik> korisnici = em.createQuery("SELECT k FROM Korisnik k").getResultList();
		if(korisnici != null) {
			em.close();
			return korisnici;
		} else {
			throw new EntityNotFoundException("Korisnik sa tim id ne postoji.");
		}
	}
	
	public void update(Korisnik k) {
		EntityManager em = ZadatakEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(k);
		em.getTransaction().commit();
		em.close();
	}
	
	public void delete(Korisnik k) {
		EntityManager em = ZadatakEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(em);
		em.getTransaction().commit();
		em.close();
	}

}
