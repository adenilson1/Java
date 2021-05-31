package bytebank;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        //invacação do metodo
        conta.deposita(50);
        System.out.println(conta.saldo);

        conta.saca(20);
        System.out.println(conta.saldo);
        //guardando o valro booleano e o saca
        boolean conseguiuRetira = conta.saca(20);
        System.out.println(conseguiuRetira);
        System.out.println(conta.saldo);

        Conta contaNova = new Conta();
        contaNova.deposita(1000);

        //usando metodo tranfere
        if (contaNova.tranfere(400, conta)) {
            System.out.println("Transferencia feita com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println(contaNova.saldo);
        System.out.println(conta.saldo);
        
        //usando a variavel String
        conta.titular="Adenilson";
        System.out.println(conta.titular);

    }

}
