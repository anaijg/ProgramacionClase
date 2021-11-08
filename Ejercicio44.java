import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        /*
        44. Escribe un programa que pida números al usuario entre 1 al 100 hasta que éste
adivine un número que el programa ha elegido al azar. El programa debe ir dando
pistas sobre si el número que tiene que adivinar es mayor o es menor que el
introducido. El juego termina cuando te rindes (pulsando 0) o adivinas el número. Si
se introduce un número fuera del intervalo debe dar un mensaje de error.
Para que el programa elija un número al azar utilizamos el método random de la
clase Math:

int numAleatorio = (int) (Math.random() * 100 + 1); max = 100 min = 1
         */
        // El programa elige un número al azar
        int numAleatorio = (int) (Math.random() * 100 + 1); // num = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(numAleatorio);

        // Pido un número al usuario entre 1 y 100
        Scanner sc = new Scanner(System.in);
        int numUsuario; // creo una variable fuera del bucle para guardar la respuesta del usuario

        do {
            System.out.println("Introduce un número entre 1 y 100 (0 para rendirse)");
            numUsuario = sc.nextInt();
            // Comparo los dos números
            if (numUsuario == 0) { // si introduce un 0 es que se rinde
                break; // con la instrucción break saltamos fuera de "donde estemos"
            } else { // si no ha introducido un 0 es que no nos rendimos
                if (numUsuario < 0 || numUsuario > 100) { // si entra aquí es que se ha introducido mal el número y se lo digo
                    System.out.println("El número está fuera del rango solicitado.");
                } else { // si entra aquí es que el número está en el rango correcto, y entonces comparo
                    if (numAleatorio == numUsuario) {
                        System.out.println("¡Adivinaste!");
                    } else if (numAleatorio < numUsuario){
                        System.out.println("El número a adivinar es menor que " + numUsuario);
                    } else {
                        System.out.println("El número a advinar es mayor que " + numUsuario);
                    }
                }
            }
        } while (numUsuario < 0 || numUsuario > 100 || numAleatorio != numUsuario || numUsuario != 0);





    }
}
