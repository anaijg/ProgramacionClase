package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio15 {
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
        System.out.println("¿Qué lenguaje estás estudiando?\n1. Java\n2. Kotlin\n3. Scala\n4. Python");
        int opción = sc.nextInt();

        if (opción == 1) {
            System.out.println("¡Sí!");
        } else if (opción >=2 && opción <= 4) { //opción == 2 || opción == 3 || opción == 4
            System.out.println("¡No!");
        } else {
            System.out.println("Opción incorrecta");
        }

    }
}
