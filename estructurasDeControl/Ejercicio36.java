package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
/*
36. Escribe un programa que solicite al usuario un número entre 1 y 100, ambos
inclusive. Si se introduce un número fuera del intervalo debe indicarlo mediante un
error y seguir pidiendo el número hasta que se introduzca el número en el rango
indicado. Al terminar debe imprimir por pantalla el número introducido.
 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Número entre 1 y 100 (ambos inclusive)");
        int n = sc.nextInt();
        // comprobamos si el número introducido está entre 1 y 100
        while (n < 1 || n > 100) { // si introduce un número fuera de rango entonces entra en el while
            System.out.println("Error. Por favor introduce un número entre 1 y 100 (ambos inclusive");
            n = sc.nextInt();
        }
        System.out.println(n);
    }

}
