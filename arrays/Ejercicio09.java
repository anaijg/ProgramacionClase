package arrays;

import java.util.Arrays;

public class Ejercicio09 {
    public static void main(String[] args) {
        /*
        9. Hacer un programa que inicialice una lista de números con valores aleatorios (10
valores), y los muestre ordenados de menor a mayor.
         */
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(a));
        // Lo ordenamos
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


    }
}
