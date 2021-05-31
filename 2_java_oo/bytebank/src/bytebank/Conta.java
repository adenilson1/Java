package bytebank;

public class Conta {

    //declaracao de atributos
    double saldo;
    int agencia;
    int numero;
    String titular;
    String cpf;
    String profissoa;

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

}
