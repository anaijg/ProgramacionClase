package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        4. Dentro de una clase Joven tenemos las variables enteras edad, nivelDeEstudios e ingresos. Necesitamos almacenar en la variable boolean jasp el valor:
a. true, si la edad es menor o igual a 28 y el nivelDeEstudios es mayor que tres, o
bien la edad es menor de 30 y los ingresos superan los 28.000 euros.
b. false, en caso contrario.
Escribe el código necesario.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad:");
        int edad = sc.nextInt();
        System.out.println("Nivel:");
        int nivel = sc.nextInt();
        System.out.println("Ingresos:");
        int ingresos = sc.nextInt();

        boolean jasp;
        if (edad <= 28 && nivel > 3 || edad < 30 && ingresos > 28_000) {
            jasp = true;
        } else {
            jasp = false;
        }

        System.out.println(jasp);

    }
}
