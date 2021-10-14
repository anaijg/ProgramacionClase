package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
/*
19. Pide al usuario dos pares de números x1,y1 y x2,y2, que representen dos puntos en el
plano. Calcula y muestra la distancia entre ellos.
 */
        Scanner sc = new Scanner(System.in);
        // Pedir datos
        // Punto 1
        System.out.println("x1:");
        double x1 = sc.nextDouble();
        System.out.println("y1:");
        double y1 = sc.nextDouble();
        System.out.println("x2:");
        double x2 = sc.nextDouble();
        System.out.println("y2:");
        double y2 = sc.nextDouble();

        // Ahora calculo
        double d = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        //System.out.print("Distancia: ");
        //Si quiero mostrarlo con sólo 2 decimales --> printf
        System.out.printf("Distancia: %.2f", d);


    }
}
