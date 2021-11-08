package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
       /*
       28. Escribe un programa que lea cuatro números por teclado y decremente cada uno de ellos. El programa debe mostrar los resultados en la misma línea, en el mismo orden que entraron, separados por espacios.
        */
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // 1
        int n2 = sc.nextInt(); // 2
        int n3 = sc.nextInt(); // 3
        int n4 = sc.nextInt(); // 4

        // Decrementarlos
        System.out.println(--n1 + " " + --n2 + " " + --n3 + " " + --n4);
    }
}
