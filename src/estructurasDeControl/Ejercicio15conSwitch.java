package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio15conSwitch {
    public static void main(String[] args) {
        /*
        15. Tenemos un programa que pregunta a los estudiantes qué lenguaje de
programación están estudiando. Hay cuatro opciones, una de las cuales es correcta:
a. Java
b. Kotlin
c. Scala
d. Python
Tu tarea consiste en leer el número de respuesta de la entrada estándar y generar
el resultado de la prueba: " ¡Sí! ", " ¡No! " u "Opción desconocida". La respuesta
correcta es Java (obviamente).
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué lenguaje estás estudiando?\na. Java\nb. Kotlin\nc. Scala\nd. Python"); // vamos a ver como se haría teniendo las opciones como letras
        char opción = sc.next().charAt(0); // para recoger por teclado variables de tipo char

        // switch
        switch (opción) {
            case 'a':
                System.out.println("¡Sí!");
                break;
            case 'b': // podemos abreviar quitando los breaks
            case 'c':
            case 'd':
                System.out.println("¡No!");
                break;
            default:
                System.out.println("Opción desconocida");
        }

    }
}
