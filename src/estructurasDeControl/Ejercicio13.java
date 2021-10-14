package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
        13. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la
venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente:
a. Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño
1; y 30 céntimos si es de tamaño 2.
b. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos
cuando es de tamaño 2.
         */

        // Recogemos los datos de todas las variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio inicial:");
        int precioInicial = sc.nextInt(); // precio inicial del kilo de uva
        System.out.println("Tipo de uva (A o B)");
        String tipoUva = sc.next(); // tecleamos A o B
        System.out.println("Tamaño de uva (1 o 2)");
        int tamañoUva = sc.nextInt();
        System.out.println("Kilos de uvas:");
        int kilos = sc.nextInt();

        // Determinamos el valor según el tipo y el tamaño
        int precioFinal; // para guardar el precio que va a tener dependiendo
        if (tipoUva.equals("A")) { // si el tipo de uva es A
            if (tamañoUva == 1) {
                precioFinal = precioInicial + 20;
            } else { // si no es tamaño 1, es tamaño 2
                precioFinal = precioInicial + 30;
            }
        } else { // si el tipo de uva no es "A" entonces entra aquí (es B)
            if (tamañoUva == 1) {
                precioFinal = precioInicial -30;
            } else {
                precioFinal = precioInicial - 50;
            }
        }
        System.out.println(precioFinal * kilos);

    }
}
