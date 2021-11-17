package p2;

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas ardillas?");
        int N = sc.nextInt();
        System.out.println("¿Cuántas nueces?");
        int K = sc.nextInt();
        int cociente = 0;
        int resto = 0;
        if ( N > 0 && K > 0) { // bloque true, cumple las condiciones de entrada
             cociente = K / N;
             resto = K % N;
            System.out.println("Las ardillas tocan a " + cociente + " nueces, y sobran " + resto);
        } else {
            System.out.println("Valores incorrectos");
        }

    }
}
