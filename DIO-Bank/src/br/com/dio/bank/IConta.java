package br.com.dio.bank;

public interface IConta {
	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor, Conta contaDestino);
	double extrato();
	void imprimirExtrato();
	
}
