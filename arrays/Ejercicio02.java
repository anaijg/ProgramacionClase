package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        2. Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los
muestre en el orden inverso al introducido.
         */

        // Creamos scanner
        Scanner sc = new Scanner(System.in);

        // Creamos el array
        double[] a = new double[5];

        // Lo rellenamos con valores que pedimos por teclado
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
        }
        // Para verlos en orden normal antes de darle la vuelta
        System.out.println(Arrays.toString(a));
        System.out.println("Lo imprimimos en orden inverso: ");
        // lo imprimimos en orden inverso: han entrado 0 1 2 3 4 ... los imprimimos en orden 4 3 2 1 0
        // hacemos que el for empiece en 4 y vaya decrementándose hasta llegar al 0
        for (int i = (a.length - 1); i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
