package arrays;

import java.util.Arrays;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*
        24. Haz un programa que realice lo siguiente:
• Crea una tabla de 5x5 enteros.
• Carga la tabla con valores numéricos enteros.
• Suma todos los elementos de cada fila y todos los elementos de cada columna
visualizando los resultados en pantalla.
         */

        int[][] tabla = {
                {1,1,1,1,1},
                {2,2,2,2,2},
                {3,3,3,3,3},
                {4,4,4,4,4},
                {5,5,5,5,5}
        };

        // creamos dos arrays de 5 posiciones cada uno para guardar las sumas de filas y columnas
        int[] sumaFila = new int[5]; // están a 0
        int[] sumaColumna = new int[5];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                sumaFila[i] = sumaFila[i] + tabla[i][j];
                sumaColumna[j] = sumaColumna[j] + tabla[i][j];
            }
        }

        // Vamos a ver qué tenemos
        System.out.println(Arrays.toString(sumaFila));
        System.out.println(Arrays.toString(sumaColumna));
    }
}
