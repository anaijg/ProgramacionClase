package arrays;

import java.util.Arrays;

public class Ejercicio05 {
    public static void main(String[] args) {
        /*
        Realizar un programa en el se se inicialice un array de longitud 20 con números
aleatorios comprendidos entre -10 y 10. A continuación, mostrar la media de los
números positivos,la media de los negativos y contar el número de ceros.
         */

        // crear array de enteros tamaño 20
        int[] a = new int[20];

        // rellenarlo con nºs aleatorios entre -10 y 10
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (10 - (-10) + 1) + (-10)); // Math.random() * (max - min + 1) + 1
        }
        // voy a imprimirlo para ver si se ha rellenado bien
        System.out.println(Arrays.toString(a));


        // mostrar la media de los números +, la media de los - y el nº de 0
        int contadorPos = 0, contadorNeg = 0, contadorCeros = 0;
        double sumaPos = 0, sumaNeg = 0;

        // for -> recorrer el array desde 0 hasta 19
        // dentro: si el elemento es positivo... sumarse a sumaPos, incrementar contadorPos
        //         si es negativo... sumarse a sumaNeg, incrementar contadorNeg
        //         si es cero... incrementar contador ceros
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sumaPos = sumaPos + a[i];
                contadorPos++;
            } else if (a[i] < 0) {
                sumaNeg = sumaNeg + a[i];
                contadorNeg++;
            } else {
                contadorCeros++;
            }

        }
        //System.out.println("sumaPos = " + sumaPos);
        //System.out.println("contadorPos = " + contadorPos);

        // al salir del for
        // imprimimos: la media de los positivos
        // la media de los negativos
        // el número de ceros
        double mediaPos = sumaPos / contadorPos;
        double mediaNeg = sumaNeg / contadorNeg;

        System.out.println("Media de positivos = " + mediaPos);
        System.out.println("Media de negativos = " + mediaNeg);
        System.out.println("Número de ceros = " + contadorCeros);

    }
}
