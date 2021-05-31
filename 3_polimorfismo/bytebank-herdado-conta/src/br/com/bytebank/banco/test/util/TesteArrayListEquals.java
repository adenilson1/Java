package br.com.bytebank.banco.test.util;


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		
//		Conta cc1 = new ContaCorrente(22,22);
//		Conta cc2 = new ContaCorrente(22,22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
//		
//		// < > se chama Generecs, isso permite tipificar o ArrayList
		//LinkedList<Conta> lista = new LinkedList<Conta>();
		//ArrayList<Conta> lista = new ArrayList<Conta>();
		//List<Conta> lista = new Vector<Conta>(); //Thread safe
		Collection<Conta> lista = new Vector<Conta>(); //Thread safe
		Conta cc = new ContaCorrente(22,11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22,22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22,22);
		
		boolean existe = lista.contains(cc3);
		
		
		System.out.println("Já existe ? "+existe);
		
		
////		//implemento uma regra que confirma que duas referencias sao 
////		//iguais
//		for(Conta conta : lista ) {
//			if(conta.ehIgual(cc3)) {
//				System.out.println("Já existe essa conta");
//			}
//		}
				
		
		for(Object conta : lista) // para cada objeto que se encotra na lista
			System.out.println(conta);
		

	}

}
