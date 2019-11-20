package br.ufc.clinic.controller;

import java.sql.Date;
import java.util.ArrayList;
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
import br.ufc.clinic.util.ValidaUtil;

public class ClienteController {

	public static void cadastraCliente(String cpf, String nome, String email, String senha,
			/* Endereco endereco, */ int ddd, int numero, Date dataAniver) {

		if (ValidaUtil.validaEmailCliente(email) == false) {
			String senhaCriptografada = ValidaUtil.criptografaSenha(senha);

			Cliente cliente = new Cliente(cpf, nome, email, senhaCriptografada, null, dataAniver);
			try {
				GenericJPA_DAO<Cliente> genericDAO = new GenericJPA_DAO<Cliente>();

				genericDAO.persist(cliente);
				genericDAO.close();

				Telefone telefone = TelefoneController.cadastraTelefoneByProprietario(0, ddd, numero, cliente);
				List<Telefone> telefones = new ArrayList<Telefone>();
				telefones.add(telefone);
			} catch (IllegalStateException | PersistenceException e) {
				TextosUtil.erro();
				e.printStackTrace();
			}

		} else {
			TextosUtil.emailExistente();
		}

	}

	@SuppressWarnings("unchecked")
	public static List<Cliente> findByNome(String nome) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Cliente.findByNome");

		query.setParameter(1, nome);

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public static List<Cliente> findByEmail(String email) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Cliente.findByEmail");

		query.setParameter(1, email);

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public static List<Cliente> findAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Cliente.findAll");

		return query.getResultList();
	}

	public static void delete(String email) {
		GenericJPA_DAO<Cliente> genericDAO = new GenericJPA_DAO<Cliente>();

		List<Cliente> clientes = findByEmail(email);

		TelefoneController.delete(clientes.get(0).getTelefones().get(0).getId());

		for (Cliente cliente : clientes) {
			if (cliente.getEmail().equals(email)) {
				// genericDAO.delete(email, cliente);
			} else {
				TextosUtil.emailInexistente();
			}
		}

	}

}
