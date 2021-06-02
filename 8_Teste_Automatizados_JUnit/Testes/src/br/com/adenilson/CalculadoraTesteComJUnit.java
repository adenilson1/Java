package br.com.adenilson;



import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTesteComJUnit {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora cal = new Calculadora();
		int soma = cal.somar(3, 7);
		
		Assert.assertEquals(10, soma);
		
	}

}
