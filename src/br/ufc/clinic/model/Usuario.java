package br.ufc.clinic.model;

import br.ufc.clinic.util.TextosUtil;
import br.ufc.clinic.util.ValidaUtil;

public abstract class Usuario {

	private int id;
	private String nome;
	private String email;
	private String senha;

	public Usuario() {

	}

	public Usuario(int id, String nome, String email, String senha) {
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

	@Override
	public String toString() {
		return "\nID: " + this.id + "\nNome: " + this.nome + "\nEmail: " + this.email + "\nSenha: " + this.senha + "\n";
	}

	/*
	public static void login(String email, String senha) {
		if (ValidaUtil.validaEmail(email) == true) {
			if (ValidaUtil.validaSenha(email, senha) == true) {
				System.out.println("\nBem vindo!\n");
			} else {
				TextosUtil.senhaIncorreta();
			}
		} else {
			TextosUtil.emailInexistente();

		}
	}
	*/

}
