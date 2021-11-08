package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        /*
        27. Un alumno desea saber cuál será su calificación final en la materia de Algoritmos.
        Dicha calificación se compone de los siguientes porcentajes:
a. 55% del promedio de sus tres calificaciones parciales.
b. 30% de la calificación del examen final.
c. 15% de la calificación de un trabajo final.
         */

        // Pido datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota parcial 1:");
        double p1 = sc.nextDouble();
        System.out.println("Nota parcial 2:");
        double p2 = sc.nextDouble();
        System.out.println("Nota parcial 3:");
        double p3 = sc.nextDouble();
        double mediaParciales = (p1 + p2 + p3) / 3;
        double proporciónParciales = mediaParciales * 55 / 100;

        // Pido examen final
        System.out.println("Nota examen final: ");
        double ef = sc.nextDouble();
        double proporciónEf = ef * 30 / 100;

        // Pido  trabajo final
        System.out.println("Nota trabajo final: ");
        double tf = sc.nextDouble();
        double proporciónTf = tf * 15 / 100;

        // Calculo la nota final
        double notaFinal = proporciónParciales + proporciónEf + proporciónTf;
        System.out.printf("Nota final: %.2f", notaFinal); // muestra 2 decimales


    }
}
