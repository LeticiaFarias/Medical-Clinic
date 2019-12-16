package br.ufc.clinic.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import br.ufc.clinic.dao.GenericJPA_DAO;
import br.ufc.clinic.model.Administrador;
import br.ufc.clinic.util.TextosUtil;
import br.ufc.clinic.util.ValidaUtil;

public class AdministradorController {

	public static void cadastraAdm(int id, String nome, String email, String senha) {

		if (ValidaUtil.validaEmail(email) == 0) {
			String senhaCriptografada = ValidaUtil.criptografaSenha(senha);

			Administrador administrador = new Administrador(id, nome, email, senhaCriptografada);
			try {
				GenericJPA_DAO<Administrador> genericDAO = new GenericJPA_DAO<Administrador>();

				genericDAO.persist(administrador);
				genericDAO.close();
			} catch (IllegalStateException | PersistenceException e) {
				TextosUtil.erro();
				e.printStackTrace();
			}

		} else {
			TextosUtil.emailExistente();
		}

	}

	@SuppressWarnings("unchecked")
	public static List<Administrador> findByNome(String nome) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Administrador.findByNome");

		query.setParameter(1, nome);

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public static List<Administrador> findByEmail(String email) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Administrador.findByEmail");

		query.setParameter(1, email);

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public static List<Administrador> findAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Administrador.findAll");

		return query.getResultList();
	}

	public static void updateNome(String newNome, String email) {
		GenericJPA_DAO<Administrador> genericDao = new GenericJPA_DAO<Administrador>();

		List<Administrador> admAux = findByEmail(email);

		for (Administrador administrador : admAux) {
			if (administrador.getEmail().equals(email)) {
				administrador.setNome(newNome);

				genericDao.update(administrador);
			}
		}
	}

	public static void updateEmail(String newEmail, String email) {
		GenericJPA_DAO<Administrador> genericDao = new GenericJPA_DAO<Administrador>();

		List<Administrador> admAux = findByEmail(email);

		for (Administrador administrador : admAux) {
			if (administrador.getEmail().equals(email)) {
				administrador.setEmail(newEmail);

				genericDao.update(administrador);
			}
		}
	}

	public static void updateSenha(String newSenha, String email) {
		GenericJPA_DAO<Administrador> genericDao = new GenericJPA_DAO<Administrador>();

		List<Administrador> admAux = findByEmail(email);

		for (Administrador administrador : admAux) {
			if (administrador.getEmail().equals(email)) {
				administrador.setSenha(ValidaUtil.criptografaSenha(newSenha));

				genericDao.update(administrador);
			}
		}
	}

	public static void delete(String email) {
		GenericJPA_DAO<Administrador> genericDAO = new GenericJPA_DAO<Administrador>();

		List<Administrador> administradores = findByEmail(email);

		for (Administrador administrador : administradores) {
			if (administrador.getEmail().equals(email)) {
				genericDAO.delete(email);
			} else {
				TextosUtil.emailInexistente();
			}
		}

	}

	public static boolean login(String email, String senha) {
		return Administrador.loginAdm(email, senha);
	}
}
