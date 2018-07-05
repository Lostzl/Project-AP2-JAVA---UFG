package com.br.vangeld.pessoas.model;
import com.br.vangeld.endereco.model.*;

public class PessoaFisica extends Pessoa{

	/*
	No m�todo construtor das classes PessoaFisica e PessoaJuridica deve ser checado pelos
	m�todos validaCPF() e validaCNPJ() se os par�metros cpf ou cnpj � valido conforme normas
	vigentes da Receita Federal do Brasil. Caso o CPF ou CNPJ sejam inv�lidos deve-se gerar uma
	exce��o do tipo PessoaException.
	 */

	protected static int geraid = 0;
	private String cpf;
	private Endereco endereco;
	
	public PessoaFisica(String nome, Endereco endereco, String cpf) {
		super.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;	
		geraid++;
	}
	
	
	@Override
	protected String gerarID() {

		return this.getClass().getSimpleName() + " : " + geraid;
	}


	//ATEN��O AQUI!!
	private boolean validaCPF() {

		return false;
	}

	public String getCPF() {
		return cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", endereco=" + endereco + "]";
	}



}
