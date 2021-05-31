
public class TesteCondicional {

    public static void main(String[] args) {
        System.out.println("Testendo Codicional");
        int idade = 16;
        int quantidadePessoas = 3;

        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos, pode entrar");
            System.out.println("Seja bem vindo");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("Você não tem 18 anos, "
                        + "ms pode entrar, poid está acompanhado");

            } else {
                System.out.println("Infelizmente você não pode entrar");

            }

        }

    }     

}
