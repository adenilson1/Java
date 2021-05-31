package bytebank;

class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        // usando operaçẽos java
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        //criando outro objto
        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("A primeira conta tem "
                + primeiraConta.saldo);

        System.out.println("A segunga  conta tem "
                + segundaConta.saldo);

        // chamando ojbjetos sem definir seus atributos
        System.out.println("agencia da primeria conta "
                + primeiraConta.agencia);

        System.out.println("agencia da segunda  conta "
                + segundaConta.agencia);

        //definindo a agencia da primeira conta
        primeiraConta.agencia = 42;
        System.out.println("agencia da primeira conta "
                + primeiraConta.agencia);

        System.out.println("\n");
        // Comparando se as referencias aponta para 
        // a mesmo objeto mesmo tendo a mesma agencia e saldo
        primeiraConta.agencia = 42;
        primeiraConta.saldo = 300;
        System.out.println("agencia primeria Conta "
                + primeiraConta.agencia);
        System.out.println("saldo primeria Conta "
                + primeiraConta.saldo + "\n");

        segundaConta.agencia = 42;
        segundaConta.saldo = 300;
        System.out.println("agencia segunda Conta "
                + primeiraConta.agencia);
        System.out.println("saldo segunda Conta "
                + primeiraConta.saldo + "\n");

        if (primeiraConta == segundaConta) {
            System.out.println("É a mesma conta");
        } else {
            System.out.println("São contas diferentes");
        }

        // espaço da memoria das contas
        System.out.println("espaco da memoria da primeira conta| "
                + primeiraConta + "\n");
        System.out.println("espaco da memoria da segunda conta|  "
                + segundaConta + "\n");

    }

}
