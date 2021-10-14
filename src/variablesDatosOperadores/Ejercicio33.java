package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
       /*
       33. Escribe un programa que lea tres números enteros e imprima true si el primer
número está entre el segundo y el tercero (ambos inclusive). De lo contrario, debe
imprimir false.
        */

        // Pido tres números enteros
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println((n2 < n1) && (n1 < n3));
    }
}
