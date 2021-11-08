package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjemplosArrays {
    public static void main(String[] args) {
        //  conjunto de elementos del mismo tipo: array de ints, de char, de boolean...
        // se almacenan de forma secuencial: en un orden determinado
        // nº de elementos = tamaño (array de tamaño 10 = tiene 10 elementos)
        // no puede cambiarse el tamaño una vez creado
        // sí que pueden cambiarse los elementos que contiene

        // voy a declarar el array del ejemplo, inicializándolo a la vez:
        double[] array = {10.8, 14.3, 13.5, 12.1, 9.7};

        // índice  de los elementos: 0 para el 1º, 1 pare el 2º
        // el índice del elemento que vale 10.8. es 0
        // el índice del elemento que vale 12.1 es 3

        // para recuperar un elemento del array utilizamos su índice
        //System.out.println(array); // devuelve un nº indicador de la posición en memoria
        // diferencia grande con los tipos primitivos

        // Para recuperar los valores:
        System.out.println(array[0]);
        // El último elemento del array: tamaño -1
        // si el array tiene 5 elementos para acceder al último el índice es 4
        System.out.println(array[4]);

        // Si me equivoco y doy un índice que no existe
        //System.out.println(array[5]);

        // CÓMO SE UTILIZAN
        int[] a = new int[5];
        // El array con esto se inicializa al valor por defecto 0
        // Podemos imprimir el contenido de un array así:
        System.out.println(Arrays.toString(a));

        float[] numerosDecimales = new float[]{1.02f, 0.03f, 4f};
        System.out.println(Arrays.toString(numerosDecimales));

        // Longitud de un array
        // Es la variable array.length
        System.out.println("**** Longitud ****");
        System.out.println(array.length);
        System.out.println(a.length);
        System.out.println(numerosDecimales.length);

        // Acceder a los elementos
        System.out.println("Acceder:");
        System.out.println(numerosDecimales[0]);
        System.out.println(numerosDecimales[1]);
        System.out.println(numerosDecimales[2]);


        // Ordenar arrays
        Arrays.sort(numerosDecimales); // ordeno el array
        System.out.println(Arrays.toString(numerosDecimales));

        // Comparar arrays
        int[] num1 = {1, 2, 5, 8};
        int[] num2 = {1, 2, 5};
        int[] num3 = {1, 2, 5, 8};
        System.out.println(Arrays.equals(num1, num2)); // imprime "false"
        System.out.println(Arrays.equals(num1, num3)); // imprime "true"


        // Iterar sobre arrays: recorrerlos

        // Creamos el array

        int[] ej = new int[10];

        //que para cada elemento guarde el valor de su índice.
        for (int i = 0; i < ej.length; i++) {
            ej[i] = i;
        }
        System.out.println("Después del for:");
        System.out.println(Arrays.toString(ej));

        // Crear un array de tamaño 10
        int[] ejemplo2 = new int[10];

        // y rellenarlo con los cuadrados de los
        //        //índices de sus elementos.
        for (int i = 0; i < ejemplo2.length; i++) {
            ejemplo2[i] = i * i;
        }
        System.out.println(Arrays.toString(ejemplo2));

        // Crear array de boolean y rellenar las posiciones pares con true y las impares con false
        boolean[] bol = new boolean[10];
        for (int i = 0; i < bol.length; i++) {
            // si la posición (i) es par
            if (i % 2 == 0) {
                bol[i] = true;
            } else {
                bol[i] = false;
            }
        }
        System.out.println(Arrays.toString(bol));

        //Por ejemplo, supongamos que pedimos que se teclee primero la longitud del array y a continuación los elementos.
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del array:");
        int tamaño = sc.nextInt();

        // Ahora podemos crear el array
        int[] enteros = new int[tamaño];

        // ahora lo rellenamos por teclado
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Número:");
            enteros[i] = sc.nextInt();
        }
        // lo imprimimos
        System.out.println(Arrays.toString(enteros));
    }
}
