package arrays;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        10. Haz un programa que pida al usuario un número de mes (por ejemplo, el 4) y
diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar arrays. Para
simplificarlo vamos a suponer que febrero tiene 28 días.
         */

        // tenemos que pedir un número de mes
        // vamos a controlar que sea el rango 1..12
        Scanner sc = new Scanner(System.in);
        int nMes; // para guardar el número que introduce el usuario
        do {
            System.out.println("Introduce un número de mes");
            nMes = sc.nextInt();
            // para el mensaje de error
            if (nMes < 1 || nMes > 12) System.out.println("Error");
        } while (nMes < 1 || nMes > 12); // mientras meta el número mal, seguimos en el bucle hasta que lo introduzca bien
        // cuando llegamos aquí, ya está el número adecuado

        // Vamos a hacer un array de String con los nombres
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        // otro array con los días
        int[] díasMeses = {31, 28, 31, 30,31, 30, 31, 31, 30, 31, 30, 31};

        // Lo que quiero es mostrar para el mes n, su nombre y sus días
        // Ejemplo: nMes = 4 --> eso es abril, ques nombresMeses[3] y díasMeses[3]..
        System.out.println(nombresMeses[nMes-1] + " tiene " + díasMeses[nMes-1] + " días.");



    }
}
