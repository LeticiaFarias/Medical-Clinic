package model;

import javax.persistence.*;

@Entity
@Table(name = "Atendentes")
public class Atendente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String cpf;
	private String email;
	private String senha;

	public Atendente() {
	}

	public Atendente(int id, String nome, String cpf, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public void cadastrarCliente() {

	}

	public void pesquisarClientes() {

	}

	public void cadastrarMedicos() {

	}

	public void pesquisarMedicos() {

	}

	public void marcarConsultas() {

	}

	public void visualizarAgenda() {

	}

	public void alterarDadosCadastrados() {

	}

}
