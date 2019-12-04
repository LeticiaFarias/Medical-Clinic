package br.ufc.clinic.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import br.ufc.clinic.dao.GenericJPA_DAO;
import br.ufc.clinic.model.Atendente;
import br.ufc.clinic.util.TextosUtil;
import br.ufc.clinic.util.ValidaUtil;

public class AtendenteController {

	public static void cadastraAtendente(String cpf, String nome, String email, String senha) {

		if (ValidaUtil.validaCpfAtendente(cpf) == false) {
			if (ValidaUtil.validaEmail(email) == 0) {
				String senhaCriptografada = ValidaUtil.criptografaSenha(senha);

				Atendente atendente = new Atendente(0, cpf, nome, email, senhaCriptografada);

				try {
					GenericJPA_DAO<Atendente> genericDAO = new GenericJPA_DAO<Atendente>();

					genericDAO.persist(atendente);
					genericDAO.close();
				} catch (IllegalStateException | PersistenceException e) {
					TextosUtil.erro();
					e.printStackTrace();
				}

			} else {
				TextosUtil.emailExistente();
			}
		} else {
			TextosUtil.cpfExistente();
		}
	}

	@SuppressWarnings("unchecked")
	public static List<Atendente> findByNome(String nome) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Atendente.findByNome");

		query.setParameter(1, nome);

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public static List<Atendente> findByEmail(String email) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Atendente.findByEmail");

		query.setParameter(1, email);

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public static List<Atendente> findAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Atendente.findAll");

		return query.getResultList();
	}

	public static void updateNome(String newNome, String email) {
		GenericJPA_DAO<Atendente> genericDao = new GenericJPA_DAO<Atendente>();

		List<Atendente> atendenteAux = findByEmail(email);

		for (Atendente atendente : atendenteAux) {
			if (atendente.getEmail().equals(email)) {
				atendente.setNome(newNome);

				genericDao.update(atendente);
			}
		}
	}

	public static void updateCpf(String newCpf, String email) {
		GenericJPA_DAO<Atendente> genericDao = new GenericJPA_DAO<Atendente>();

		List<Atendente> atendenteAux = findByEmail(email);

		for (Atendente atendente : atendenteAux) {
			if (atendente.getEmail().equals(email)) {
				atendente.setCpf(newCpf);

				genericDao.update(atendente);
			}
		}
	}

	public static void updateEmail(String newEmail, String email) {
		GenericJPA_DAO<Atendente> genericDao = new GenericJPA_DAO<Atendente>();

		List<Atendente> atendenteAux = findByEmail(email);

		for (Atendente atendente : atendenteAux) {
			if (atendente.getEmail().equals(email)) {
				atendente.setEmail(newEmail);

				genericDao.update(atendente);
			}
		}
	}

	public static void updateSenha(String newSenha, String email) {
		GenericJPA_DAO<Atendente> genericDao = new GenericJPA_DAO<Atendente>();

		List<Atendente> atendenteAux = findByEmail(email);

		for (Atendente atendente : atendenteAux) {
			if (atendente.getEmail().equals(email)) {
				atendente.setSenha(ValidaUtil.criptografaSenha(newSenha));

				genericDao.update(atendente);
			}
		}
	}

	public static void delete(String email) {
		GenericJPA_DAO<Atendente> genericDAO = new GenericJPA_DAO<Atendente>();

		List<Atendente> atendentes = findByEmail(email);

		for (Atendente atendente : atendentes) {
			if (atendente.getEmail().equals(email)) {
				// genericDAO.delete(email, atendente);
			} else {
				TextosUtil.emailInexistente();
			}
		}

	}

	public static boolean login(String email, String senha) {
		return Atendente.loginAtendente(email, senha);
	}
}
