package br.ufc.clinic.model;

public class Endereco {

	private String idProprietario; // CPF do proprietário;
	private String numero;
	private String rua;
	private String bairro;
	private String complemento;
	private String cep;

	public Endereco() {

	}

	public Endereco(String idProprietario, String numero, String rua, String bairro, String complemento, String cep) {
		super();
		this.idProprietario = idProprietario;
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
	}

	public String getIdProprietario() {
		return idProprietario;
	}

	public void setIdProprietario(String idProprietario) {
		this.idProprietario = idProprietario;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco\nCPF proprietário: " + this.idProprietario + "\n" + this.numero + "," + this.rua + ","
				+ this.bairro + "," + this.complemento + "," + this.cep + "\n";
	}

}
