package br.com.adenilson;

public class Banco {

	public void depositarConta(Conta a, double valor) {
		a.depositar(valor);
	
	}

	public void realizaTransferencia(Conta a, double valor, Conta c) {
		a.sacar(valor);
		c.depositar(valor);
	}

}
