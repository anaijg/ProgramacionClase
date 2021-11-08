package estructurasDeControl;

import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {

        // ESTRUCTURA CONDICIONAL

        // PRIMER CASO:
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad:");
        int edad = sc.nextInt();
        /*if (edad >= 18) {
            System.out.println("Mayor de edad. Adelante");
        }
        System.out.println("Siguiente instrucción tras el if.");
        */
        // Puedo poner sólo una variable booleana
       /* boolean abierta = false;
        if (abierta) { // abierta == true     !abierta -> abierta == false
            System.out.println("Pasa");
        }
        System.out.println("Después");
        */

        // 2º caso: if - else (2 posibilidades)
        if (edad >= 18) {
            // instrucciones true
            System.out.println("Adelante");
        } else { // edad < 18
            // instrucciones false
            System.out.println("No puedes pasar.");
        }
    }
}
