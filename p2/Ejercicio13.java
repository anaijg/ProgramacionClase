package p2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
        13. Escribe un programa que, dado un importe en euros, indique el número mínimo de
billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad.
Por ejemplo:
232 euros: 1 billete de 200, 1 billete de 20, un billete de 10, y sobren 2 euros.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce euros: ");
        int euros = sc.nextInt();
        // comprobamos que el número de euros es positivo o igual a o
        if (euros < 0) {
            System.out.println("La cantidad en euros debe ser igual o mayor que 0");
        } else { // una vez que sabemos que es un nº correcto, resolvemos en este bloque
            int doscientos = euros / 200;
            int resto = euros % 200; // todos los billetes o monedas menores que 200
            int cien = resto / 100;
            resto = resto % 100;
            int cincuenta = resto / 50;
            resto = resto % 50;
            int veinte = resto / 20;
            resto = resto % 20;
            int diez = resto / 10;
            resto = resto % 10;
            int cinco = resto / 5;
            resto = resto % 5;
            int dos = resto / 2;
            resto = resto % 2;

            System.out.print(euros + " euros: ");
            if (doscientos == 1) {
                System.out.print(doscientos + " billete de 200,");
            } else if (doscientos > 1) {
                System.out.print(doscientos + " billetes de 200,");
            }

            if (cien == 1) {
                System.out.print(cien + " billete de 100,");
            } else if (cien > 1) {
                System.out.print(cien + " billetes de 100,");
            }

            if (cincuenta == 1) {
                System.out.print(cincuenta + " billete de 50,");
            } else if (cincuenta > 1) {
                System.out.print(cincuenta + " billetes de 50,");
            }

            if (veinte == 1) {
                System.out.print(veinte + " billete de 20,");
            } else if (veinte > 1) {
                System.out.print(veinte + " billetes de 20,");
            }

            if (diez == 1) {
                System.out.print(diez + " billete de 10,");
            } else if (diez > 1) {
                System.out.print(diez + " billetes de 10,");
            }

            if (cinco == 1) {
                System.out.print(cinco + " billete de 5,");
            } else if (cinco > 1) {
                System.out.print(cinco + " billetes de 5,");
            }

            if (dos == 1) {
                System.out.print(dos + " billete de 2,");
            } else if (dos > 1) {
                System.out.print(dos + " billetes de 2,");
            }
            System.out.print(" y sobran " + resto + " euros.");

        }
    }
}
