package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import exemplo.JPAUtil;
import model.Administrador;

import java.util.List;

public class GenericJPA_DAO<T> implements GenericDAO<T> {
	private EntityTransaction transaction;
	private EntityManager entityManager;

	private Class<T> persistenceClass;

	// Funcionando:
	public GenericJPA_DAO() {
		this.persistenceClass = persistenceClass;
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
	public T findById(int id) {
		return null;
	}

	// Funcionando
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByNome(String nome) {
		Query query = entityManager.createNamedQuery("Administrador.findByNome");

		query.setParameter(1, nome);

		return query.getResultList();
	}

	// Funcionando
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByEmail(String email) {
		Query query = entityManager.createNamedQuery("Administrador.findByEmail");

		query.setParameter(1, email);

		return query.getResultList();
	}

	// Funcionando
	@Override
	public List<T> findAll() {
		Query query = entityManager.createNamedQuery("Administrador.findAll");

		return query.getResultList();
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
	public boolean delete(String email, T entity) {
		try {
			transaction.begin();

			entityManager.remove(entity);

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
	public void close() {
		JPAUtil.closeEntityManager();
	}

}
