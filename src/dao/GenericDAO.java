package dao;

import java.util.List;

public interface GenericDAO<T> {

	public boolean persist(T entity);

	public boolean update(T entity);

	public List<T> findAll();

	public List<T> finByNome(String nome);

	public List<T> findById(int id, Object t);

	public boolean delete(int id, T entity);

}