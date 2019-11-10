package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.Table;

import dao.GenericJPA_DAO;
import exemplo.Contato;
import exemplo.JPAUtil;
import util.TextosUtil;
import util.ValidaUtil;

@Entity
@NamedQueries({ @NamedQuery(name = "Administrador.findAll", query = "from Administrador"),
		@NamedQuery(name = "Administrador.findByNome", query = "from Administrador a where a.nome = ?1"),
		@NamedQuery(name = "Administrador.findByEmail", query = "from Administrador a where a.email = ?1") })
public class Administrador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "administrador_id")
	private int id;
	private String nome;
	private String email; // O email servirá como login;
	private String senha;

	public Administrador() {

	}

	public Administrador(int id, String nome, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void cadastraAdm(int id, String nome, String email, String senha) {

		if (ValidaUtil.validaAdm(email) == false) {
			String senhaCriptografada = ValidaUtil.criptografaSenha(senha);

			Administrador administrador = new Administrador(id, nome, email, senhaCriptografada);
			try {
				GenericJPA_DAO<Administrador> genericDAO = new GenericJPA_DAO<Administrador>();

				genericDAO.persist(administrador);
				genericDAO.close();
			} catch (IllegalStateException | PersistenceException e) {
				TextosUtil.erro();
				e.printStackTrace();
			}

		} else {
			TextosUtil.emailExistente();
		}

	}

	public List<Administrador> findByNome(String nome) {
		GenericJPA_DAO<Administrador> genericDAO = new GenericJPA_DAO<Administrador>();

		List<Administrador> administradores = genericDAO.findByNome(nome);

		return administradores;
	}

	public List<Administrador> findByEmail(String email) {
		GenericJPA_DAO<Administrador> genericDAO = new GenericJPA_DAO<Administrador>();

		List<Administrador> administradores = genericDAO.findByEmail(email);

		return administradores;
	}

	public List<Administrador> findByAll() {
		GenericJPA_DAO<Administrador> genericDAO = new GenericJPA_DAO<Administrador>();

		List<Administrador> administradores = genericDAO.findAll();

		return administradores;
	}

	public void delete(String email) {
		GenericJPA_DAO<Administrador> genericDAO = new GenericJPA_DAO<Administrador>();

		List<Administrador> administradores = findByEmail(email);

		for (Administrador administrador : administradores) {
			if (administrador.getEmail().equals(email)) {
				genericDAO.delete(email, administrador);
			} else {
				TextosUtil.emailInexistente();
			}
		}

	}

	public String toString() {
		return "Usuário Administrador\nId: " + this.id + "\nNome: " + this.nome + "\nEmail: " + this.email + "\nSenha: "
				+ this.senha + "\n";
	}

}
