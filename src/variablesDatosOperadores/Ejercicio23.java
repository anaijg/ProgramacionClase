package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
       /*
       23. Realiza un programa que pida un número y un porcentaje, y
a. Calcule y muestre ese número incrementado en ese porcentaje.
b. Calcule y muestre ese número decrementado en ese porcentaje.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("n:");
        double n = sc.nextDouble();
        System.out.println("p");
        double p = sc.nextDouble();

        // calculamos la cantidad que supone ese porcentaje
        double porc = n * p / 100;
        System.out.println("El " + p + "% de " + n + " es " + porc);

        // a. Calcule y muestre ese número incrementado en ese porcentaje.
        System.out.println("a) " + n +" incrementado un " + p + "% es: " + (n + porc));
        // b. Calcule y muestre ese número decrementado en ese porcentaje.
        System.out.println("b) " + n + " decrementado un " + p + "% es: " + (n - porc));
    }
}
