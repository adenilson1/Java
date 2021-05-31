package bytebank.composto;

public class Conta {

    //declaracao de atributos
    private double saldo; //encapsulado
    int agencia;
    int numero;
    Cliente titular = new Cliente() ; // variavel sendo a referencia para a classe cliente,
    //desse modo estamos criando um vinculo para as classes contra e cliente
    //nesse caso: ja estamos instanciando a classe, ou seja, toda 
    // que iniciarmos a classe conta ela ja criar um objeto para a 
    // classe cliente.Els é usado quando for interessante para
    // o projeto.
    
    
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
    
    public boolean tranfere(double valor, Conta destino){
        if(this.saldo>=valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }
     
        
    }
      // criacao de metodos para acessar os atributos
    //esse metodo sao do modo camecase
    
      public double  getSaldo(){
        return  this.saldo;
    }
}
