package br.com.dio.bank;

public class Cliente {
	private String nome;
	private String endereco;
	private int CEP;
	private int CPF;
	private double credito;
	private String profissao;

	
	
	
	public Cliente(String nome, String endereco, String profissao,int CEP, int CPF){
		this.nome = nome;
		this.endereco = endereco;
		this.profissao = profissao;
		this.CEP = CEP;
		this.CPF = CPF;
		
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCEP() {
		return CEP;
	}

	public void setCEP(int cEP) {
		CEP = cEP;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
