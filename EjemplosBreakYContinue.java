public class EjemplosBreakYContinue {
    public static void main(String[] args) {
        // break; -> automáticamente sale del bloque a la instrucción inmediatamente después
        // continue; -> en estructuras repetitivas; cuando aparece, salta inmediatamente a la siguiente iteración

    /*
        int i = 10;
        while (true) { // condición para continuar el bucle
            if (i == 0) { // condición para salir del bucle si sucede este caso
                break;
            }
            i--;
            System.out.println(i);
        }
    }*/

        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + " ");
                if (i == j) {
                    break;
                }
            }
            System.out.println();
        }*/

        /*
        boolean parar = false;
        for (int i = 0; (i < 10) && !parar; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + " ");
                if (i == j) {
                    parar = true;
                    break;
                }
            }
            System.out.println();
        }

         */

        int n = 10;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }

    }

}
