package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*
        14. El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio.
        La forma de cobrar es la siguiente:
a. si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
b. de 50 a 99 alumnos, el costo es de 70 euros,
c. de 30 a 49, de 95 euros,
d. y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin
importar el número de alumnos.

Escribe un programa que permita determinar el pago a la compañía de autobuses
y lo que debe pagar cada alumno por el viaje.
         */

        // Variables
        int nAlumnos;
        int coste;
        double precioPorAlumno;


        // Pido datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Alumnos:");
        nAlumnos = sc.nextInt();

        // Compruebo, opero...
        if (nAlumnos >= 100) {
            coste = nAlumnos * 65;
        } else if (nAlumnos >= 50 && nAlumnos < 100) { // puedo poner también <=99
            coste = nAlumnos * 70;
        } else if (nAlumnos >= 30 && nAlumnos < 50) { // podría poner también <=49
            coste = nAlumnos * 95;
        } else {
            coste = 4000;
        }

        System.out.println("Hay que abonar a la compañía de autobuses: " + coste + " euros.");

        // Lo que paga cada alumno
        precioPorAlumno = (double) coste / (double) nAlumnos; // si los dejo como enteros va a hacer la división sin decimales; por eso o bien hago casting explícito o cambio la declaración de nAlumnos y coste a double
        System.out.printf("Precio a pagar por alumno %.2f €", precioPorAlumno);

    }
}
