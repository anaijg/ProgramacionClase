package variablesDatosOperadores;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        Dado un número de dos dígitos, imprime su primer número (las decenas).
         */
        int num = 95; // lo podría pedir por teclado
        int decenas = num / 10;
        // int unidades = num % 10; esto no me lo piden
        System.out.println("Decenas: " + decenas);

    }
}
