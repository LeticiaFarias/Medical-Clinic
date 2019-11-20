package br.ufc.clinic.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Agenda.findAll", query = "from Agenda") })
public class Agenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "agenda_id")
	private int id;
	private String nomeMedico;
	private String nomeCliente;
	private String cpfCliente;
	private Date date;
	private String horario;

	public Agenda() {

	}

	public Agenda(int id, String nomeMedico, String nomeCliente, String cpfCliente, Date date, String horario) {
		super();
		this.id = id;
		this.nomeMedico = nomeMedico;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.date = date;
		this.horario = horario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "\nData: " + this.date + "\nHorário: " + this.horario + "\nMédico: " + this.nomeMedico + "\nCliente: "
				+ this.nomeCliente + "\nCPF Cliente: " + this.cpfCliente + "\n";
	}

}
