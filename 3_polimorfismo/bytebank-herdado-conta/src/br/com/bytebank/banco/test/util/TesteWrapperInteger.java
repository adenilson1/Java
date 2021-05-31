package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int idade = 29; // valor primitivo, uma referenica de objeto, sua 
						// no OO é o Interger.
		
		
		//Integer idadeRef = new Integer(29); // esta riscado , pq um sistema 
											// nos pede para nao fazer isso.
		
		// o jeito correto é 
		Integer idadeRef = Integer.valueOf("29"); // Autoboxing
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue(); // Unboxing
		String s = args[0];// "10"
		//Integer numero =  Integer.valueOf(s);
		int numero = Integer .parseInt(s);
		System.out.println(numero);
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		// Colocando um valor primitivo, objeto, em uma lista 
		
		numeros.add(29);

	}

}
