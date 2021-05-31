package br.com.bytebank.banco.modelo; 

//br.com.bytebank.banco.modelo.ClaculadoraDeImposto => FQN

public class CalculadorDeImposto {
    private double totalImposto;
    
    public void resgitra(Tributavel t){
       double valor = t.getValorImposto();
       this.totalImposto += valor;
       
    }

    public double getTotalImposto() {
        return totalImposto;
    }
    
    
}
