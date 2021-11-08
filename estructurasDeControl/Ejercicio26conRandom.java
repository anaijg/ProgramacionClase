package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio26conRandom {
    public static void main(String[] args) {
        /*
        26. Hacer un programa que genere 10 números del 1 al 100 y calcule su media.
         */


        // Necesito dos variables: una para guardar el número que entra cada vez
        double num = 0;
        // otra para ir acumulando la suma
        double suma = 0;

        for (int i = 0; i < 10; i++) { // también valdría desde 1 mientras <=10
            // aquí genero el número
            num = (int) (Math.random() * 100 + 1);
            System.out.println("num =" + num);
            suma = suma + num;
            System.out.println("Suma en vuelta " + i + ": " + suma); // para saber lo que suma en cada vuelta
        }

        double media = suma / 10;
        System.out.println("Resultado: " + media);
    }
}
