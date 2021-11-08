package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Escribe un programa que lea un valor entero n de la entrada estándar
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // y muestre el resultado de la siguiente expresión aritmética:
        //((n + 1) * n + 2) * n + 3
        int resultado = ((n + 1) * n + 2) * n + 3;
        System.out.println("Resultado: " + resultado);


    }
}
