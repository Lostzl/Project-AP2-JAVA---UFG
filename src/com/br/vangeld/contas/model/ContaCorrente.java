//EM PARTES OK
package com.br.vangeld.contas.model;
import com.br.vangeld.contas.exception.ContaException;
import com.br.vangeld.pessoas.model.*;

public class ContaCorrente extends Conta{
	private double limite;
	private Poupanca contaPoupanca;

	public ContaCorrente(Pessoa cliente) {
		super();
		setCliente(cliente);
	}

	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void saque(double valor) throws ContaException {
		if(valor < getSaldo()+getLimite()) {
			setSaldo(getSaldo() - valor);
		}else if(valor > getSaldo()+getLimite()){
			throw new ContaException("Saldo Insuficiente Para Realizar a Operação.");
		}
	}

	//ATENÇÃO AQUI!!
	@Override
	public String getTipo() {

		return null;
	}

}
