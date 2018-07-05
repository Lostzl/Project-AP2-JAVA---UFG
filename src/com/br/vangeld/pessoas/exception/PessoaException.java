//TUDO OK
package com.br.vangeld.pessoas.exception;

public class PessoaException extends Exception{
	
	public PessoaException(String menssage) {
		super(menssage);
	}

	@Override
	public String toString() {
		return "PessoaException: " + getMessage();
	}
	
}
