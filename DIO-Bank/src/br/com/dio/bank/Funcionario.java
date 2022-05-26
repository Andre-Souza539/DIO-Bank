package br.com.dio.bank;

public class Funcionario {

	private String nome;
	private String cargo;
	private double salario;
	public double bonificacao;
	
	
	public Funcionario(String nome){
		this.nome = nome;
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public double getBonificacao() {
		return bonificacao;
	}
	
	
	protected void imprimeInfoFuncionario() {		
		System.out.println(String.format("Nome: %s", this.getNome()));
		System.out.println(String.format("Cargo: %s", this.getCargo()));
		System.out.println(String.format("Bonificacao: %.2f", getBonificacao()));
	}
	
	public void imprimeFuncionario() {
		
	}
}
