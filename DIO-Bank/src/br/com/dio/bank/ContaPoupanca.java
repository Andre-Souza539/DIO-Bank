package br.com.dio.bank;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public double extrato() {
		return super.getSaldo();
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da ContaPoupança ===");
		super.imprimeInfoContas();
	}
}
