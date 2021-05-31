/* a clsse Autenticavael é uma interface, ou serja uma 
classe que é abstrada e tem todas os metodos 
abstrados.*/

// contrato Autenticavel
 // quem asssinar o contrto precisa
 // implementar o metodo setSenha
 // metodo Autentica

public abstract interface Autenticavel {
    
    
    public abstract void setSenha(int senha) ;

    public abstract boolean autentica(int senha);
    
    
    
}
