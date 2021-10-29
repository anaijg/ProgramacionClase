package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        /*
        39. Dada una secuencia de números enteros (que finaliza con el número 0), encuentra el
elemento más grande de la secuencia. El número 0 no está incluido en la secuencia,
sólo se utiliza para finalizar el programa.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número (0 para finalizar)");
        int n = sc.nextInt();
        int máximo = n; // el primer elemento introducido es de momento el mayor
        while (n != 0) { // hasta que no tengamos que n == 0 (true) vamos a seguir en el bucle
            // ahora, a partir de que entramos aquí pedimos un nuevo número y comparamos
            System.out.println("Introduce un número (0 para finalizar)");
            n = sc.nextInt(); // si aquí introduzco 0 no voy a comparar, saldría del bucle
            if (n != 0) { // sólo si n es != 0 hago la comparación, por eso este if
                if (n > máximo) { // si n es mayor que el máximo almacenado, lo sustituyo
                    máximo = n;
                }
            }
        }
        System.out.println("Máximo = " + máximo);
    }
}
