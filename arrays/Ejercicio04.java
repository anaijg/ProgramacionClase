package arrays;

import java.util.Arrays;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        Realizar un programa que inicialice un array con 10 valores aleatorios (del 1 al 10) y
posteriormente muestre en pantalla cada elemento del array junto con su cuadrado y su
cubo.
         */

        //crear array con 10 valores
        int[] a = new int[10];

        // del 1 al 10
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10 + 1); // rellenamos el array con números del 1 al 10
        }
        //System.out.println(Arrays.toString(a)); // imprimimos para ver su contenido

        // mostrar cada elemento del array con su cuadrado y su cubo
        System.out.println("Elemento    cuadrado    cubo");
        System.out.println("============================");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "       " + (a[i]*a[i]) + "         " + Math.pow(a[i], 3));
        }
    }
}
