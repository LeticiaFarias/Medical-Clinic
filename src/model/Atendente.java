package model;

public class Atendente {

	private String cpf;
	private String nome;
	private String email; // O email servirá como login;
	private String senha;
	private Telefone telefone;

	public Atendente() {

	}

	public Atendente(String cpf, String nome, String email, String senha, Telefone telefone) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
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

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Usuário Atendente\nCPF: " + this.cpf + "\nNome: " + this.nome + "\nEmail: " + this.email + "\nSenha: "
				+ this.senha + "\nTelefones: " + this.telefone.toString() + "\n";
	}

}
