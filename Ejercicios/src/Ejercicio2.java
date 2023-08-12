import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que imprima los 50 primeros números de la sucesión
         * de Fibonacci empezando en 0.
         * - La serie Fibonacci se compone por una sucesión de números en
         *   la que el siguiente siempre es la suma de los dos anteriores.
         *   0, 1, 1, 2, 3, 5, 8, 13...
         */

        imprimeFibonacci();
    }

    public static void imprimeFibonacci(){
        List<Long> arrayFibo = new ArrayList<>();
        for (long i = 0 ; i < 50; i++){
            if (arrayFibo.isEmpty()){
                arrayFibo.add(i);
            }else if (arrayFibo.size() == 1){
                arrayFibo.add(i);
            }else{
                Long numero = arrayFibo.get((int) (i-1)) + arrayFibo.get((int) (i-2));
                arrayFibo.add(numero);
            }
            System.out.println(arrayFibo.get((int) i));
        }
    }
}
