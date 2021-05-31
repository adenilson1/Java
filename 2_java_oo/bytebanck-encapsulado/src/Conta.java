
public class Conta {

    //declaracao de atributos
    private double saldo; //encapsulado
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente(); 
    private static int total;
    // variavel sendo a referencia para a classe cliente,
    //desse modo estamos criando um vinculo para as classes contra e cliente
    //nesse caso: ja estamos instanciando a classe, ou seja, toda 
    // que iniciarmos a classe conta ela ja criar um objeto para a 
    // classe cliente.Els é usado quando for interessante para
    // o projeto.

    // criando um construtor
    public Conta(int agencia, int numero) {
        
        // criando um contador 
        Conta.total++;
        //System.out.println("O total de contas é "+Conta.total);
        
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Estou criando uma conta " + this.numero);

    }

    // metodos da classe Conta
    public void deposita(double valor) {
        this.saldo += valor;

    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean tranfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }

    }
    // criacao de metodos para acessar os atributos
    //esse metodo sao do modo camecase

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {//pega numero e retorna
        return this.numero;
    }

    public void setNumero(int numero) {//recebe e configura numero
        if (numero <= 0) {
            System.out.println("Nãoo pode valor menor"
                    + " ou igual a zero");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode valor negativo");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
    
    public static int getTotal(){
        return Conta.total;
    }

}
