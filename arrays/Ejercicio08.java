package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        /*
        8. Realizar un programa que declare un array y lo vaya llenando de números hasta que
introduzcamos un número negativo. Entonces se debe imprimir los elementos que
contiene (el número negativo sólo sirve para finalizar el programa, no entra en el array).
         */

        // declaramos un array
        // suponemos que es de 10 números
        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);
        int número;
        int posición = 0; // necesitamos esta variable para ir moviendo la posición dentro del bucle
        do {
            System.out.println("Número:");
            número = sc.nextInt();
            // comprobar si es negativo
            if (número < 0) break; // si el número es negativo, no lo metemos en el array, saltamos fuera
            // si llegamos aquí es que no es negativo, y entonces lo metemos en el array
            a[posición] = número;
            posición++;
        } while (posición < a.length); // salimos del bucle cuando llegamos al final del array
        System.out.println(Arrays.toString(a));
    }
}
