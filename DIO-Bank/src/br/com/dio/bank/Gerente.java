package br.com.dio.bank;

public class Gerente extends Funcionario {

	public Gerente(String nome) {
		super(nome);
		super.setCargo("Gerente");
		super.setSalario(12000);
		super.setBonificacao(getSalario()*1.1);
	}
	
	@Override
	public void imprimeFuncionario() {
		System.out.println("=== Dados do Gerente ===");
		super.imprimeInfoFuncionario();
	}

}
