package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        /*
        26. Hacer un programa que pida diez números por teclado y calcule su media.
         */
        Scanner sc = new Scanner(System.in);

        // Necesito dos variables: una para guardar el número que entra cada vez
        double num;
        // otra para ir acumulando la suma
        double suma = 0;

        for (int i = 0; i < 10; i++) { // también valdría desde 1 mientras <=10
            System.out.println("Número:");
            num = sc.nextDouble();
            suma = suma + num;
            System.out.println("Suma en vuelta " + i + ": " + suma); // para saber lo que suma en cada vuelta
        }

        double media = suma / 10;
        System.out.println("Resultado: " + media);
    }
}
