package variablesDatosOperadores;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        3. A partir de una variable num1 con valor inicial 12 y una variable num2 con valor
inicial 4,
         */
        int num1 = 12;
        int num2 = 4;

        // rear nuevas variables que almacenen el resultado de realizar la suma, resta,
        //multiplicación, división y resto de num1 y num2
        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        int cociente = num1 / num2;
        int resto = num1 % num2;

        // Mostrar el valor de las nuevas variables por pantalla.
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " x " + num2 + " = " + producto);
        System.out.println(num1 + " / " + num2 + " = " + cociente);
        System.out.println(num1 + " % " + num2 + " = " + resto);

    }
}
