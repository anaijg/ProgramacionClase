package p3;

import java.util.Scanner;
/**
 * Ejercicio 20 con for.
 * @author: Ana I. Jiménez
 */

public class Ejercicio20 {
    public static void main(String[] args) {

        /*
        20. Realizar un programa que lea cuatro valores numéricos e imprima su suma y su
media. Ten en cuenta que la media puede contener decimales.
         */

        Scanner sc = new Scanner(System.in);

           /* double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();
            double num4 = sc.nextDouble();
            double suma = num1 + num2 + num3 + num4;
*/
        // Pedimos los números con un for
        double suma = 0;
        int num;
        for (int i = 0; i < 4; i++) {
            num = sc.nextInt();
            suma = suma + num;
        }

        double media = suma / 4;
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);

    }
}
