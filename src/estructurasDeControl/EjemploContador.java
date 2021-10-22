package estructurasDeControl;

import java.util.Scanner;

public class EjemploContador {
    public static void main(String[] args) {
        // meto números y que los vaya contando
        Scanner sc = new Scanner(System.in);

        int contador = 0; // guarda es la cuenta de números introducidos
        int número = 0;  // guarda temporalmente el número que introduzco
        int suma = 0; // va guardando la suma y acumulando con los números en cada vuelta

        // al final quiero imprimir:
        // a) la suma de los números introducidos
        // b) el número de números introducidos


        for (int i = 0; i < 4; i++) {
            System.out.println("Número:");
            número = sc.nextInt();
            suma = suma + número;
            contador++; // cada vez que introduzco un número, incremento el contador
            System.out.print("i=" + i + " suma=" + suma + " contador: " + contador + "\n");
        }
        System.out.println("\n\nSuma total: " + suma + "\n");
        System.out.println("contador = " + contador);
    }
}
