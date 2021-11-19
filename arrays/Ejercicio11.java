package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /*
        11. Haz un programa que declare tres arrays (‘lista1’, ‘lista2’ y ‘lista3’) de cinco enteros cada
uno, pida valores para ‘lista1’ y ‘lista2’ y calcule lista3=lista1+lista2.
         */

        // declaramos 3 arrays de 5 enteros cada uno
        int[] lista1 = new int[5];
        int[] lista2 = new int[5];
        int[] lista3 = new int[5];

        // rellenamos lista1 y lista2 pidiendo valores por teclado
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lista1.length; i++) {
            System.out.println("Valor lista1: ");
            lista1[i] = sc.nextInt();
            System.out.println("Valor lista2:");
            lista2[i] = sc.nextInt();
            // rellenar lista3 así: lista3=lista1+lista2
            lista3[i] = lista1[i] + lista2[i];
        }
        // vamos a ver qué tenemos
        System.out.println(Arrays.toString(lista1));
        System.out.println(Arrays.toString(lista2));
        System.out.println(Arrays.toString(lista3));


    }
}
