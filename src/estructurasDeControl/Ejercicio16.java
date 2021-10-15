package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*
        16. Harry Potter necesita ayuda para identificar lo que significa cada casa. Lee una
cadena que represente una casa (puedes asociarla a un número para hacer más fácil
la entrada por teclado) y que obtenga lo siguiente:
• si es "gryffindor" , salida "valentía" ;
• si es "hufflepuff" , salida "lealtad" ;
• si es "slytherin" , salida "astucia" ;
• si es "ravenclaw" , salida "intelecto" ;
• de lo contrario, la salida "no es una casa válida" .
         */


        // Pedimos un número de casa por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una casa de Harry Potter:\n1. Gryffindor\n2. Hufflepuff\n3.Slytherin\n4.Ravenclaw");
        int casa = sc.nextInt(); // el usuario introduce 1, 2, 3, 4 o se equivoca

        // según el número introducido, el programa muestra una u otra cualidad
        /*if (casa == 1) {
            System.out.println("Valentía");
        } else if (casa == 2) {
            System.out.println("Lealtad");
        } else if (casa == 3) {
            System.out.println("Astucia");
        } else if (casa == 4) {
            System.out.println("Intelecto");
        } else {
            System.out.println("No es una casa válida");
        }*/

        // con switch



    }
}
