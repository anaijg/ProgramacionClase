package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        /*
        33. Escribe un programa que, dados dos números, uno real (base) y un entero positivo
(exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el
método el método Math.pow().
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Base: ");
        double base = sc.nextDouble();
        System.out.println("Exponente: ");
        int exponente = sc.nextInt();

        double potencia = 1;
        for (int i = 1; i <= exponente ; i++) {
            potencia = potencia * base;
        }
        System.out.println("Resultado: " + potencia);

    }
}
