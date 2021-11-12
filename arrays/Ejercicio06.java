package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        /*
        6. Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno
(comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media,
la nota más alta que ha sacado y la menor.
         */

        // necesito un teclado
        Scanner sc = new Scanner(System.in);

        // necesito un array de tamaño 5 de números decimales
        double[] notas = new double[5];

        // relleno el array preguntando las 5 notas por teclado --> for de 0 a 4
        for (int i = 0; i < notas.length; i++) {
                notas[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(notas));


        // variables que necesito:
        double suma = 0;
        double max, min; // las inicializaré con el primer elemento del array a[0]
        max = notas[0];
        min = notas[0]; // provisionalmente la primera nota es la mayor y la menor de todas, luego veré si hay otras "mejores"
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i]; // voy sumando nota a nota que me encuentro en el array al recorrerlo; para la media
            if (notas[i] > max) {
                max = notas[i]; // si encuentro una nota mayor que la que tengo en max en ese momento, la reemplazo
            }
            if (notas[i] < min) {
                min = notas[i];
            }
        }

        // al salir del for, ya puedo calcular la media
        System.out.println("Media de las notas = " + suma + " / 5 = " + (suma/5));
        System.out.println("Nota más alta = " + max);
        System.out.println("Nota más baja = " + min);

    }
}
