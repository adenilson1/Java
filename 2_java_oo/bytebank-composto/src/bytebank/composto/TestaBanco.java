package bytebank.composto;

public class TestaBanco {

    public static void main(String[] args) {

        //Referncia para a classe Cliente
        Cliente paulo = new Cliente();

        //populando
        paulo.nome = "Paulo";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";

        // Referencia para classe Conta
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        // Associa a classe conta na classe cliente pela referencia paulo
        contaDoPaulo.titular = paulo;

        // mostrando o titular com base no nome do cliete
        System.out.println(contaDoPaulo.titular.nome);
        System.out.println(contaDoPaulo.titular.cpf);
        System.out.println(contaDoPaulo.titular.profissao);
        //endereco da variavel do nome do objeto
        System.out.println(contaDoPaulo.titular);

    }

}
