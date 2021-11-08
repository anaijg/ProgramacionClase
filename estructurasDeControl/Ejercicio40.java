package estructurasDeControl;

public class Ejercicio40 {
    public static void main(String[] args) {
        /*
        40. Hacer un programa que imprima por pantalla los veinte primeros múltiplos de 5.
         */

        // i % 5 == 0 --> si pasa esto lo imprime

        // empezamos con i = 1
        int i = 1;
        // vamos a incrementarla de 1 en 1 y probando si el número que tenemos es múltiplo de 5
        // si es múltiplo de 5 --> lo imprimimos y además vamos a llevar la cuenta de los múltiplos que tenemos
        int contadorMúltiplosDe5 = 0;
        do {
            // compruebo si es múltiplo
            if (i % 5 == 0) { // si entra aquí es que hemos encontrado un múltiplo
                System.out.print(i + "\t");
                contadorMúltiplosDe5++;
            }
            // antes de salir del bucle incremento la i para la siguiente vuelta
            i++;
        } while (contadorMúltiplosDe5 < 20);

    }
}
