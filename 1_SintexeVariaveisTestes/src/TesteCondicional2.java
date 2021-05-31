
public class TesteCondicional2 {

    public static void main(String[] args) {
        System.out.println("Testando condicional");
        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        System.out.println("o valor de acompanhado é "
                + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo");

        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}
