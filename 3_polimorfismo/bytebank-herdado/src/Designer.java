// Gerente herda da classe funcionario

public class Designer extends Funcionario {

    public double getBonificao() {
        System.out.println("Chamando o metodo de bonificacao do Designer");
        return 200.0;
    }
}
