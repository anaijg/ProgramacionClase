package p2;

import java.util.Scanner;

public class Ejercicio07 {
    /*
7. Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a
cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40
minutos.
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los minutos:");
        int minutos = sc.nextInt();
        if (minutos < 0) { // comprobamos que no introduce un número negativo
            System.out.println("Los minutos introducidos deben ser iguales o mayores que 0.");
        } else { // si ha introducido los minutos correctamente, solucionamos el ejercicio dentro de este bloque
            int horas = minutos / 60;
            int resto = minutos % 60;
            System.out.println(minutos + " son " + horas + " horas y " + resto + " minutos.");
        }

    }
}
