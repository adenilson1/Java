
public class TesteConversao {
    
    public static void main(String[] args){
        double salario = 1270.50;
        int valor = (int) salario; // Casting: transformou-se o double em int
                                   // porem, o valor perdera a parte decimal.
        System.out.println(valor);
        
        // numero long
        long valorGrande = 32432423523l;
        
        // numero short
        short valorPequeno=2131;
        
        // numero byte
        byte b = 127;
        
        // opertação com valore decimais
         double valor1= 0.2;
         double valor2=0.1;
         
         double total=valor1+valor2;
         
         System.out.println(total);
         
         // numero floart
         float f= 3.14f;
         System.out.println(f);
         
    }
    
}
