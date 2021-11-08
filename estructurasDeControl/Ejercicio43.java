package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        /*
        43. Realizar un ejemplo de menú, donde podemos escoger las distintas opciones hasta
que seleccionamos la opción de “Salir”.
         */

        // Elegir una opción
        // 1. Iniciar --> "iniciado"
        // 2. Continuar --> "continuado"
        // 3. Pausar --> "pausado"
        // 4. Salir
        Scanner sc = new Scanner(System.in);
        System.out.println("Elegir una opción\n" +
                "1. Iniciar\n" +
                "2. Continuar\n" +
                "3. Pausar\n" +
                "4. Salir");
        int n = sc.nextInt();

        while (n != 4) {
            switch (n) {
                case 1:
                    System.out.println("iniciando...");
                    break;
                case 2:
                    System.out.println("continuando...");
                    break;
                case 3:
                    System.out.println("programa pausado");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

            System.out.println("Elegir una opción\n" +
                    "1. Iniciar\n" +
                    "2. Continuar\n" +
                    "3. Pausar\n" +
                    "4. Salir");
            n = sc.nextInt();
        }
        System.out.println("Programa finalizado");


        // Cada vez que pulsas una opción que no sea 4. , seguimos mostrando el menú


        // Cuando salimos que ponga "Finalizado" p
    }
}
