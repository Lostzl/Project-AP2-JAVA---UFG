//EM PARTES OK
package com.br.vangeld.endereco.model;

public class Endereco {
	protected static int geraid = 0;
	protected String id;
	private String tipe = "Residencial";
	private String tipoDeLogradouro;
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;


	public Endereco(String tipe, String tipoDeLogradouro, String logradouro, int numero, String bairro, String cidade,
			String estado, String cep) {
		super();
		this.tipe = tipe;
		this.tipoDeLogradouro = tipoDeLogradouro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		geraid++;
	}

	public Endereco(String tipoDeLogradouro, String logradouro, int numero, String bairro, String cidade, String estado,
			String cep) {
		super();
		this.tipoDeLogradouro = tipoDeLogradouro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		geraid++;
	}


	//Atenção aqui!!!
	private String gerarID() {
		return this.getClass().getSimpleName() + " : " + geraid;
	}

	public String getTipe() {
		return tipe;
	}
	protected void setTipe(String tipe) {
		this.tipe = tipe;


	}
	public String getTipoDeLogradouro() {
		return tipoDeLogradouro;
	}
	protected void setTipoDeLogradouro(String tipoDeLogradouro) {
		this.tipoDeLogradouro = tipoDeLogradouro;
	}


	public String getLogradouro() {
		return logradouro;
	}
	protected void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public int getNumero() {
		return numero;
	}
	protected void setNumero(int numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}
	protected void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}
	protected void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}
	protected void setEstado(String estado) {
		this.estado = estado;
	}


	public String getCEP() {
		return cep;
	}
	protected void setCEP(String cep) {
		this.cep = cep;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", tipe=" + tipe + ", tipoDeLogradouro=" + tipoDeLogradouro + ", logradouro="
				+ logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado
				+ ", cep=" + cep + "]";
	}

}
