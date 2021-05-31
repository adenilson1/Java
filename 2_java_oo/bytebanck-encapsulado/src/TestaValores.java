
public class TestaValores {

    public static void main(String[] args) {

        // construcao de contador de objtos instaciados
        Conta conta = new Conta(1337, 24226);

        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1337, 24227);
        Conta conta3 = new Conta(1337, 244447);
        
        System.out.println(Conta.getTotal());
        
       

        
    }

}
