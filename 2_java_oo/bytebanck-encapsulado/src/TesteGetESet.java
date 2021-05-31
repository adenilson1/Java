
public class TesteGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(1337,2667);

        conta.setNumero(1337);
        System.out.println(conta.getNumero());
        
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silveira");
        
        conta.setTitular(paulo);
        
        System.out.println(conta.getTitular());
        System.out.println(conta.getTitular().getNome());
        //pega o titular e aponta para nome
        
        conta.getTitular().setProfissao("Programador");
        System.out.println(conta.getTitular().getProfissao());
        //pega o titular e aponta para a profissao
        
        // demosntrando que a contaTitular e o clieneNome(pauloNome)
        //apontam para o mesmo espaço
        
        System.out.println(conta.getTitular());
        System.out.println(paulo);
        

    }

}
