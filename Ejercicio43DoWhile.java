import java.util.Scanner;

public class Ejercicio43DoWhile {
    public static void main(String[] args) {
        /*
        43. Realizar un ejemplo de menú, donde podemos escoger las distintas opciones hasta
que seleccionamos la opción de “Salir”.
         */
        Scanner sc = new Scanner(System.in);

        // Normalmente en el do-while declaramos las variables fuera, antes, y dentro del bucle es donde las asignamos
        int opción;

        do {
            System.out.printf("Menú:\n1.\n2.\n3.\n4. Salir");
            opción = sc.nextInt();
            switch (opción) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción incorrecta.");

            }
        } while (opción != 4); // mientras el usuario no pulse 4 seguimos en el bucle
        // si el while da true, sigues en el bucle; si da false, saltas a la línea siguiente al bucle
        System.out.println("**** FIN ****");
    }
}
