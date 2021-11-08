package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
            /*
    37. Escribe un programa que cuente la cantidad de números que vamos introduciendo
por teclado. Cuando el programa lee 0, debe terminar y mostrar la longitud de la
secuencia (sin contar el 0 final).
     */

        // qué necesito
        // un contador
        int contador = 0;
        // un scanner
        Scanner sc = new Scanner(System.in);
        // pido un número
        System.out.println("Introduce un número (0 para terminar):");
        // una variable para guardar lo que se introduce por teclado
        int n = sc.nextInt();
        // comprobar si vale 0; si es cero, no entro en el bucle (salir)
        // si no es 0,
        while (n != 0) {
            contador++; // como aquí ya me he asegurado que no es 0,
            // incremento el contador y pido otro número
            System.out.println("Introduce un número (0 para terminar):");
            // lo guardo y compruebo si es 0
            n = sc.nextInt();
            // si no es 0, incremento el contador y pido otro número.....
        }

        // PERO si es 0, no entro en el bucle (por tanto, salgo) e imprimo el contador
        System.out.println(contador);



    }
}
