//TUDO OK
package com.br.vangeld.contas.model;
import com.br.vangeld.contas.exception.ContaException;
import com.br.vangeld.pessoas.model.*;

public abstract class Conta {
	protected static int geraNumero = 0;
	private int numero;
	private double saldo = 0;
	private Pessoa cliente;
	
	public Conta() {
		geraNumero++;
		this.numero = geraNumero;
	}

	protected int geraNumero() {
		return this.geraNumero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public void deposito(double valor) {
		setSaldo(valor);
	}
	
	public abstract void saque(double valor) throws ContaException;
	
	public abstract String getTipo();
	
}
