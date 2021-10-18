package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        /*
        21. Escribe un programa que responda a un usuario que quiere comprar un helado en
una conocida marca de comida rápida cuanto le costará en función del topping que
elija.
• El helado sin topping cuesta 1.90€.
• El topping de oreo cuesta 1€.
• El topping de KitKat cuesta 1.50€.
• El topping de brownie cuesta 0.75€.
• El topping de lacasitos cuesta 0.95€.
• En caso de no disponer del topping solicitado por el usuario el programa escribirá
por pantalla «no tenemos este topping, lo sentimos. » y a continuación informará
del precio del helado sin ningún topping.
Finalmente, el programa escribe por pantalla el precio del helado con el topping
seleccionado (o ninguno).
   */
        Scanner sc = new Scanner(System.in);
        System.out.println("Menú:\n1. Sin topping\n2. Topping oreo\n3. KitKat\n4. Brownie\n5. Lacasitos");
       int topping = sc.nextInt();

       // Precio del helado sin topping
        double precio = 1.9;

       switch (topping) {
           case 1:
               System.out.println("El helado sin topping cuesta 1.90€. Precio: " + precio);
               break;
           case 2:
               System.out.println("El topping de oreo cuesta 1€. Precio total: " + (precio + 1));
               break;
           case 3:
               System.out.println("El topping de KitKat cuesta 1.50€. Precio total: " + (precio + 1.5));
               break;
           case 4:
               System.out.println("El topping de brownie cuesta 0.75€. Precio total: " + (precio + 0.75));
               break;
           case 5:
               System.out.println("El topping de lacasitos cuesta 0.95€. Precio total: " + (precio + 0.95));
           default:
               System.out.println("No tenemos este topping, lo sentimos");
               System.out.println("El helado sin topping cuesta 1.90€. Precio: " + precio);
       }

    }
}
