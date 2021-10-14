package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        /*
        25. Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuanto deberá pagar finalmente por su compra.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Importe de la compra:");
        double compra = sc.nextDouble();
        // Calculo el descuento
        double descuento = compra * 15 / 100;
        //System.out.println(descuento);
        double total = compra - descuento;
        System.out.println("Importe a pagar: " + total);

    }

}
