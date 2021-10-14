package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        /*
        18. Hacer un programa que lea una temperatura en grados centígrados, y la calcule y
visualice en las escalas: (reamur, Fahrenheit y kelvin). Teniendo en cuenta:
Reamur = Centígrados x 0.8
Fahenheit = (Centígrados * 9/5)+32
Kelvin = Centígrados + 273
         */

        // Leemos temperatura en grados
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperatura en ºC:");
        double centígrados = sc.nextDouble();


        // ¡¡CUIDADO CON LOS PARÉNTESIS!!
        // A la vez que lo muestro lo calculo
        System.out.println("Reamur = " + (centígrados * 0.8));
        System.out.println("Fahenheit = " + ((centígrados * 9/5)+32));
        System.out.println("Kelvin = " + (centígrados + 273));

    }
}
