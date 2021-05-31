package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteComparatorNumeric {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22,33);
		cc1.deposita(333.0);
		
		Conta cc2 = new ContaCorrente(22, 44);
		cc2.deposita(444.0);
		
		Conta cc3 = new ContaCorrente(22,11);
		cc3.deposita(111.0);
		
		Conta cc4 = new ContaCorrente(22, 22);
		cc4.deposita(222.0);
		
		List<Conta> lista = new ArrayList<Conta>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
//		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
//		lista.sort(comparator);
		
		//Essa é a forma de ordenação melhor, a parte da implementacao 
		// na classe mae da interface Comparable.
		lista.sort(null);
		Collections.sort(lista);
		
		System.out.println("------------------------------------------");
		
		for (Conta conta : lista) {
			System.out.println(conta);
			
		}

	}
}
// criando uma nova classe para usar o comparator

class NumeroDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		
		//Comparador de Inteiros 
		return Integer.compare(c1.getNumero(), c2.getNumero());
		
//		return c1.getNumero() - c2.getNumero();
		
//		if(c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		if(c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		
//		
//		return 0;
	}
	
	
}
