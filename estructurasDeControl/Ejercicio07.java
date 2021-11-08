package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        /*
        7. Escribe un programa que pregunte al usuario si es culpable o no. Asumiremos que:
• En caso afirmativo el usuario responderá true
• En caso contrario responderá false.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Eres culpable? (true/false)");
        boolean culpable = sc.nextBoolean();
        if (culpable) {
            System.out.println("A la cárcel");
        } else {
            System.out.println("A casa");
        }
    }
}
