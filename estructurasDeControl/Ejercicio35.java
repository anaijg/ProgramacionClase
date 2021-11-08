package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        /*
        35. Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado,
siendo n un número introducido por teclado, utilizando asteriscos (*). Por ejemplo,
para n = 5:
*****
****
***
**
*
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5

        for (int i = 0; i < n; i++) { // i= 0, 1, 2, 3, 4
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            } // cada vez que pinto una línea tengo que hacer un salto
            System.out.println();
        }


    }
}
