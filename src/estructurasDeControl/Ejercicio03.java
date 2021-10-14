package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
        3. Escribe un programa que pida dos números e indique si el primero es mayor que el segundo o no.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Número 1:");
        int n1 = sc.nextInt();
        System.out.println("Número 2:");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else { // n1 <= n2
            System.out.println(n1 + " es menor o igual que " + n2);
        }
    }
}
