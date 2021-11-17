package p2;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        /*
        Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este
tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos
son 3 horas, 30 minutos y 10 segundos.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce segundos: ");
        int segundos = sc.nextInt();
        // comprobamos que sean mayores que 0
        if (segundos < 0) {
            System.out.println("Los segundos introducidos deben ser mayores o iguales que 0.");
        } else { // Si ha introducido los segundos correctamente, entra en este bloque y soluciona el ejercicio
            int horas = segundos / 3600;
            int resto = segundos % 3600; // este resto incluye minutos y segundos
            int minutos = resto / 60;
            int segundosFinales = resto % 60;
            System.out.println(segundos + " son " + horas + " horas, " + minutos + " minutos y " + segundosFinales + " segundos.");
        }

    }
}
