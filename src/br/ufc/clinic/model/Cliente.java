package br.ufc.clinic.model;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = "Cliente.findAll", query = "from Cliente"),
		@NamedQuery(name = "Cliente.findByNome", query = "from Cliente a where a.nome = ?1"),
		@NamedQuery(name = "Cliente.findByEmail", query = "from Cliente a where a.email = ?1") })
public class Cliente {
	@Id
	@Column(name = "cliente_id")
	private String cpf;
	private String nome;
	private String email; // Email será o login;
	private String senha;
	// private Endereco endereco;
	private Date dataAniver;
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Telefone> telefones;

	public Cliente() {

	}

	public Cliente(String cpf, String nome, String email, String senha,
			/* Endereco endereco, */ List<Telefone> telefones, Date dataAniver) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		// this.endereco = endereco;
		this.telefones = telefones;
		this.dataAniver = dataAniver;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	/*
	 * public Endereco getEndereco() { return endereco; }
	 * 
	 * public void setEndereco(Endereco endereco) { this.endereco = endereco; }
	 */
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Date getDataAniver() {
		return dataAniver;
	}

	public void setDataAniver(Date dataAniver) {
		this.dataAniver = dataAniver;
	}

	@Override
	public String toString() {
		return "Usuário Cliente \nCPF: " + this.cpf + "\nNome: " + this.nome + "\nEmail=" + this.email + "\nSenha: "
				+ this.senha + /* "\nEndereco: " + this.endereco.toString() + */"\nTelefone: "
				+ this.telefones.toString() + "\nData Aniversário: " + this.dataAniver + "\n";
	}

}
