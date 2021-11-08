package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        /*
        17. Calcular el área de un triangulo (base * altura)/2. Resuelve el ejercicio primero con variables de tipo entero y después con variables de tipo float.
         */
        Scanner sc =new Scanner(System.in);
        System.out.println("**** CON VARIABLES DE TIPO ENTERO ****");
        System.out.println("Base: ");
        int base1 = sc.nextInt();
        System.out.println("Altura: ");
        int altura1 = sc.nextInt();
        int área = (base1 * altura1) / 2;
        System.out.println("Área: " + área);

        System.out.println("*** CON VARIABLES DE TIPO FLOAT");
        System.out.println("Base: ");
        float base2 = sc.nextFloat();
        System.out.println("Altura: ");
        float altura2 = sc.nextFloat();
        float área2 = (base2 * altura2) / 2;
        System.out.println("Área: " + área2);

    }
}
