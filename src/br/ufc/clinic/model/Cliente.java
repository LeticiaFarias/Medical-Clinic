package br.ufc.clinic.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import br.ufc.clinic.util.TextosUtil;
import br.ufc.clinic.util.ValidaUtil;

@Entity
@NamedQueries({ @NamedQuery(name = "Cliente.findAll", query = "from Cliente"),
		@NamedQuery(name = "Cliente.findByNome", query = "from Cliente a where a.nome = ?1"),
		@NamedQuery(name = "Cliente.findByEmail", query = "from Cliente a where a.email = ?1") })
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliente_id")
	private int id;
	private String cpf;
	private String nome;
	private String email; // Email será o login;
	private String senha;
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Endereco> enderecos;
	private Date dataAniver;
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Telefone> telefones;

	public Cliente() {

	}

	public Cliente(int id, String cpf, String nome, String email, String senha, List<Endereco> enderecos,
			List<Telefone> telefones, Date dataAniver) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.enderecos = enderecos;
		this.telefones = telefones;
		this.dataAniver = dataAniver;
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

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEndereco(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

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

	public static void loginCliente(String email, String senha) {
		if (ValidaUtil.validaEmailCliente(email) == true) {
			if (ValidaUtil.validaSenhaCliente(email, senha) == true) {
				System.out.println("\nBem vindo!\n");
			} else {
				TextosUtil.senhaIncorreta();
			}
		} else {
			TextosUtil.emailInexistente();

		}
	}

	@Override
	public String toString() {
		return "\nCPF: " + this.cpf + "\nNome: " + this.nome + "\nEmail: " + this.email + "\nSenha: " + this.senha
				+ "\nEndereco: " + this.enderecos.toString() + "\nTelefone: " + this.telefones.toString()
				+ "\nData Aniversário: " + this.dataAniver + "\n";
	}

}
