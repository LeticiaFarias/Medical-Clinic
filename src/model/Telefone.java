package model;

import java.util.List;

public class Telefone {

	private String idProprietario; // CPF do proprietário;
	private List<String> numeros;

	public Telefone() {

	}

	public Telefone(String idProprietario, List<String> numeros) {
		super();
		this.idProprietario = idProprietario;
		this.numeros = numeros;
	}

	public String getIdProprietario() {
		return idProprietario;
	}

	public void setIdProprietario(String idProprietario) {
		this.idProprietario = idProprietario;
	}

	public List<String> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<String> numeros) {
		this.numeros = numeros;
	}

	@Override
	public String toString() {
		return "Telefones \nCPF Proprietario: " + this.idProprietario + "\nNúmeros: " + numeros + "\n";
	}

}
