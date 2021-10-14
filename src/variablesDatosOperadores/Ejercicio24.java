package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*  24. Realiza un programa que pida el precio de venta de un producto, la cantidad de
productos comprados y el porcentaje de IVA aplicado. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio de venta: ");
        double precio = sc.nextDouble();

        System.out.println("Cantidad de productos: ");
        int cantidad = sc.nextInt();

        System.out.println("% de IVA: ");
        double IVA = sc.nextDouble();

/* El programa mostrará el importe a abonar.          */

        // Calcular
        double subtotal = precio * cantidad;
        double importeIVA = subtotal * IVA / 100;
        double total = subtotal + importeIVA;

        // Mostrar
        System.out.println("Importe a abonar: " + total + " €.");

    }
}
