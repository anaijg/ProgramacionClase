package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        /*
        22. Realiza un programa que pida las notas finales de todos los módulos de 1o y muestre
la nota final del curso. La nota final es la media de las notas de todos los módulos,
redondeada a un número entero (por ejemplo, si la media es 7,5, la nota final es 8; si
es 7,4, la nota final es 7).
         */

        // Realiza un programa que pida las notas finales de todos los módulos de 1o
        Scanner sc = new Scanner(System.in);
        System.out.println("ED:");
        double ed = sc.nextDouble();
        System.out.println("P:");
        double p = sc.nextDouble();
        System.out.println("BBDD:");
        double bbdd = sc.nextDouble();
        System.out.println("LM:");
        double lm = sc.nextDouble();
        System.out.println("SI:");
        double si = sc.nextDouble();
        System.out.println("FOL:");
        double fol = sc.nextDouble();

        // muestre la nota final del curso
        double notaFinal = (ed + p + bbdd + lm + si + fol) / 6;
        System.out.println("Nota final: " + Math.round(notaFinal));


    }
}
