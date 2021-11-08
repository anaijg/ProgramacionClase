package ejemplosChar;

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        /*
        42. Hacer un programa que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO
VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
         */

        // con 1 vez
        // Pedimos caracteres
        Scanner sc = new Scanner(System.in);


        // Aclaración:
        // next() --> sólo lee hasta que encuentra un espacio; si empiezo con espacio ni lo llega a leer
        // en este caso, utilizamos nextLine(), que lee, aunque introduzcas espacios, hasta que pulses enter
        char c;

        do {
            System.out.println("Introduce una letra:");
            c = sc.nextLine().charAt(0);

            if (c != ' ') { // pongo esto para que, si se ha introducido un ' ' no me diga 'NO VOCAL"
                // SI NO HA INTRODUCIDO UN ' ', comparo
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
                    System.out.println("Vocal");
                } else {
                    System.out.println("No vocal");
                }
            }

        } while (c != ' ');// 'a' != ' ' -> true; será false cuando c == ' '







    }
}
