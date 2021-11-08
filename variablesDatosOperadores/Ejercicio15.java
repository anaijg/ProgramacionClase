package variablesDatosOperadores;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Realiza un programa que calcule el área de una circunferencia de radio 5,2 centímetros.
         */
        double area = Math.PI * 5.2 * 5.2; // esta es una forma de elevar al cuadrado
        System.out.println(area);

        // Otra forma
        double area2 = Math.PI * Math.pow(5.2, 2);
        System.out.println(area2);
        // Cómo mostrar este valor solo con dos decimales: método printf
        System.out.printf("%.2f", area);
    }
}
