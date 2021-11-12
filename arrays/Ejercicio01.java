package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*
        1. Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los
muestre en el mismo orden introducido.
         */

        // Tengo que leer por teclado --> necesito un Scanner
        Scanner sc = new Scanner(System.in);

        // Necesito un array de tamaño 5 de double
        double[] a = new double[5];
        System.out.println(Arrays.toString(a));

        // Lo rellenamos por teclado
        /*System.out.println("Número:");
        a[0] = sc.nextDouble();
        System.out.println("Número:");
        a[1] = sc.nextDouble();
        System.out.println(Arrays.toString(a));*/

        for (int i = 0; i < a.length; i++) {
            System.out.println("Número:");
            a[i] = sc.nextDouble();
        }
        System.out.println("Acabo de rellenar el array.");
        System.out.println("Ahora lo imprimo:");
        // Lo imprimo
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }





    }
}
