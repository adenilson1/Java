package br.com.adenilson;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContaTeste {

	@Test
	public void aoSacarUmValorDeUmaCOntaOSaldoDeveSofrerUmaSubtracaoDesseValor() {
		Conta c = new Conta(200);
		c.sacar(50);
		assertEquals(150, c.getSaldo(),0);
	}

}
