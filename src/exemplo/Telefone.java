package exemplo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Telefone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "telefone_id")
	private int id;

	private int ddd;
	private int numero;

	@ManyToOne
	@JoinColumn(name = "contato_id")
	private Contato contato;

	public Telefone() {
	}

	public Telefone(int ddd, int numero, Contato contato) {
		this(0, ddd, numero, contato);
	}

	public Telefone(int id, int ddd, int numero, Contato contato) {
		this.id = id;
		this.ddd = ddd;
		this.numero = numero;
		this.contato = contato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Telefone [id=" + id + ", ddd=" + ddd + ", numero=" + numero + "]";
	}
}
