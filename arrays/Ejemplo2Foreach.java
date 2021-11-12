import java.util.Arrays;

public class Ejemplo2Foreach {
    public static void main(String[] args) {
        /*
        Crear un array de tamaño 10 y rellenarlo con los cuadrados de los
índices de sus elementos.
         */

        int[] a = {3,5,7,9};

        // quiero reemplazar cada elemento por su cuadrado
        for (int elemento : a) {
            System.out.println(elemento + " ");
        }


    }
}
