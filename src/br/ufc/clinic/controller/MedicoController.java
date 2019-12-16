package br.ufc.clinic.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import br.ufc.clinic.dao.GenericJPA_DAO;
import br.ufc.clinic.model.Medico;
import br.ufc.clinic.model.Atendente;
import br.ufc.clinic.util.TextosUtil;
import br.ufc.clinic.util.ValidaUtil;

public class MedicoController {

	public static void cadastraMedico(String crm, String nome, String email, String senha, String especialidade) {

		if (ValidaUtil.validaEmail(email) == 0) {

			Medico medico = Atendente.cadastraMedico(0, crm, nome, email, senha, especialidade);
			try {
				GenericJPA_DAO<Medico> genericDAO = new GenericJPA_DAO<Medico>();

				genericDAO.persist(medico);
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
	public static List<Medico> findByNome(String nome) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Medico.findByNome");

		query.setParameter(1, nome);

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public static List<Medico> findByEmail(String email) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Medico.findByEmail");

		query.setParameter(1, email);

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public static List<Medico> findAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Medico.findAll");

		return query.getResultList();
	}

	public static void updateNome(String newNome, String email) {
		GenericJPA_DAO<Medico> genericDao = new GenericJPA_DAO<Medico>();

		List<Medico> medicoAux = findByEmail(email);

		for (Medico medico : medicoAux) {
			if (medico.getEmail().equals(email)) {
				medico.setNome(newNome);

				genericDao.update(medico);
			}
		}
	}

	public static void updateEmail(String newEmail, String email) {
		GenericJPA_DAO<Medico> genericDao = new GenericJPA_DAO<Medico>();

		List<Medico> medicoAux = findByEmail(email);

		for (Medico medico : medicoAux) {
			if (medico.getEmail().equals(email)) {
				medico.setEmail(newEmail);

				genericDao.update(medico);
			}
		}
	}

	public static void updateSenha(String newSenha, String email) {
		GenericJPA_DAO<Medico> genericDao = new GenericJPA_DAO<Medico>();

		List<Medico> medicoAux = findByEmail(email);

		for (Medico medico : medicoAux) {
			if (medico.getEmail().equals(email)) {
				medico.setSenha(ValidaUtil.criptografaSenha(newSenha));

				genericDao.update(medico);
			}
		}
	}

	public static void updateCRM(String newCrm, String email) {
		GenericJPA_DAO<Medico> genericDao = new GenericJPA_DAO<Medico>();

		List<Medico> medicoAux = findByEmail(email);

		for (Medico medico : medicoAux) {
			if (medico.getEmail().equals(email)) {
				medico.setCrm(newCrm);

				genericDao.update(medico);
			}
		}
	}

	public static boolean login(String crm, String senha) {
		return Medico.loginMedico(crm, senha);
	}

}
