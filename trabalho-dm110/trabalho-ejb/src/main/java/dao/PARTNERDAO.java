package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Partner;

@Stateless
public class PARTNERDAO {

	@PersistenceContext(unitName = "partner_pu")
	private EntityManager em;

	public List<Partner> listAll() {
		Query query = em.createQuery("from Partner *", Partner.class);
		return query.getResultList();
	}

	public void insert(Partner partner) {
		em.persist(partner);
	}
}
