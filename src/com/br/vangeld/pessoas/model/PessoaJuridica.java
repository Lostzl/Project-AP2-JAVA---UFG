package com.br.vangeld.pessoas.model;
import com.br.vangeld.endereco.model.*;

public class PessoaJuridica extends Pessoa{

	@Override
	protected String gerarID() {
		
		return null;
	}
	
	/*
	No m�todo construtor das classes PessoaFisica e PessoaJuridica deve ser checado pelos
	m�todos validaCPF() e validaCNPJ() se os par�metros cpf ou cnpj � valido conforme normas
	vigentes da Receita Federal do Brasil. Caso o CPF ou CNPJ sejam inv�lidos deve-se gerar uma
	exce��o do tipo PessoaException.
	*/
	
	protected static int geraid = 0;
	private String cnpj;
	private Endereco endereco;

	public PessoaJuridica(String nome, Endereco endereco, String cnpj) {
		super.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		
	}
	
	//ATEN��O AQUI!!
	private boolean validaCNPJ() {
	
		return false;
	}

	public String getCNPJ() {
		return cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", endereco=" + endereco + "]";
	}

}
