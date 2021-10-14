package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        /*
        21. Realiza un programa que pida las notas de las tres evaluaciones del módulo Programación y muestre la nota final (la nota final es la media de las tres evaluaciones).
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("1 evaluación:");
        double ev1 = sc.nextDouble();
        System.out.println("2 evaluación:");
        double ev2 = sc.nextDouble();
        System.out.println("3 evaluación:");
        double ev3 = sc.nextDouble();
        double media = (ev1 + ev2 + ev3) / 3;
        //System.out.println("Nota final: " + media);
        System.out.printf("Nota final: %.2f", media);
    }
}
