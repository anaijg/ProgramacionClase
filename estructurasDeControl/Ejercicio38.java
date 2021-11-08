package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        /*
        38. Escribe un programa que pida números hasta que se introduzca un cero. Debe
imprimir la suma y la media de todos los números introducidos.
         */

        // necesito para la suma y para la media:
        double suma = 0; // porque la media puede llevar decimales
        int contador = 0;

        // pido número
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número (0 para salir)");
        int n = sc.nextInt();

        // compruebo si es 0; si no es 0, pido otro número....
        while (n != 0) { // si entro aquí es que el número cuenta para el cálculo
            suma = suma + n;
            contador++; // contador = contador + 1;
            System.out.println("Introduce número (0 para salir)");
            n = sc.nextInt(); // antes de salir pido otro número, que será comprobado a la entrada siguiente del bucle
        }
        // si en la línea 26 he introducido 0, al volver a la línea 22 no va a entrar entonces salta el bucle e
        //imprime la suma y la media de todos los números introducidos.
        System.out.println("Suma = " + suma);
        double media = suma / contador;
        System.out.printf("Media = %.2f", media);

    }
}
