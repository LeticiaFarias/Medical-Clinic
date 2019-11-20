package br.ufc.clinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import br.ufc.clinic.controller.AtendenteController;
import br.ufc.clinic.util.TextosUtil;
import br.ufc.clinic.util.ValidaUtil;

@Entity
@NamedQueries({ @NamedQuery(name = "Administrador.findAll", query = "from Administrador"),
		@NamedQuery(name = "Administrador.findByNome", query = "from Administrador a where a.nome = ?1"),
		@NamedQuery(name = "Administrador.findByEmail", query = "from Administrador a where a.email = ?1"),
		@NamedQuery(name = "Administrador.delete", query = "from Administrador a where a.email = ?1") })
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

	public static void loginAdm(String email, String senha) {
		if (ValidaUtil.validaEmailAdm(email) == true) {
			if (ValidaUtil.validaSenhaAdm(email, senha) == true) {
				System.out.println("\nBem vindo!\n");
			} else {
				TextosUtil.senhaIncorreta();
			}
		} else {
			TextosUtil.emailInexistente();
		}
	}

	public String toString() {
		return "\nUsuário Administrador\nId: " + this.id + "\nNome: " + this.nome + "\nEmail: " + this.email
				+ "\nSenha: " + this.senha + "\n";
	}

}