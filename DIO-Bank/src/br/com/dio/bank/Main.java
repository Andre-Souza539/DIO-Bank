package br.com.dio.bank;

public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente andre = new Cliente("André Souza", "Rua Epaminondas", "Programador", 12345, 1234567891);
		
		Conta cc = new ContaCorrente(andre);
		Conta cp = new ContaPoupanca(andre);
		
		Funcionario g1 = new Gerente("João");
		
		cc.depositar(5000);
		cc.transferir(2000, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		g1.imprimeFuncionario();
		
		System.out.println(banco.getNome());
		
		
	}
	

}
