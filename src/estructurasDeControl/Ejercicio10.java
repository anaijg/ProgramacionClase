package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
/*
10. Escribe un programa que pida tres números y los muestre ordenados (de mayor a
menor);
 */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Según las posibilidades planteadas, las voy probando una a una
        if (a > b && b > c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a > c && c > b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b > a && a > c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b > c && c > a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c > a && a > b) {
            System.out.println(c + " " + a + " " + b);
        } else {
            System.out.println(c + " " + b + " " + a);
        }
    }
}
