package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        /*
        29. Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de
multiplicar, hasta llegar a él. (Nota: para que los números queden alineados en columnas
puedes usar el tabulador \t). Ejemplo:
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // tabla de multiplicar
        for (int i = 1; i <= n; i++) {
            System.out.print("Tabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
