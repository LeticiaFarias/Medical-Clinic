package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import exemplo.Contato;
import exemplo.ContatoDAO;
import exemplo.ContatoJPADAO;
import exemplo.JPAUtil;

import java.util.List;

public class GenericJPA_DAO<T> implements GenericDAO<T> {
	private EntityTransaction transaction;
	private EntityManager entityManager;

	private final Class<T> type;

	// Funcionando:
	public GenericJPA_DAO(Class<T> type) {
		this.type = type;
		this.entityManager = JPAUtil.getEntityManager();
		this.transaction = entityManager.getTransaction();
	}

	// Funcionando;
	public boolean persist(T entity) {
		try {
			transaction.begin();
			entityManager.persist(entity);
			transaction.commit();
			return true;
		} catch (PersistenceException e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public boolean update(T entity) {
		try {
			transaction.begin();
			entityManager.merge(entity);
			transaction.commit();
			return true;
		} catch (PersistenceException e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public List<T> findAll() {
		return null;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> finByNome(String nome) {
		EntityManager em = JPAUtil.getEntityManager();
		Query query = em.createNamedQuery("SELECT a FROM Administradores a WHERE a.nome = nome");
		
		query.setParameter(1, nome);
		
		return query.getResultList();
	}

	@Override
	public List<T> findById(int id, Object t) {
		return null;

	}

	@Override
	public boolean delete(int id, T entity) {
		try {
			transaction.begin();
			entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
			transaction.commit();
			return true;

		} catch (PersistenceException e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		} finally {
			entityManager.close();
		}
	}

}
