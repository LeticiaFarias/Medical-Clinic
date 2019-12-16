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
import br.ufc.clinic.model.Atendente;
import br.ufc.clinic.model.Cliente;
import br.ufc.clinic.model.Endereco;
import br.ufc.clinic.model.Telefone;
import br.ufc.clinic.util.TextosUtil;
import br.ufc.clinic.util.ValidaUtil;

public class ClienteController {

	public static void cadastraCliente(String cpf, String nome, String email, String senha, String ddd, String numero,
			String dataAniver, String num, String rua, String bairro, String complemento, String cep) {

		if (ValidaUtil.validaEmail(email) == 0) {
			if (ValidaUtil.validaCpf(cpf) == true) {

				Date data = (Date) TextosUtil.formatData(dataAniver);
				Cliente cliente = Atendente.cadastraCliente(cpf, nome, email, senha, ddd, numero, data, num, rua,
						bairro, complemento, cep);

				try {
					GenericJPA_DAO<Cliente> genericDAO = new GenericJPA_DAO<Cliente>();

					genericDAO.persist(cliente);
					genericDAO.close();

					Telefone telefone = TelefoneController.cadastraTelefone(0, ddd, numero, cliente);
					List<Telefone> telefones = new ArrayList<Telefone>();
					telefones.add(telefone);

					Endereco endereco = EnderecoController.cadastraEndereco(0, num, rua, bairro, complemento, cep,
							cliente);
					List<Endereco> enderecos = new ArrayList<Endereco>();
					enderecos.add(endereco);
				} catch (IllegalStateException | PersistenceException e) {
					TextosUtil.erro();
					e.printStackTrace();
				}
			} else {
				TextosUtil.cpfExistente();
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

	public static void updateNome(String newNome, String email) {
		GenericJPA_DAO<Cliente> genericDao = new GenericJPA_DAO<Cliente>();

		List<Cliente> clienteAux = findByEmail(email);

		for (Cliente cliente : clienteAux) {
			if (cliente.getEmail().equals(email)) {
				cliente.setNome(newNome);

				genericDao.update(cliente);
			}
		}
	}

	public static void updateCpf(String newCpf, String email) {
		if (ValidaUtil.validaCpf(newCpf) == false) {
			GenericJPA_DAO<Cliente> genericDao = new GenericJPA_DAO<Cliente>();

			List<Cliente> clienteAux = findByEmail(email);

			for (Cliente cliente : clienteAux) {
				if (cliente.getEmail().equals(email)) {
					cliente.setCpf(newCpf);

					genericDao.update(cliente);
				}
			}
		} else {
			TextosUtil.cpfInvalido();
		}
	}

	public static void updateEmail(String newEmail, String email) {
		if (ValidaUtil.validaEmail(newEmail) == 0) {

			GenericJPA_DAO<Cliente> genericDao = new GenericJPA_DAO<Cliente>();

			List<Cliente> clienteAux = findByEmail(email);

			for (Cliente cliente : clienteAux) {
				if (cliente.getEmail().equals(email)) {
					cliente.setEmail(newEmail);

					genericDao.update(cliente);
				}
			}
		} else {
			TextosUtil.emailExistente();
		}
	}

	public static void updateSenha(String newSenha, String email) {
		GenericJPA_DAO<Cliente> genericDao = new GenericJPA_DAO<Cliente>();

		List<Cliente> clienteAux = findByEmail(email);

		for (Cliente cliente : clienteAux) {
			if (cliente.getEmail().equals(email)) {
				cliente.setSenha(ValidaUtil.criptografaSenha(newSenha));

				genericDao.update(cliente);
			}
		}
	}

	public static void updateDataAniver(Date newData, String email) {
		GenericJPA_DAO<Cliente> genericDao = new GenericJPA_DAO<Cliente>();

		List<Cliente> clienteAux = findByEmail(email);

		for (Cliente cliente : clienteAux) {
			if (cliente.getEmail().equals(email)) {
				cliente.setDataAniver(newData);

				genericDao.update(cliente);
			}
		}
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
