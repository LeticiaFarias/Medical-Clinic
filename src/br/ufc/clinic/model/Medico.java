package br.ufc.clinic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import br.ufc.clinic.util.TextosUtil;
import br.ufc.clinic.util.ValidaUtil;

@Entity
@NamedQueries({ @NamedQuery(name = "Medico.findAll", query = "from Medico"),
		@NamedQuery(name = "Medico.findByNome", query = "from Medico a where a.nome = ?1"),
		@NamedQuery(name = "Medico.findByEmail", query = "from Medico a where a.email = ?1") })
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String crm;
	private String nome;
	private String email; // Email é o Login;
	private String senha;
	private String especialidade;

	public Medico() {

	}

	public Medico(int id, String crm, String nome, String email, String senha, String especialidade) {
		this.id = id;
		this.crm = crm;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.especialidade = especialidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
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

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public static boolean loginMedico(String email, String senha) {
		if (ValidaUtil.validaSenhaMedico(email, senha) == true) {
			System.out.println("\nBem vindo!\n");

			return true;
		} else {
			TextosUtil.senhaIncorreta();

			return false;
		}

	}

	@Override
	public String toString() {
		return "\nCRM: " + this.crm + "\nNome: " + this.nome + "\nEmail: " + this.email + "\nSenha: " + this.senha
				+ "\nEspecialidade: " + this.especialidade + "\n";
	}

}