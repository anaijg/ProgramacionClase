package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*
        Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este
tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos
son 3 horas, 30 minutos y 10 segundos.
         */

        // Recibimos datos
        Scanner sc = new Scanner(System.in);
        int segundos = sc.nextInt(); // Ej: 12610

        // Sacar horas, minutos y segundos
        // De los segundos, sacamos las horas
        // Dividir los segundos entre / 60*60 -> / 3600
        int horas = segundos / 3600; // Según el ejemplo, 3
        int resto1 = segundos % 3600; // de este resto (serían 1810) sacamos los minutos
        int minutos = resto1 / 60; // sería 30
        int resto2 = resto1 % 60; // 10

        // Mostramos el resultado
        System.out.println("En " + segundos + " hay " + horas + " horas,  " + minutos + " minutos y " + resto2 + " segundos.");
    }
}
