package estructurasDeControl;

public class EjemploBucleForAnidado {
    public static void main(String[] args) {

        // Es un bucle dentro de otro bucle

        for (int i = 0; i < 5; i++) { // bucle externo: 0, 1, 2, 3, 4  (5 iteraciones) --> normalmente son los valores constantes de cada fila
            System.out.println("Iteración del bucle externo: i=" + i);
            for (int j = 0; j < 10; j++) { // bucle interno: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 (10 iteraciones)
                System.out.print("(i=" + i + ")(j=" + j + ")\t"); // esto suele imprimir una fila: el nº de fila te lo dice i y el nº de columna de lo dice j
            } // cada vez que hace una vuelta el bucle interno quiero que salte de línea
            System.out.println();
        }

        // por cada valor de la i en el bucle externo, se hace un for completo del bucle interno (la j recorre todos sus valores)

    }
}
