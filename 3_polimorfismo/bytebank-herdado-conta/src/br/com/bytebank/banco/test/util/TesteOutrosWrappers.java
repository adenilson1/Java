package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue());//unboxing
		
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		//usando a classe mae Number
		
		Number refNumero = Integer.valueOf(29);	

		System.out.println(refNumero.intValue());
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.2);
		lista.add(25.6f);
	}

}
