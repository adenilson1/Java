
public class TesteSomatoria {

    public static void main(String[] args) {
        //interaçoes e contador inicializado fora do while
        int contador = 0;
        int total = 0;

        while (contador <= 10) {
            total += contador;// total = total+cotador
            contador++;

        }
        System.out.println(total);//total do somatorio
    }

}
