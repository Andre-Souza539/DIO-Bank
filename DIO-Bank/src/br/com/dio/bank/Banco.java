package br.com.dio.bank;

import java.util.List;

public class Banco {
	private String nome = "DioBank";
	private List<Conta> contas;
	
	
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	public String getNome() {
		return nome;
	}
}
