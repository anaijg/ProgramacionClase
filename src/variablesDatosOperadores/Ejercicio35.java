package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        /*
        35. Escribe un programa que lea los números a, b y c y compruebe si existe algún par de
ellos que sumen exactamente 20. El programa debe imprimir un booleano (true o
false).
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a + b == 20) || (a + c == 20) || (b + c == 20));
    }
}
