package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Escribir un programa en el cual se piden cuatro números
        Scanner sc = new Scanner(System.in);
        System.out.println("Número 1:");
        int num1 = sc.nextInt();
        System.out.println("Número 2:");
        int num2 = sc.nextInt();
        System.out.println("Número 3:");
        int num3 = sc.nextInt();
        System.out.println("Número 4:");
        int num4 = sc.nextInt();

        //y se calcule e imprima la suma de los dos primeros y el producto del tercero y el cuarto.
        System.out.println("La suma de " + num1 + " y " + num2 + " es:" + (num1 + num2));
        System.out.println("El producto de " + num3 + " y " + num4 + " es:" + (num3 * num4));
    }
}
