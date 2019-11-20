package br.ufc.clinic.controller;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import br.ufc.clinic.dao.GenericJPA_DAO;
import br.ufc.clinic.model.Agenda;
import br.ufc.clinic.model.Atendente;
import br.ufc.clinic.util.TextosUtil;

public class AgendaController {

	public static void cadastraAgenda(String nomeMedico, String nomeCliente, String cpfCliente, Date date,
			String horario) {
		try {
			GenericJPA_DAO<Agenda> genericDAO = new GenericJPA_DAO<Agenda>();

			genericDAO.persist(Atendente.cadastrarAgenda(0, nomeMedico, nomeCliente, cpfCliente, date, horario));
			genericDAO.close();
		} catch (IllegalStateException | PersistenceException e) {
			TextosUtil.erro();
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static List<Agenda> findAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Agenda.findAll");

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public static List<Agenda> findByData(String data) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Agenda.findByData");

		return query.getResultList();
	}
}
