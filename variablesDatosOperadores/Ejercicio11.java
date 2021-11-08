package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /*
        Dado un número de dos cifras, escribe un programa que permita obtener el número
invertido. Ejemplo, si se introduce 23 que muestre 32.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Número a invertir: ");
        int número = sc.nextInt();

        // separo decenas y unidades
        int decenas = número / 10;
        int unidades = número % 10;

        // ahora lo que antes "pesaba" como unidad ahora tiene que "pesar" como decena
        int invertido = unidades * 10 + decenas;
        System.out.println("Número invertido:" + invertido);


    }
}
