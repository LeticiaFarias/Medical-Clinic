package br.ufc.clinic.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import br.ufc.clinic.dao.GenericJPA_DAO;
import br.ufc.clinic.model.Cliente;
import br.ufc.clinic.model.Telefone;
import br.ufc.clinic.util.TextosUtil;

public class TelefoneController {

	public static Telefone cadastraTelefone(int id, String ddd, String numero, Cliente cliente) {
		Telefone telefone = new Telefone(id, ddd, numero, cliente);

		try {
			GenericJPA_DAO<Telefone> genericDAO = new GenericJPA_DAO<Telefone>();

			genericDAO.persist(telefone);
			genericDAO.close();
		} catch (IllegalStateException | PersistenceException e) {
			TextosUtil.erro();
			e.printStackTrace();
		}
		return telefone;

	}

	@SuppressWarnings("unchecked")
	public static List<Telefone> findByEmail(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Telefone.findById");

		query.setParameter(1, id);

		return query.getResultList();
	}

	public static void delete(int id) {
		GenericJPA_DAO<Telefone> genericDAO = new GenericJPA_DAO<Telefone>();

		List<Telefone> telefones = findByEmail(id);

		for (Telefone telefone : telefones) {
			if (telefone.getId() == id) {
				// genericDAO.deleteId(id, telefone);
			} else {
				TextosUtil.emailInexistente();
			}
		}

	}

}
