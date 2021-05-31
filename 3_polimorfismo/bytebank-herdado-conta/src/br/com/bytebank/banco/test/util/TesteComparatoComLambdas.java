package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteComparatoComLambdas {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22,33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);
		
		Conta cc2 = new ContaPoupanca(22,44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);
		
		Conta cc3 = new ContaCorrente(22,11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);
		
		Conta cc4 = new ContaPoupanca(22,22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);
		
		List<Conta> lista = new ArrayList<Conta>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
	
		//Lambda é defina pela seta ('->'), definios os paramatros
		//(Cona c1, Conta c2) = entrada, e a seta (->) para definir o 
		//codigo associado com a entrada. essa é a sintaxe dos Lambdas
		// mais enxuto, sem chaves e so com um ';'.
		lista.sort( (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()) );
		
		//esse é um segundo exemplo de lambda, porem menos enxuto
		Comparator<Conta> comp =  (Conta c1, Conta c2) -> {
				String nomeC1 = c1.getTitular().getNome();
				String nomeC2 = c2.getTitular().getNome();
				return nomeC1.compareTo(nomeC2);		
			
		};
		
		lista.sort(comp);// ordenagem pelo nome
		
		//a lista pode interar tambem por laço com lambda
		// para cada elemento de uma conta imprima
		lista.forEach( (Conta conta) -> System.out.println(conta+", "+ conta.getTitular().getNome()) );
		

	}
}


	



	

