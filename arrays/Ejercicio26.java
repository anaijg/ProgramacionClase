public class Ejercicio26 {
    public static void main(String[] args) {
        /*
        26. Diseñar el algoritmo correspondiente a un programa, que:
• Crea una tabla bidimensional de longitud 5x15 y nombre ‘marco’.
• Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las
posiciones o elementos que delimitan la tabla, es decir, las más externas, mientras
que el resto de los elementos contendrán el valor 0.
• Visualiza el contenido de la matriz en pantalla.

111111111111111
100000000000001
100000000000001
100000000000001
111111111111111
         */


        int[][] marco = new int[5][15];

        // Supongo (y compruebo) que ha añadido los valores por defecto (0)

        // Reemplazo los 0 por 1 en  donde me dicen
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if (i == 0 || i == marco.length -1 || j == 0 || j == marco[0].length - 1)
                    marco[i][j] = 1;
            }
        }



        // IMprimo la tabla
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                System.out.print(marco[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
