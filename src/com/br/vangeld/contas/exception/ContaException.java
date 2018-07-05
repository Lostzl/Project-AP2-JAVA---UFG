//TUDO OK
package com.br.vangeld.contas.exception;

public class ContaException extends Exception {
	
	public ContaException(String menssage) {
		super(menssage);
	}

	@Override
	public String toString() {
		return "menssage: "+ getMessage();
	}
	
	
}
