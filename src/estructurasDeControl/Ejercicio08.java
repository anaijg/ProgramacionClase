package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        /*
        Haz el ejercicio anterior, pero de forma que el usuario responda con un “sí” o con un “no” (en vez de true/false).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Eres culpable? (sí/no)");
        String culpable = sc.next();

        if (culpable.equals("sí") ) { // con String las comparaciones se hacen con equals()
            System.out.println("A la cárcel");
        } else if (culpable.equals("no")) {
            System.out.println("A casa");
        } else {
            System.out.println("Respuesta incorrecta");
        }

    }
}
