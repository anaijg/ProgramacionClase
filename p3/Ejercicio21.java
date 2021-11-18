package p3;

import java.util.Scanner;
/**
 * Ejercicio 21 con for
 * @author: Ana I. Jiménez
 */

public class Ejercicio21 {
    public static void main(String[] args) {
        /*
        21. Realiza un programa que pida las notas de las tres evaluaciones del módulo Programación y muestre la nota final (la nota final es la media de las tres evaluaciones).
         */

        Scanner sc = new Scanner(System.in);
        /*System.out.println("1 evaluación:");
        double ev1 = sc.nextDouble();
        System.out.println("2 evaluación:");
        double ev2 = sc.nextDouble();
        System.out.println("3 evaluación:");
        double ev3 = sc.nextDouble();
        double media = (ev1 + ev2 + ev3) / 3;*/

        double ev;
        double suma = 0;
        for (int i = 1; i <= 3 ; i++) {
            System.out.println(i + " evaluación:");
            ev = sc.nextDouble();
            suma = suma + ev;
        }
        //System.out.println("Nota final: " + media);
        double media = suma / 3;
        System.out.printf("Nota final: %.2f", media);
    }
}