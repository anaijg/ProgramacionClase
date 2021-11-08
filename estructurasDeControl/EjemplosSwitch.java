package estructurasDeControl;

import java.util.Scanner;

public class EjemplosSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int acción = sc.nextInt(); // un valor entre 1 y 4
        /*if (acción == 1) {
            System.out.println("Comenzando una nueva partida...");
        } else if (acción == 2) {
            System.out.println("Cargando una partida guardada");
        } else if (acción == 3) {
            System.out.println("Mostrando la ayuda...");
        } else if (acción == 4) {
            System.out.println("Saliendo...");
        } else {
            System.out.println("Acción no prevista, por favor inténtalo de nuevo");
        }*/

        switch (acción) { // aquí mira cuánto vale la variable
            case 1: // si acción == 1
                System.out.println("Comenzando una nueva partida...");
                break;
            case 2:
                System.out.println("Cargando una partida guardada");
                break;
            case 3:
                System.out.println("Mostrando la ayuda...");
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Acción no prevista, por favor inténtalo de nuevo");
        }

        // Java 14 introduce switch sin break
       /* switch (acción) { // aquí mira cuánto vale la variable
            case 1 ->                 System.out.println("Comenzando una nueva partida...");

            case 2 ->
                System.out.println("Cargando una partida guardada");

            case 3 ->
                System.out.println("Mostrando la ayuda...");

            case 4 ->
                System.out.println("Saliendo...");

            default ->
                System.out.println("Acción no prevista, por favor inténtalo de nuevo");
        } */

    }
}
