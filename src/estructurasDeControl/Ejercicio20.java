package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        /*
        20. Escribe un programa que lea dos números enteros positivos, y pida la operación que
quiere realizar con estos (+, -, *, /). El programa debe realizar la operación pedida y
visualizar el resultado. En caso de que el símbolo introducido no sea correcto,
visualizar: operación incorrecta.
         */

        // pido un número entero positivo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int a = sc.nextInt();

        // pido otro número entero positivo
        System.out.println("Introduce otro número:");
        int b = sc.nextInt();

        // operación que quiere realizar con estos (Menú: +, -, *, /) <- los recogemos como char
        System.out.println("Introduce operación (+, -, *, /)");
        char operador = sc.next().charAt(0); // recojo el carácter de la operación por teclado

        // El programa debe realizar la operación pedida y visualizar el resultado. En caso de que el símbolo introducido no sea correcto,
        //visualizar: operación incorrecta.

        // para saber qué operación realizar miro la variable operador, con un switch hago una u otra
        switch (operador) {
            case '+': // si ha introducido + hacemos una suma
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
            default:
                System.out.println("Operación incorrecta");
        }

    }
}
