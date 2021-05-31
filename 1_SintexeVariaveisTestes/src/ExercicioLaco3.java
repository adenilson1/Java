
public class ExercicioLaco3 {

    public static void main(String[] args) {
        //Fatorial de 1 a 10!
        int fatorial = 1;

        for (int contador = 1; contador < 11; contador++) {
            fatorial *= contador;
            System.out.println("Fatorial de " + contador + " é "
                    + fatorial + "\n ");
        }

    }

}
 