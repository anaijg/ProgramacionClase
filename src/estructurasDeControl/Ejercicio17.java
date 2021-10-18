package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
      /*
      17. Escribe un programa que lea el número de dirección
      (1 - arriba, 2 - abajo, 3 - izquierda, 4 - derecha, 0 – no mover) y muestre el texto « subir », o «bajar», o «
mover a la izquierda », o« mover a la derecha », o« no mover », según el número
introducido). Si es un número que no pertenece a ninguna de las direcciones
enumeradas, el programa debería generar: « ¡error! »
       */

        // presento al usuario un menú
        // 1 - Arriba
        // 2 - Abajo
        // 3 - Izquierda
        // 4 - Derecha
        // 0 - No mover
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Arriba\n" +
                "2 - Abajo\n" +
                "3 - Izquierda\n" +
                "4 - Derecha\n" +
                "0 - No mover");

        // el usuario introduce la opción que sea
        int opción = sc.nextInt();

        // con if else o con switch según el número escribe
        // si 1 --> "subir"
        // si 2 --> "bajar"...

        // con if-else
        /*if (opción == 1) {
            System.out.println("Subir");
        } else if (opción == 2) {
            System.out.println("Bajar");
        } else if (opción == 3) {
            System.out.println("Mover a la izquierda");
        } else if (opción == 4) {
            System.out.println("Mover a la derecha");
        } else if (opción == 0) {
            System.out.println("No mover");
        } else {
            System.out.println("¡Error");
        }*/

        // con switch
        switch (opción) {
            case 1:
                System.out.println("Subir");
                break;
            case 2:
                System.out.println("Bajar");
                break;
            case 3:
                System.out.println("Mover a la izquierda");
                break;
            case 4:
                System.out.println("Mover a la derecha");
                break;
            case 0:
                System.out.println("No mover");
                break;
            default:
                System.out.println("¡Error");
        }
    }
}
