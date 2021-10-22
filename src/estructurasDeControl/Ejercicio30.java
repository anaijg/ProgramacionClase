package estructurasDeControl;

public class Ejercicio30 {
    public static void main(String[] args) {
        /*
        30. Hacer un programa que calcule la suma y el producto de los 30 primeros números
naturales.
         */
        int suma = 0;
        int producto = 1;
        for (int i = 1; i <= 30 ; i++) {
            suma = suma + i;
            producto = producto * i;
        }
        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
    }
}
