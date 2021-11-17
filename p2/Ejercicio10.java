package p2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
                /*
        Dado un número de dos dígitos, imprime su primer número (las decenas).
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Validar que el número introducido tenga dos dígitos:
        // o sea, que esté entre 10 y 99
        if (num >= 10 && num <= 99) {
            int decenas = num / 10;
            // int unidades = num % 10; esto no me lo piden
            System.out.println("Decenas: " + decenas);
        } else {
            System.out.println("El número introducido debe tener dos dígitos.");
        }

    }
}
