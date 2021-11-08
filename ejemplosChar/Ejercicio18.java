package ejemplosChar;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio18 {
    public static void main(String[] args) {
        /*
        18. [Difícil] Realiza un programa que genere letras aleatoriamente y determine si son
vocales o consonantes.
         */

        // generamos aleatoriamente  un número ---> 30 letras
        // ese número lo convertimos a char según la tabla ASCII
            // ASCII letras minúsculas van del 97 - 122
            // ASCII letras mayúsculas van del 65 - 90
            //int num =  (int) (Math.random() * (max - min + 1) + min)
        char letra;

        for (int i = 0; i < 30; i++) {
            letra = (char) (Math.random() * (90 - 65 + 1) + 65); // para letras mayúsculas: 65-90

            // comprobamos si es vocal o consonante
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                System.out.println("Vocal: " + letra);
            } else {
                System.out.println("Consonante: " + letra);
            }
        }





    }
}
