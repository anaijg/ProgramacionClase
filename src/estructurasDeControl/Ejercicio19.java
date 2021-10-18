package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        /*
        19. Realizar un programa que pida un número entero por teclado y visualice el dia de la
semana correspondiente.
         */

        // Pido un número entero por teclado (1-7)
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7:");
        int num = sc.nextInt();

        // Visualizo el día de la semana
        // si 1 --> "Lunes"
        // si 2 --> "Martes"
        switch (num) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El valor introducido no es correcto");
        }
    }
}
