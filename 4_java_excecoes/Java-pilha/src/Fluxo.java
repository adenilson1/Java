
public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Int do main");
        try {
        metodo1();
        }catch (Exception ex){ // Exception é chacked generico, recebe qualquer excecao
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
        
    }
    
    private static void metodo1() throws MinhaExcecao{
        
        System.out.println("Int do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
        
    }
    
    private static void metodo2() throws MinhaExcecao  { // assintura do metodo Exception
        
        System.out.println("Int do metodo2");
       
        throw new MinhaExcecao("Deu muito errado");
        
        
        
        //System.out.println("Fim do metodo2");
    }    
    
}
