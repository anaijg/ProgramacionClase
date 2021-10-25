package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        /*
        28. Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un
rectángulo en que la base sea el número mayor y la altura el número menor, con un
carácter también introducido por teclado.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();
        System.out.println("Carácter");
        char c = sc.next().charAt(0);
        
        // vamos a ver cuál es mayor y cuál menor
        int base, altura;
        if (a > b) {
            base = a;
            altura = b;
        } else {
            base = b;
            altura = a;
        }
        // aquí ya sé que la base es el número mayor y la altura el menor
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
