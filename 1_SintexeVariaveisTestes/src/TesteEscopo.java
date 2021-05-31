
public class TesteEscopo {

    public static void main(String[] args) {
        System.out.println("Testendo Escopo");

        int idade = 20;
        int quantidadePessaos = 2;

        boolean acompanhado;

        if (quantidadePessaos >= 2) {
            acompanhado = true;

        } else {
            acompanhado = false;
        }

        System.out.println("valor acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");

        } else {
            System.out.println("infelizmente não pode entrar");
        }
    }
}
