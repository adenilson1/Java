
public class Administrador extends Funcionario implements Autenticavel{
    
    private final AutenticacaoUtil autenticador;
    
    public Administrador(){
        this.autenticador = new AutenticacaoUtil();
    }

    
    @Override
    public double getBonificao() {
       return 50;
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
