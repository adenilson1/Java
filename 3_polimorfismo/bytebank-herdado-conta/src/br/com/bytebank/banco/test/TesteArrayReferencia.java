package br.com.bytebank.banco.test;


import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {

	public static void main(String[] args) {
		
		// valor de referencia de uma array é null
		Conta[] referencias = new Conta[5];
		
		System.out.println(referencias.length);
		
		ContaCorrente cc1 = new ContaCorrente(22,11); // objeto instanciado cc1
		
		referencias[0] = cc1; // copia do cc1 guardado na posicao zero do array contas
		
		ContaPoupanca cc2 = new ContaPoupanca(22,22);
		
//		Cliente cliente = new Cliente();
//		referencias[2] = cliente;
//		
//		referencias[1] = cc2;
		
		//System.out.println(cc2.getNumero());
//		Object referenciaGenerica = contas[1];
//	
//		System.out.println(referenciaGenerica.getNumero());
		
		ContaPoupanca ref = (ContaPoupanca)referencias[1]; // type cast(generecio p especifico)
		
		System.out.println(ref.getNumero());

	}

}
