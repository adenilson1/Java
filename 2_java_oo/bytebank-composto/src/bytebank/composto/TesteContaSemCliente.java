
package bytebank.composto;

public class TesteContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.getSaldo());
        
        System.out.println(contaDaMarcela.titular);// null
        
       /* 
        // não foi criado o objeto(cliente)
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);
        */
       
        // agora criando um cliente, fazendo tudo sem referencia
        contaDaMarcela.titular = new Cliente();
        
        System.out.println(contaDaMarcela.titular);
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);
    }
    
}
