
public class TesteLaco2 {
    public static void main(String[] args) {
        for(int linha =0; linha < 10; linha++){
            for(int coluna=0; coluna <10; coluna++){
                if(coluna > linha){//condicao para sair do laço
                                    // mais interno
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
