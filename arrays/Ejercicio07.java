package arrays;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        /*
        7. Realizar un programa que pida un tamaño de array por teclado y a continuación cree un
array formado por elementos aleatorios pares entre 1 y 50.
         */

        // vamos a controlar que el tamaño del array sea un número positivo
        Scanner sc = new Scanner(System.in);
        int tamaño;
        do {
            System.out.println("Introduce tamaño del array:");
            tamaño = sc.nextInt();
            // si además queremos dar un mensaje de error
            if (tamaño < 0)
                System.out.println("Error");
        } while (tamaño < 0 );
        // si llegamos aquí, es que el tamaño es positivo

        // declaramos el array de enteros ese tamaño
        int[] a = new int[tamaño];

        // lo tenemos que rellenar con elementos aleatorios pares
        int número; // para ir guandando lo números aleatorios que se van generando
        int posición = 0; // para ir llevando la posición (el índice) del array
        do {
            número = (int) (Math.random() * 50 + 1);
            // comprobar si es par
            if (número % 2 == 0) {
                // si es par, lo guardamos en el array en la posición que toque
                a[posición] = número;
                // como hemos rellenado esa posición, tenemos que avanzar una posición
                posición++;
            }
            // si no es par el número generado, no hago nada, simplemente pido otro hasta que sea par y avanzo otra posición

        } while (posición < tamaño); // saldremos del bucle cuando lleguemos al final del array


    }
}
