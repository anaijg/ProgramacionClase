package estructurasDeControl;

public class Ejercicio23 {
    public static void main(String[] args) {
        /*
        23. Hacer un programa que calcule la suma de los números enteros del 1 al 10 (inclusive)
usando el bucle for.
         */
        // vamos a utilizar un sumador
        int suma = 0;
        for (int i = 1; i <= 10; i++) { // 6
            suma = suma + i; // 15 + 6
            System.out.println("i: " + (i) + "\tsuma: " + suma);
        }
        System.out.println("Resultado: " + suma);
    }
}
