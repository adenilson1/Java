// Gerente é um Funcionario, Gerente herda da classe Funcionario,
// assina o contrato Autenticavel, é um Autenticavel. podemos quantos 
// contratos se quiser 

public class Gerente extends Funcionario implements Autenticavel{
    
    private final AutenticacaoUtil autenticador;
    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonificao() {
        System.out.println("Chamdado o metodo bonificacao do gerente");
        return super.getSalario() ;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
        
    }

    @Override
    public boolean autentica(int senha) {
       return this.autenticador.autentica(senha);
       
    }    
        
}

