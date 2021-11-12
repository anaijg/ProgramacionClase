import java.util.Arrays;

public class ArraysBidimensionales {
    public static void main(String[] args) {
        // Declaramos una tabla de números enteros
        int[][] tabla = { {0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}}; // tabla es un array de tres arrays con 4 elementos cada uno

        int[][] tabla2 = { {0, 1, 2, 3, 100}, {4, 5, 6}, {8, 9, 10, 11}}; // tabla2 es también un array de tres elementos , pero de diferente número cada uno de ellos


        System.out.println("Longitud del array bidimensional: el número de arrays que lo componen");
        System.out.println("Longitud de tabla: " + tabla.length); // es el nº de filas, porque cada fila es un array
        System.out.println("Longitud de tabla2: " + tabla2.length);

        // Otra cosa es preguntar por el tamaño de uno de los arrays "de dentro"
        // Para eso le tenemos que indicar, igual que con los arrays unidimensionales, el subíndice
        System.out.println("Longitud del primer array de tabla2: " + tabla2[0].length); // longitud de la primera fila
        System.out.println("Longitud del segundo array de tabla2: " + tabla2[1].length);
        System.out.println("Longitud del tercer array de tabla2: " + tabla2[2].length);


        // Si queremos acceder a elementos concretos:
        // Yo lo pienso así: el primer corchete me dice la fila y el segundo me dice la columna
        System.out.println("El tercer elemento de la segunda fila: " + tabla2[1][2]);

        // Para imprimir la tabla completa
        System.out.println("\n\nIMPRIMIMOS LA TABLA COMPLETA");
        for (int i = 0; i < tabla2.length; i++) {
            for (int j = 0; j < tabla2[i].length; j++) {
                System.out.print(tabla2[i][j] + "\t"); // imprimo el elemento de la fila i y de la columna j
            }
            System.out.println();
        }

        for (int[] elem:  tabla2) {
            System.out.println(Arrays.toString(elem));
        }


        for (int[] elem: tabla2) {
            for (int dentro: elem) {
                System.out.print(dentro + " ");
            }
            System.out.println();
        }
    }
}
