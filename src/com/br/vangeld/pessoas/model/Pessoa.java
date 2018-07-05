//TUDO OK
package com.br.vangeld.pessoas.model;
import com.br.vangeld.endereco.model.*;

public abstract class Pessoa {
	protected static int geraid = 0;
	protected String id;
	protected String nome;
	private Endereco endereco;
	
	protected abstract String gerarID();

	public String getID() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
}
