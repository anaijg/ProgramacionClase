package estructurasDeControl;

import java.util.Scanner;

public class EjemplosDoWhile {
    public static void main(String[] args) {
        // while: la comprobación se hace ANTES de entrar en el bucle
        // es posible que no se llegue a ejecutar nunca; 0 iteraciones

        // do while es un while con la comprobación al final

        System.out.println("Ejercicio 37 con do while");
        Scanner sc = new Scanner(System.in);

        int n; // declaro la variable fuera para poderla recuperar fuera del bucle más tarde
        int contador = 0;
        do {
            // instrucciones a repetir (o no)
            System.out.println("Introduce un número (0 para terminar)");
            n = sc.nextInt();
            // si esto fuera un 0 (ejercicio 37) no tendría que contarlo
            if (n != 0) {
               contador++;
            }
        } while (n != 0); // te aseguras de al menos ejecutar el codígo una vez
        // ejecuta el código una vez
        System.out.println(contador);
    }
}
