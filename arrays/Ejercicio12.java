package arrays;

import java.util.Arrays;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*
        12. Rellenar aleatoriamente dos arrays (A y B) de 10 números enteros entre 1 y 10 y
mezclarlos en un tercero de la forma: el 1o de A, el 1o de B, el 2o de A, el 2o de B, etc.
         */

        // creamos los arrays A y B
        int[] A = new int[10];
        int[] B = new int[10];

        // los rellenamos aleatoriamente
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 10 + 1);
            B[i] = (int) (Math.random() * 10 + 1);
        }
        // vamos a ver qué tenemos
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        // creamos el array C
        int[] C = new int[20];

        for (int i = 0; i < C.length; i++) {
            // A rellena las posiciones pares, y B las impares
            if (i % 2 == 0) {
                C[i] = A[i / 2];
            } else {
                C[i] = B[i/2];
            }
        }
        System.out.println(Arrays.toString(C));

    }
}
