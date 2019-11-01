package exemplo;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

public class GenericJPADAO<T> implements GenericDAO<T> {

	private Class<T> persistenceClass;

	public GenericJPADAO(Class<T> persistenceClass) {
		this.persistenceClass = persistenceClass;
	}

	@Override
	public void save(T entity) {
		JPAUtil.getEntityManager().merge(entity);
	}

	@Override
	public void delete(T entity) {
		JPAUtil.getEntityManager().remove(JPAUtil.getEntityManager().merge(entity));
	}

	@Override
	public T find(Object id) {
		return JPAUtil.getEntityManager().find(persistenceClass, id);
	}

	@Override
	public List<T> findAll() {
		CriteriaQuery<T> cq = JPAUtil.getEntityManager().getCriteriaBuilder().createQuery(persistenceClass);
		cq.from(persistenceClass);
		return JPAUtil.getEntityManager().createQuery(cq).getResultList();
	}

	@Override
	public void beginTransaction() {
		JPAUtil.beginTransaction();
	}

	@Override
	public void commit() {
		JPAUtil.commit();
	}

	@Override
	public void rollback() {
		JPAUtil.rollback();
	}

	@Override
	public void close() {
		JPAUtil.closeEntityManager();
	}

	@Override
	public void deleteById(Object id) {
		delete(find(id));
	}

}
