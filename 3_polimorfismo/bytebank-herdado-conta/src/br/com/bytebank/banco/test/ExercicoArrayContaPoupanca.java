package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaPoupanca;

public class ExercicoArrayContaPoupanca {

	public static void main(String[] args) {
		
		ContaPoupanca[] contas = new ContaPoupanca[10];
		ContaPoupanca cp1 = new ContaPoupanca(11,22);
		ContaPoupanca cp2 = new ContaPoupanca(33,44);
		
		contas[0] = cp1;
		//contas[1] = cp1;
		contas[4] = cp2;
		//contas[5] = cp2;
		
		ContaPoupanca ref1 = contas[1];
		ContaPoupanca ref2 = contas[4];
		
		System.out.println(contas[1].getNumero());

	}

}
