package br.com.dio.bank;

public abstract class Conta implements IConta {

	private static int COUNTER = 1;
	private static final int AGENCIA_PADRAO = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected String tipo;
	protected Cliente cliente;
	
	/* Construtor */
	public Conta(Cliente cliente) {
		this.cliente = cliente;
		this.numero = COUNTER++;
		this.agencia = AGENCIA_PADRAO;
	}
	
	
	
	@Override
	public void sacar(double valor) {
		if(this.saldo >= valor)
			this.saldo -= valor;
		else
			System.out.println("Saldo Insuficiente!");
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		if(this.saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else { 
			System.out.println("Saldo Insuficiente para transferência!");
		}
	}
	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	

	protected void imprimeInfoContas() {		
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: R$%.2f", this.saldo));
	}
	
	public void imprimirExtrato() {
	}	

}
