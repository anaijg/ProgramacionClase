package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
        3. Haz un programa en el que se cree un array que lea por teclado la longitud que tiene
que tener y a continuación lo inicialice con números aleatorios comprendidos entre 1 y
10. Mostrar la suma de todos los números que se guardan en el array.
         */


        // 1. Creamos teclado
        Scanner sc = new Scanner(System.in);
        // 2. Preguntamos tamaño
        System.out.println("Tamaño del array (nº de elementos):");
        int n = sc.nextInt();
        // 3. Creamos el array
        int[] a = new int[n];
        // 4. Lo llenamos con nºaleatorios
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10 + 1);
        }
        /*
        System.out.println("Al salir del bucle tenemos:");
        System.out.println(Arrays.toString(a));
        // Si queremos ordenarlo
        Arrays.sort(a);
        System.out.println("Ordenado: ");
        System.out.println(Arrays.toString(a));
        */

        // Sumar sus elementos
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        System.out.println("Suma de todos los elementos: " + suma);

    }
}
