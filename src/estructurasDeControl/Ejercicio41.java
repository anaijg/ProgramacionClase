package estructurasDeControl;

public class Ejercicio41 {
    public static void main(String[] args) {
        /*
        41. Hacer un programa que imprima por pantalla los 50 primeros múltiplos de 5,
añadiendo un salto de línea cada 10 números.
         */

        // necesitamos variables.
        int i = 1; // la vamos incrementando y probando si es múltiplo de 5
        int contadorDeMúltiplosde5 = 0;

        while (contadorDeMúltiplosde5 < 50) {
            // probamos si es múltiplo
            if (i % 5 == 0) { // aquí tendríamos un múltiplo
                // lo imprimimos
                System.out.print(i + "\t");
                contadorDeMúltiplosde5++;
                if (contadorDeMúltiplosde5 % 10 == 0) {
                    System.out.println();
                }
            }
            i++; // incrementamos la i para la siguiente vuelta
        }


    }
}
