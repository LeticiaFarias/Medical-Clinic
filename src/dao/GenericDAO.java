package dao;

import java.util.List;

public interface GenericDAO<T> {

	public boolean persist(T entity); // Funcionando

	public T findById(int id);

	public List<T> findByNome(String nome); // Funcionando

	public List<T> findByEmail(String email); // Funcionando

	public List<T> findAll(); // Funcionando

	public boolean update(T entity);

	public boolean delete(String email, T entity); // Funcionando

	public void close(); // Funcionando;

}