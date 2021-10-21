package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*
        24. Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es
menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b,
ambos inclusive.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número:");
        int a = sc.nextInt();
        System.out.println("Segundo número, mayor que el anterior:");
        int b = sc.nextInt();

        int suma = 0;
        for (int i = a; i <= b ; i++) { // a = 5 b = 10 i = 7 suma = 18
            suma = suma + i; // 11 + 7
        }
        System.out.println("Resultado:" + suma);


    }
}
