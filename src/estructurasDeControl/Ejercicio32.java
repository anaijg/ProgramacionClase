package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        /*
        32. Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n, siendo n
un número introducido por el usuario.
         */

        // todos los números múltiplos de 5 : (numero % 5 == 0) true --> imprime (el resto no los imprime)
        // entre 1 y n --> hay que recorrerlos todos para ver si son o no son múltiplos de 5
        // n --> lo introducimos por teclado

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        // Otra forma
        System.out.println("\nOtra forma");
        for (int i = 5; i <= n; i+=5) {
            System.out.print(i + " ");
        }


    }
}
