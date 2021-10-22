package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
/*
31. Hacer un programa que calcule el factorial de un número pedido por teclado. (Ejemplo:
el factorial de 5 sería 5 * 4 * 3 * 2 * 1; el de 4 sería 4* 3 * 2 * 1, etc.)
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Número:");
        int n = sc.nextInt();

        // calculamos el factorial
        int producto = 1;
        for (int i = 1; i <= n; i++) {
            producto = producto * i; //
            //System.out.println("i:" + i + "producto:" + producto);
        }
        System.out.println(n + "! = " + producto);

    }
}
