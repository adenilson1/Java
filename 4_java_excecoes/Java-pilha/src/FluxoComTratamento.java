
public class FluxoComTratamento {
    public static void main(String[] args) {
        System.out.println("Int do main");
        try {
        metodo1();
        }catch (ArithmeticException | NullPointerException ex){
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
        
    }
    
    public static void metodo1() {
        
        System.out.println("Int do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
        
    }
    
    public static void metodo2() {
        
        System.out.println("Int do metodo2");
        
        for (int i = 1; i<=5; i++){
            System.out.println(i);
                int a = i/0;
                //Conta c = null;
                //c.deposita();
            }
            
        
        System.out.println("Fim do metodo2");
    }    
    
}
