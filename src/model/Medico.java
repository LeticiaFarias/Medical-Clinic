package model;

public class Medico {

	private String crm;
	private String nome;
	private String email; // Email é o Login;
	private String senha;
	private String especialidade;
	private Telefone telefone;

	public Medico() {

	}

	public Medico(String crm, String nome, String email, String senha, String especialidade, Telefone telefone) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.especialidade = especialidade;
		this.telefone = telefone;
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

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Usuário Medico\nCRM: " + this.crm + "\nNome: " + this.nome + "\nEmail: " + this.email + "\nSenha: "
				+ this.senha + "\nEspecialidade: " + this.especialidade + "\nTelefones: " + this.telefone.toString()
				+ "\n";
	}

}