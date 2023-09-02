public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que se encargue de comprobar si un número es o no primo.
         * Hecho esto, imprime los números primos entre 1 y 100.
         */
        for (int i = 0; i < 100; i++){
            if(isPrimo(i)){
                System.out.println(i);
            }
        }
    }


    public static Boolean isPrimo(int numero){
        if (numero <= 1) {
            return false;  // Los números menores o iguales a 1 no son primos
        }
        if (numero <= 3) {
            return true;   // 2 y 3 son primos
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;  // Los números divisibles por 2 o 3 no son primos
        }

        int i = 5;
        while (i * i <= numero) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;  // Si es divisible por cualquier número entre i e i+2, no es primo
            }
            i += 6;
        }

        return true;  // Si no es divisible por ningún número entre 5 y la raíz cuadrada del número, es primo
    }
}
