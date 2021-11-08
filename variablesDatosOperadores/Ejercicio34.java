package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        /*
        34. Escribe un programa que lea tres números y compruebe que todos son diferentes, es
decir, no iguales entre sí. El programa debe imprimir un booleano (true o false).
         */
        // Pido tres números enteros
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println((n1 != n2) && (n1 != n3) && (n2 != n3));
    }
}
