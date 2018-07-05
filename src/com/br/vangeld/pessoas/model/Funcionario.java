package com.br.vangeld.pessoas.model;
import com.br.vangeld.endereco.model.*;

public class Funcionario extends PessoaFisica{
	
	private int geraid = 0;
	private String cargo;
	
	public Funcionario(String nome, Endereco endereco, String cpf, String cargo) {
		super(nome, endereco, cpf);
		this.cargo = cargo;
	}
	
	//ATENÇÃO AQUI!!
	protected String geraID() {
		
		return null;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + "]";
	}
	
}
