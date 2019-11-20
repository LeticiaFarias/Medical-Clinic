package br.ufc.clinic.dao;

import java.util.List;

public interface GenericDAO<T> {

	public boolean persist(T entity); // Funcionando

	public T findById(int id);

	public List<T> findByNome(String nome); // Funcionando

	public List<T> findByEmail(String email); // Funcionando

	public List<T> findAll(); // Funcionando

	public boolean update(T entity); // Funcionando

	public T delete(String email);

	public void close(); // Funcionando;

}