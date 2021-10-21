package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        /*
        25. Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el
segundo. Es decir, pedir dos números enteros por teclado e imprimir la suma de todos
los números enteros desde el menor hasta el mayor, ambos inclusive.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número:");
        int a = sc.nextInt();
        System.out.println("Segundo número:");
        int b = sc.nextInt();

        int suma = 0; // va acumulando el valor de la suma en cada iteración

        // Primera forma
        if (a <= b) {
            for (int i = a; i <= b ; i++) {
                suma = suma + i;
            }
        } else {
            for (int i = b; i <= a ; i++) {
                suma = suma + i;
            }
        }
        System.out.println("Resultado: " + suma);

        // Segunda forma
        int mayor;
        int menor;
        if (a > b) {
            mayor = a;
            menor = b;
        } else {
            mayor = b;
            menor = a;
        }
        for (int i = menor; i <= mayor ; i++) {
            suma = suma + i;
        }
        System.out.println("Resultado: " + suma);

    }
}
