package br.com.adenilson;

public class CalculadoraTesteSemJUnit {
	
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		//1	
		System.out.println(c.somar(3, 7));
		
		//2
		System.out.println(c.somar(3, 0));
		
		//3
		System.out.println(c.somar(0, 0));
		
		//4
		System.out.println(c.somar(3, -1));


	}

}
