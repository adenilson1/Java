
public class TesteReferencia {

    public static void main(String[] args) {

        Funcionario g1 = new Gerente();
        //Funcionario g1 = new Gerente();
        /*TOdo gerente é funcionario, porem nem todo 
        funcionario é gerente, porem nao pode 
        usar os metodo do gerente.*/
        /*Funcionario f1 = new Gerente();
        f1.setSalario(2000.0);
        Não existe o objeto funcionario pq a classe Funcionaro
        é tipo abstract, por ser do tipo abstract não pode ser mais
        instanciada
        */
        
        Funcionario v = new EditorVideo();
         v.setSalario(2500.0);
        
        Funcionario d = new Designer();
        d.setSalario(2000.0);
        
        g1.setNome("Marco");
        g1.setSalario(5000.0);
        
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(v);
        controle.registra(d);
        

        System.out.println(controle.getSoma());
       
    }

}
