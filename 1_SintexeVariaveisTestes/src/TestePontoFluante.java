
public class TestePontoFluante {
    
    public static void main(String[] args){
    
        double salario;
        salario = 1250.70;
        
        System.out.println("Meu salario é "+salario);
        
        double idade = 37;
        
        //int valor = 3.0; // int nã aceita valor decimal
        
        double divisao = 3.14/2;
        System.out.println(divisao);
        
        int outraDivisao = 5 /2; // ele forçara um resultado inteiro
        System.out.println(outraDivisao);
        
        double novaDivisao = 5/2; // novamente, o valor será inteiro, pq
        // os numeros dos operadores sao inteiro, entao para o java continua 
        // sendo inteiro com inteiro
        System.out.println(novaDivisao);
        
        double novaDivisao1 = 5.0/2; // nesse caso o resultado será double
        // devido um dos operdadores ser decimal
        System.out.println(novaDivisao1);
        
    }
    
}
