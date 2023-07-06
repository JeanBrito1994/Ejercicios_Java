import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
         * Escribe una función que reciba dos palabras (String) y retorne
         * verdadero o falso (Bool) según sean o no anagramas.
         * - Un Anagrama consiste en formar una palabra reordenando TODAS
         *   las letras de otra palabra inicial.
         * - NO hace falta comprobar que ambas palabras existan.
         * - Dos palabras exactamente iguales no son anagrama.
         */

        Boolean result = isAnagram("paso", "sopa");
        System.out.println(result);
    }

    public static Boolean isAnagram(String first, String second){
        if(first.equals(second)){
            return false;
        }
        char[] firstToChars = first.toLowerCase().toCharArray();
        char[] secondtToChars = second.toLowerCase().toCharArray();
        Arrays.sort(firstToChars);
        Arrays.sort(secondtToChars);

        return Arrays.equals(firstToChars, secondtToChars);
    }
}
