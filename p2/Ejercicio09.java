package p2;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        /*
        Ejercicio 8: validar que el momento inicial sea anterior al momento final.
        Escribe un programa que calcule (y muestre) cuántas horas, minutos y segundos han
transcurrido entre dos momentos del mismo día. Para ello, el programa ha de pedir
por teclado seis números enteros: las horas, minutos y segundos para el momento
inicial y lo mismo para el momento final. De momento vamos a considerar que los
números introducidos van a estar en el rango adecuado y que el momento inicial
introducido es menor (o igual) que el momento final. Por ejemplo, si se introducen
los números 1, 2, 30,15, 21, 1 entenderemos que el momento inicial es 1:02:30 am y
el momento final es 15:21:1. El programa debe mostrar por pantalla la diferencia en
el formato: hh:mm:ss.
         */
        // Pedir datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Hora inicial: ");
        int h1 = sc.nextInt(); // 1
        System.out.println("Minutos iniciales: ");
        int m1 = sc.nextInt(); // 2
        System.out.println("Segundos inciiales: ");
        int s1 = sc.nextInt(); // 30

        System.out.println("Hora final: ");
        int h2 = sc.nextInt(); // 15
        System.out.println("Minutos finales: ");
        int m2 = sc.nextInt(); // 21
        System.out.println("Segundos finales: ");
        int s2 = sc.nextInt(); // 1

        // Pasar to-do el momento inicial a segundos
        int h1s = h1 * 3600;
        int m1s = m1 * 60;
        int momento1 = h1s + m1s + s1; // cuántos ss son h1, m1 y s1
        //System.out.println(momento1);

        // Lo mismo con el momento final
        int h2s = h2 * 3600;
        int m2s = m2 *60;
        int momento2 = h2s + m2s + s2; // h2 m2 y s2 expresados en segundos
        //System.out.println(momento2);

        // AQUÍ METEMOS LA COMPROBACIÓN: EL MOMENTO FINAL TIENE QUE SER MAYOR O IGUAL QUE EL MOMENTO INICIAL, Y ESA COMPARACIÓN LA PODEMOS HACER CUANDO TENEMOS PASADO AMBOS MOMENTOS A SEGUNDOS
        if (momento1 > momento2) {
            System.out.println("El momento inicial debe ser anterior al momento final.");
        } else { // si entramos en este bloque es que se han introducido los datos correctamente
            // restas: D = momento2 - momento1
            int D = momento2 - momento1; // en segundos

            // esa D... es el ejercicio que acabamos de hacer
            // ¿cuántas horas hay en D segundos?
            int hD = D / 3600;
            int resto1 = D % 3600;
            int mD = resto1 / 60;
            int sD = resto1 % 60;

            // Muestro los resultados como me los piden:
            System.out.println(hD + ":" + mD + ":" + sD);

/*El programa debe mostrar por pantalla la diferencia en
el formato: hh:mm:ss.  */
        }



    }
}
