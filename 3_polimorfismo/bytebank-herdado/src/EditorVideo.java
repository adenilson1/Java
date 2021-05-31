// Gerente herda da classe funcionario

public class EditorVideo extends Funcionario {

    public double getBonificao() {
        System.out.println("Chamando o metodo de bonificacao do editor de video");
        return  150.0;
    }
}
