package variablesDatosOperadores;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
      /*
      31. Escribe un programa que lea un valor por teclado y verifique si es menor que 10. El programa debe imprimir un booleano (true o false).
       */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean menorQue10 = num < 10;
        System.out.println(menorQue10);
     }
}
