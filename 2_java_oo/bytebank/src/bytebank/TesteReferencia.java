package bytebank;

public class TesteReferencia {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("saldo da primeira conta "
                + primeiraConta.saldo);

        // o objeto Conta tera duas referencias iguais
        // primeiraConta == segundaConta, elas  a ponta 
        // para o mesmo objeto
        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segunda conta  "
                + segundaConta.saldo);

        //atribuindo um valor no saldo da segunda conta
        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta  "
                + segundaConta.saldo);

        // nvov saldo da primeira conta
        System.out.println("saldo da primeira conta "
                + primeiraConta.saldo);

        // Comparando se a primeira e a segunda conta
        // apontam, referenciam, o mesmo objeto
        if (primeiraConta == segundaConta) {
            System.out.println("É a mesma conta");
        }

        System.out.println("espaco da memoria da primeira conta| "
                + primeiraConta + "\n");
        System.out.println("espaco da memoria da segunda conta|  "
                + segundaConta + "\n");

    }

}
