
public class TesteIR {

    public static void main(String[] args) {

        // De 1900.0 a 2800.0 reais IR de 07,5 % , pode deduzir R$ 142,0
        // De 2800.0 a 3751.0 reais IR de 15,0 % , pode deduzir R$ 350,0
        // De 3751.0 a 4664.0 reias IR de 22,7 % , pode deduzir R$ 636,0
        double salario = 3400.0;
        double valorIR = 0;

        if (salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("Seu salario é de R$ "
                    + salario + ",logo seu IR vai ser de 7,5%");
            valorIR = 142.0;

        } else {
            if (salario > 2800.0 && salario <= 3751.0) {
                System.out.println("Seu salario é de R$ "
                        + salario + ", logo seu IR vai ser de 15%");
                valorIR = 350.0;

            } else {
                if (salario > 3751.0 && salario <= 4664.0) {
                    System.out.println("Seu salario é de R$ "
                            + salario + ", logo seu IR vai ser de 22,5%");
                    valorIR = 636;

                } else {
                    System.out.println("Não pode deduzir");
                }
            }
        }

        System.out.println("O valor da dedução é de R$ "
                + valorIR + "\n");
    }
}
