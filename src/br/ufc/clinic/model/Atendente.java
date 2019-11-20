package br.ufc.clinic.model;

import java.sql.Date;

import javax.persistence.*;

import br.ufc.clinic.util.TextosUtil;
import br.ufc.clinic.util.ValidaUtil;

@Entity
@Table(name = "Atendente")
@NamedQueries({ @NamedQuery(name = "Atendente.findAll", query = "from Atendente"),
		@NamedQuery(name = "Atendente.findByNome", query = "from Atendente a where a.nome = ?1"),
		@NamedQuery(name = "Atendente.findByEmail", query = "from Atendente a where a.email = ?1") })
public class Atendente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "administrador_id")
	private int id;
	private String cpf;
	private String nome;
	private String email;
	private String senha;

	public Atendente() {

	}

	public Atendente(int id, String cpf, String nome, String email, String senha) {
		super();
		this.id = id;
		this.cpf = cpf;
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

	public static void loginAtendente(String email, String senha) {
		if (ValidaUtil.validaEmailAtendente(email) == true) {
			if (ValidaUtil.validaSenhaAtendente(email, senha) == true) {
				System.out.println("\nBem vindo!\n");
			} else {
				TextosUtil.senhaIncorreta();
			}
		} else {
			TextosUtil.emailInexistente();

		}
	}

	public static Agenda cadastrarAgenda(int id, String nomeMedico, String nomeCliente, String cpfCliente, Date date,
			String horario) {
		Agenda agenda = new Agenda(id, nomeMedico, nomeCliente, cpfCliente, date, horario);

		return agenda;
	}

	@Override
	public String toString() {
		return "\nAtendente\nCPF: " + this.cpf + "\nNome: " + this.nome + "\nEmail: " + this.email + "\nSenha: "
				+ this.senha + "\n";
	}

}
