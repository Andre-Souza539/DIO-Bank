package br.com.dio.bank;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public double extrato() {
		return super.getSaldo();
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da ContaCorrente ===");
		super.imprimeInfoContas();
	}
}
