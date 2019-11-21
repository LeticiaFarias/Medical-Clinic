package br.ufc.clinic.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import br.ufc.clinic.dao.GenericJPA_DAO;
import br.ufc.clinic.model.Cliente;
import br.ufc.clinic.model.Endereco;
import br.ufc.clinic.util.TextosUtil;

public class EnderecoController {

	public static Endereco cadastraEndereco(int id, String numero, String rua, String bairro, String complemento,
			String cep, Cliente cliente) {
		Endereco endereco = new Endereco(id, numero, rua, bairro, complemento, cep, cliente);

		try {
			GenericJPA_DAO<Endereco> genericDao = new GenericJPA_DAO<Endereco>();

			genericDao.persist(endereco);
			genericDao.close();
		} catch (IllegalStateException | PersistenceException e) {
			TextosUtil.erro();
			e.printStackTrace();
		}
		return endereco;
	}

	@SuppressWarnings("unchecked")
	public static List<Endereco> findByIdCliente(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Endereco.findById");

		query.setParameter(1, id);

		return query.getResultList();
	}

	public static void updateEndereco(int id, String numero, String rua, String bairro, String complemento,
			String cep) {
		GenericJPA_DAO<Endereco> genericDao = new GenericJPA_DAO<Endereco>();

		List<Endereco> enderecos = findByIdCliente(id);

		for (Endereco endereco : enderecos) {
			if (endereco.getCliente().equals(id)) {
				endereco.setNumero(numero);
				endereco.setRua(rua);
				endereco.setBairro(bairro);
				endereco.setComplemento(complemento);
				endereco.setCep(cep);

				genericDao.update(endereco);
			}
		}
	}
}
