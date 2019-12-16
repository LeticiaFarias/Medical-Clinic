package br.ufc.clinic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Telefone.findById", query = "from Telefone t where t.id = ?1") })
public class Telefone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ddd;
	private String numero;
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	public Telefone() {

	}

	public Telefone(int id, String ddd, String numero, Cliente cliente) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.numero = numero;
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "(" + this.ddd + ")" + this.numero + "\n";
	}

}
