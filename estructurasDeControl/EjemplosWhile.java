package estructurasDeControl;

import java.util.Scanner;

public class EjemplosWhile {
    public static void main(String[] args) {
        // for funciona cuando sabes el nº de iteraciones
        /*for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
        }*/

        // while se suele utilizar cuando no sabemos exactamente el nº de iteraciones pero sí la condición en la que tienen que terminar
       int i = 0;
        while (i < 10) { // dentro del paréntesis va una expresión booleana
            // instrucciones
            System.out.println(i + " ");
            // tenemos que cambiar en algún momento i para que pare alguna vez
            i++; // es lo mismo que i = i + 1; i += 1;
        }

        System.out.println("Ejercicio 22 de for, con while");
        /*
        22. Hacer un programa que escriba los valores comprendidos entre 531 y 540 (inclusive).
         */
        i = 531;
        while (i <= 540) {
            //System.out.print(i + " ");
            //i++;
            System.out.print(i++ + " ");
        }

        System.out.println("\n\nEjercicio 23 de for, con while");
        /*
        23. Hacer un programa que calcule la suma de los números enteros del 1 al 10 (inclusive) usando el bucle for.
         */
        int suma = 0;
        i = 1;
        while (i <= 10) {
            //System.out.print("i=" + i + "   suma: " + suma + "\n");
            suma = suma + i;
            i++;
        }
        System.out.println("Suma: " + suma);


        System.out.println("Ejercicio 24 de for, con while");
        /*
        24. Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b,
ambos inclusive.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("a:");
        int a = sc.nextInt();
        System.out.println("b:");
        int b = sc.nextInt();

        suma = 0;
        while (a <= b) {
            suma = suma + a;
            a++;
        }
        System.out.println("Suma: " + suma);


    }

}
