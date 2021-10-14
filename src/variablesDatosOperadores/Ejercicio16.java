package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*
        16. Realiza un programa que pida el lado de un cuadrado, y muestre por pantalla el
perímetro del mismo (El perímetro de un cuadrado se calcula multiplicando el valor
del lado por cuatro).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lado:");
        double lado = sc.nextDouble();
        double perímetro = lado * 4;
        System.out.println("Perímetro: " + perímetro);
    }
}
