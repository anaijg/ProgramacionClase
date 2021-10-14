package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
        Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a
cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40
minutos.
         */
        // Recibimos datos
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt(); // Por ejemplo, 1000

        // Procesamos
        int horas = minutos / 60;
        int resto = minutos % 60;

        // Mostrar resultado
        System.out.println("En " + minutos + " minutos hay " + horas + " horas y " + resto + " minutos.");


    }
}
