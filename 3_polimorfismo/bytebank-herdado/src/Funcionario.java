//Não pode mais instaciar essa classe, pq é abstract
public abstract class Funcionario {


    // Atributos
    private String nome;
    private String cpf;
    private double salario;

    /* Criando o construtor
    public Funcionario() {
        
    }*/

    //metodos proprios
    //metodo sem corpo, não implementacao
    public abstract double getBonificao();

    

    // Metodos get set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
