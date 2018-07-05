//TUDO OK
package com.br.vangeld.contas.model;
import com.br.vangeld.contas.exception.ContaException;
import com.br.vangeld.pessoas.model.*;

public class Poupanca extends Conta{

	@Override
	public void saque(double valor) throws ContaException {
		if(valor < getSaldo()) {
			setSaldo(getSaldo() - valor);
		}else if(valor > getSaldo()) {
			throw new ContaException("Saldo Insuficiente Para Realizar a Operação");
		}
	}

	@Override
	public String getTipo() {
		return null;
	}

	public Poupanca(Pessoa cliente) {
		super();
		setCliente(cliente);

	}

}
