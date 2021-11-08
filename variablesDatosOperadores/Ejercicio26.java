package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        /*
        26. Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.
         */

        // Empezamos pidiendo datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Sueldo base:");
        double base = sc.nextDouble();
        System.out.println("Importe venta 1:");
        double venta1 = sc.nextDouble();
        System.out.println("Importe venta 2:");
        double venta2 = sc.nextDouble();
        System.out.println("Importe venta 3:");
        double venta3 = sc.nextDouble();

        // Hacemos los cálculos
        double ventas = venta1 + venta2 + venta3;
        double comisión = ventas * 10 / 100;
        double sueldo = base + comisión;

        // Mostramos resultado
        System.out.println("Comisión: " + comisión);
        System.out.println("Sueldo total: " + sueldo);

    }
}
