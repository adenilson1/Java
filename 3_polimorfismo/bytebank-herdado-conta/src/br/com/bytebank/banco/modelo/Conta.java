package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 * @author adenilson
 *
 */
//nota: Comprable define a order natural da listas
public abstract class Conta extends Object implements Comparable<Conta>, Serializable{

    protected double saldo;
    private int agencia;
    private int numero;
    private transient Cliente titular;
    private static int total = 0;
    
    /**
     * COntrutor para inicializar o objeto Conta a parte da agencia
     * e numero
     * 
     * @param agencia
     * @param numero
     */

    public Conta(int agencia, int numero) {
        Conta.total++;
        //System.out.println("O total de conta é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);
    
    /**
     * Valor precisa ser maior do que o saldo
     * 
     * @param valor
     * @throws SaldoInsuficienteException
     */

    public void saca(double valor) throws SaldoInsuficienteException{
        
        
        if (this.saldo < valor) {
            
            throw new SaldoInsuficienteException("Saldo: "+ this.saldo + ","
            + " Valor: "+ valor);
        } 
        this.saldo -= valor;
        
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
          
      
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não pode valor menor ou igual a zero");
            return;
        }
        this.numero = numero;

    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode valor menor igual a zero");
            return;
        }

        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public static int getTotal() {
		return total;
		
	}
    //metodo que faz comparação de referencias
    
    @Override
    public boolean equals(Object ref) {
    	
    	Conta outra = (Conta) ref; // cast para transforma uma refencia
    							   //generica em uma especifica
    	    	
    	if(this.agencia != outra.agencia){
    		return false;
    	}
    	
    	if(this.numero != outra.numero) {
    		return false;
    	}
    	
    	return true;
    }
    
    //Criando o metodo de comparaçao da order natural baseado no saldo da conta
    @Override
    public int compareTo(Conta outra) {
    	   	
    	return Double.compare(this.saldo,outra.saldo);
    }
    
    
    @Override
    public String toString() {
    	return "Numero: "+ this.numero + ", Agencia: "+this.agencia +"Saldo: "+this.saldo;
    }
    
    
    

}
