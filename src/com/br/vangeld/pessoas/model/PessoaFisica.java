package com.br.vangeld.pessoas.model;
import com.br.vangeld.endereco.model.*;

public class PessoaFisica extends Pessoa{

	/*
	No método construtor das classes PessoaFisica e PessoaJuridica deve ser checado pelos
	métodos validaCPF() e validaCNPJ() se os parâmetros cpf ou cnpj é valido conforme normas
	vigentes da Receita Federal do Brasil. Caso o CPF ou CNPJ sejam inválidos deve-se gerar uma
	exceção do tipo PessoaException.
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


	//ATENÇÃO AQUI!!
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
