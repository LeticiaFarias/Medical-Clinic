package model;

import java.util.Calendar;

public class Cliente {
	private String cpf;
	private String nome;
	private String email; // Email será o login;
	private String senha;
	private Endereco endereco;
	private Telefone telefone;
	private Calendar dataAniver;

	public Cliente() {

	}

	public Cliente(String cpf, String nome, String email, String senha, Endereco endereco, Telefone telefone,
			Calendar dataAniver) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
		this.telefone = telefone;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Calendar getDataAniver() {
		return dataAniver;
	}

	public void setDataAniver(Calendar dataAniver) {
		this.dataAniver = dataAniver;
	}

	@Override
	public String toString() {
		return "Usuário Cliente \nCPF: " + this.cpf + "\nNome: " + this.nome + "\nEmail=" + this.email + "\nSenha: "
				+ this.senha + "\nEndereco: " + this.endereco.toString() + "\nTelefone: " + this.telefone.toString()
				+ "\nData Aniversário: " + this.dataAniver + "\n";
	}

}
