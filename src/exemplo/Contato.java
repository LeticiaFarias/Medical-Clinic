package exemplo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@NamedQueries({
	@NamedQuery(name="Contato.findAll", query="from Contato"),
	
	
	
	@NamedQuery(name="Contato.findByNome", 
				/*query="from Contato c where c.nome = :nome"*/
				query="from Contato c where c.nome = ?1")
})
public class Contato {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="contato_id")
	private int id;
	
	private String nome;
	
	@OneToOne(mappedBy="contato")
	private Foto foto;
	
	@OneToMany(mappedBy="contato", fetch=FetchType.EAGER)
	private List<Telefone> telefones;
	
	@ManyToMany(mappedBy="contatos")
	private List<Endereco> enderecos;
	
	public Contato() {}
	
	public Contato(String nome) {
		this.nome = nome;
	}
	
	public Contato(int id, String nome, Foto foto, List<Telefone> telefones, List<Endereco> enderecos) {
		this.id = id;
		this.nome = nome;
		this.foto = foto;
		this.telefones = telefones;
		this.enderecos = enderecos;
	}

	// SÓ PRA NÃO DAR ERRO NOS EXEMPLOS ANTERIORES
	public Contato(int id, String nome, String telefone) {}
	
	public Contato(String nome, String telefone) {}


	/* private String telefone;
	
	// @Transient // serve para dizer para um atributo que ele não seja salvo
	
	public Contato(String nome, String telefone) {
		this(0, nome, telefone);
	}
	
	public Contato(int id, String nome, String telefone) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}
	*/

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

	public Foto getFoto() {
		return foto;
	}

	public void setFoto(Foto foto) {
		this.foto = foto;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", foto=" + foto + ", telefones=" + telefones + ", enderecos="
				+ enderecos + "]";
	}

	/*
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	*/

}


