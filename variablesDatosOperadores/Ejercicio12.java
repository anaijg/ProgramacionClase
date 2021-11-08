package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea un número de tres cifras y muestre el número invertido.
Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si
introducimos 976, el programa debe mostrar 679.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de tres cifras:");
        int número = sc.nextInt(); // ej: 976

        // separamos decenas, centenas y unidades
        int c = número / 100;
        int resto = número % 100; // este resto son decenas y unidades juntas
        int d = resto / 10;
        int u = resto % 10;

        // ahora hacemos el número invertido
        int invertido = u * 100 + d * 10 + c;
        System.out.println("Invertido: " + invertido);

    }
}
