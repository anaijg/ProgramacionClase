package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio09a {
    public static void main(String[] args) {
      /*
      9. Escribe un programa que pida un nombre de usuario y una contraseña.
      Esos datos se comparan con dos valores guardados previamente.
      Si coinciden, se indica “Has entrado al sistema”,
      en caso contrario se da un error.
       */

        // Ponemos un usuario y un password para comparar
        String usuarioCorrecto = "user";
        String contraseñaCorrecta = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario:");
        String usuario = sc.next();
        System.out.println("Contraseña:");
        String pass = sc.next();

        // si usuario y contraseña son correctas
        if (usuario.equals(usuarioCorrecto) && pass.equals(contraseñaCorrecta)) {
            System.out.println("Has entrado al sistema");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }

    }
}
