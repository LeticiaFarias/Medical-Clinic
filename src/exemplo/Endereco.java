package exemplo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "endereco_id")
	private int id;

	private String rua;
	private int numero;

	@ManyToMany
	@JoinTable(name = "contato_endereco", joinColumns = @JoinColumn(name = "endereco_id", referencedColumnName = "endereco_id"), inverseJoinColumns = @JoinColumn(name = "contato_id", referencedColumnName = "contato_id"))
	private List<Contato> contatos;

	public Endereco() {
	}

	public Endereco(String rua, int numero) {
		this(0, rua, numero, null);
	}

	public Endereco(int id, String rua, int numero, List<Contato> contatos) {
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.contatos = contatos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", rua=" + rua + ", numero=" + numero + "]";
	}
}
